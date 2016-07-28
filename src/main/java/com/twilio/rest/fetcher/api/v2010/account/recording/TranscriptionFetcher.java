/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.fetcher.api.v2010.account.recording;

import com.twilio.rest.exception.ApiConnectionException;
import com.twilio.rest.exception.ApiException;
import com.twilio.rest.fetcher.Fetcher;
import com.twilio.rest.http.HttpMethod;
import com.twilio.rest.http.Request;
import com.twilio.rest.http.Response;
import com.twilio.rest.http.TwilioRestClient;
import com.twilio.rest.resource.RestException;
import com.twilio.rest.resource.api.v2010.account.recording.Transcription;

public class TranscriptionFetcher extends Fetcher<Transcription> {
    private String accountSid;
    private final String recordingSid;
    private final String sid;

    /**
     * Construct a new TranscriptionFetcher.
     * 
     * @param recordingSid The recording_sid
     * @param sid The sid
     */
    public TranscriptionFetcher(final String recordingSid, 
                                final String sid) {
        this.recordingSid = recordingSid;
        this.sid = sid;
    }

    /**
     * Construct a new TranscriptionFetcher.
     * 
     * @param accountSid The account_sid
     * @param recordingSid The recording_sid
     * @param sid The sid
     */
    public TranscriptionFetcher(final String accountSid, 
                                final String recordingSid, 
                                final String sid) {
        this.accountSid = accountSid;
        this.recordingSid = recordingSid;
        this.sid = sid;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Fetched Transcription
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Transcription execute(final TwilioRestClient client) {
        this.accountSid = this.accountSid == null ? client.getAccountSid() : this.accountSid;
        Request request = new Request(
            HttpMethod.GET,
            TwilioRestClient.Domains.API,
            "/2010-04-01/Accounts/" + this.accountSid + "/Recordings/" + this.recordingSid + "/Transcriptions/" + this.sid + ".json",
            client.getRegion()
        );
        
        Response response = client.request(request);
        
        if (response == null) {
            throw new ApiConnectionException("Transcription fetch failed: Unable to connect to server");
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
        
        return Transcription.fromJson(response.getStream(), client.getObjectMapper());
    }
}