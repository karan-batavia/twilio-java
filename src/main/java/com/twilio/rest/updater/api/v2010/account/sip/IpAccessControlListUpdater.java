/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.rest.updater.api.v2010.account.sip;

import com.twilio.rest.exception.ApiConnectionException;
import com.twilio.rest.exception.ApiException;
import com.twilio.rest.http.HttpMethod;
import com.twilio.rest.http.Request;
import com.twilio.rest.http.Response;
import com.twilio.rest.http.TwilioRestClient;
import com.twilio.rest.resource.RestException;
import com.twilio.rest.resource.api.v2010.account.sip.IpAccessControlList;
import com.twilio.rest.updater.Updater;

public class IpAccessControlListUpdater extends Updater<IpAccessControlList> {
    private String accountSid;
    private final String sid;
    private final String friendlyName;

    /**
     * Construct a new IpAccessControlListUpdater.
     * 
     * @param sid The sid
     * @param friendlyName A human readable description of this resource
     */
    public IpAccessControlListUpdater(final String sid, 
                                      final String friendlyName) {
        this.sid = sid;
        this.friendlyName = friendlyName;
    }

    /**
     * Construct a new IpAccessControlListUpdater.
     * 
     * @param accountSid The account_sid
     * @param sid The sid
     * @param friendlyName A human readable description of this resource
     */
    public IpAccessControlListUpdater(final String accountSid, 
                                      final String sid, 
                                      final String friendlyName) {
        this.accountSid = accountSid;
        this.sid = sid;
        this.friendlyName = friendlyName;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Updated IpAccessControlList
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public IpAccessControlList execute(final TwilioRestClient client) {
        this.accountSid = this.accountSid == null ? client.getAccountSid() : this.accountSid;
        Request request = new Request(
            HttpMethod.POST,
            TwilioRestClient.Domains.API,
            "/2010-04-01/Accounts/" + this.accountSid + "/SIP/IpAccessControlLists/" + this.sid + ".json",
            client.getRegion()
        );
        
        addPostParams(request);
        Response response = client.request(request);
        
        if (response == null) {
            throw new ApiConnectionException("IpAccessControlList update failed: Unable to connect to server");
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
        
        return IpAccessControlList.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     * 
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }
    }
}