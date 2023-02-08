/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Flex
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.flexapi.v1;

import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import com.twilio.base.Page;



public class InsightsQuestionnairesCategoryReader extends Reader<InsightsQuestionnairesCategory> {
    private String token;
    private Integer pageSize;

    public InsightsQuestionnairesCategoryReader(){
    }

    public InsightsQuestionnairesCategoryReader setToken(final String token){
        this.token = token;
        return this;
    }
    public InsightsQuestionnairesCategoryReader setPageSize(final Integer pageSize){
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<InsightsQuestionnairesCategory> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<InsightsQuestionnairesCategory> firstPage(final TwilioRestClient client) {
        String path = "/v1/Insights/QM/Categories";

        Request request = new Request(
            HttpMethod.GET,
            Domains.FLEXAPI.toString(),
            path
        );

        addQueryParams(request);
        addHeaderParams(request);
        return pageForRequest(client, request);
    }

    private Page<InsightsQuestionnairesCategory> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("InsightsQuestionnairesCategory read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "categories",
            response.getContent(),
            InsightsQuestionnairesCategory.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<InsightsQuestionnairesCategory> previousPage(final Page<InsightsQuestionnairesCategory> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.FLEXAPI.toString())
        );
        return pageForRequest(client, request);
    }


    @Override
    public Page<InsightsQuestionnairesCategory> nextPage(final Page<InsightsQuestionnairesCategory> page, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.FLEXAPI.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<InsightsQuestionnairesCategory> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }
    private void addHeaderParams(final Request request) {
        if (token != null) {
            request.addHeaderParam("Token", token);

        }
    }
    private void addQueryParams(final Request request) {
        if (pageSize != null) {
    
            request.addQueryParam("PageSize", pageSize.toString());
        }

        if(getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}
