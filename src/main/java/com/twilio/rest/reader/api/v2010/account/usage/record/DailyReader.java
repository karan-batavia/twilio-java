/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.reader.api.v2010.account.usage.record;

import com.twilio.rest.exception.ApiConnectionException;
import com.twilio.rest.exception.ApiException;
import com.twilio.rest.http.HttpMethod;
import com.twilio.rest.http.Request;
import com.twilio.rest.http.Response;
import com.twilio.rest.http.TwilioRestClient;
import com.twilio.rest.reader.Reader;
import com.twilio.rest.resource.Page;
import com.twilio.rest.resource.ResourceSet;
import com.twilio.rest.resource.RestException;
import com.twilio.rest.resource.api.v2010.account.usage.record.Daily;

public class DailyReader extends Reader<Daily> {
    private String accountSid;

    /**
     * Construct a new DailyReader.
     */
    public DailyReader() {
    }

    /**
     * Construct a new DailyReader.
     * 
     * @param accountSid The account_sid
     */
    public DailyReader(final String accountSid) {
        this.accountSid = accountSid;
    }

    /**
     * Make the request to the Twilio API to perform the read.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Daily ResourceSet
     */
    @Override
    public ResourceSet<Daily> execute(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage());
    }

    /**
     * Make the request to the Twilio API to perform the read.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Daily ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Daily> firstPage(final TwilioRestClient client) {
        this.accountSid = this.accountSid == null ? client.getAccountSid() : this.accountSid;
        Request request = new Request(
            HttpMethod.GET,
            TwilioRestClient.Domains.API,
            "/2010-04-01/Accounts/" + this.accountSid + "/Usage/Records/Daily.json",
            client.getRegion()
        );
        
        addQueryParams(request);
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the next page from the Twilio API.
     * 
     * @param page current page
     * @param client TwilioRestClient with which to make the request
     * @return Next Page
     */
    @Override
    public Page<Daily> nextPage(final Page<Daily> page, 
                                final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            TwilioRestClient.Domains.API,
            page.getNextPageUri(),
            client.getRegion()
        );
        return pageForRequest(client, request);
    }

    /**
     * Generate a Page of Daily Resources for a given request.
     * 
     * @param client TwilioRestClient with which to make the request
     * @param request Request to generate a page for
     * @return Page for the Request
     */
    private Page<Daily> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);
        
        if (response == null) {
            throw new ApiConnectionException("Daily read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
        
            throw new ApiException(
                restException.getMessage(),
                restException.getCode(),
                restException.getMoreInfo(),
                restException.getStatus(),
                null
            );
        }
        
        return Page.fromJson(
            "usage_records",
            response.getContent(),
            Daily.class,
            client.getObjectMapper()
        );
    }

    /**
     * Add the requested query string arguments to the Request.
     * 
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        request.addQueryParam("PageSize", Integer.toString(getPageSize()));
    }
}