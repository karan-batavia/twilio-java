/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Assistants
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.assistants.v1;

import com.twilio.base.Page;
import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.constant.EnumConstants;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class PolicyReader extends Reader<Policy> {

    private String toolId;
    private String knowledgeId;
    private Integer pageSize;

    public PolicyReader() {}

    public PolicyReader setToolId(final String toolId) {
        this.toolId = toolId;
        return this;
    }

    public PolicyReader setKnowledgeId(final String knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }

    public PolicyReader setPageSize(final Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public ResourceSet<Policy> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    public Page<Policy> firstPage(final TwilioRestClient client) {
        String path = "/v1/Policies";

        Request request = new Request(
            HttpMethod.GET,
            Domains.ASSISTANTS.toString(),
            path
        );

        addQueryParams(request);
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        return pageForRequest(client, request);
    }

    private Page<Policy> pageForRequest(
        final TwilioRestClient client,
        final Request request
    ) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException(
                "Policy read failed: Unable to connect to server"
            );
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(
                response.getStream(),
                client.getObjectMapper()
            );
            if (restException == null) {
                throw new ApiException(
                    "Server Error, no content",
                    response.getStatusCode()
                );
            }
            throw new ApiException(restException);
        }

        return Page.fromJson(
            "policies",
            response.getContent(),
            Policy.class,
            client.getObjectMapper()
        );
    }

    @Override
    public Page<Policy> previousPage(
        final Page<Policy> page,
        final TwilioRestClient client
    ) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.ASSISTANTS.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<Policy> nextPage(
        final Page<Policy> page,
        final TwilioRestClient client
    ) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.ASSISTANTS.toString())
        );
        return pageForRequest(client, request);
    }

    @Override
    public Page<Policy> getPage(
        final String targetUrl,
        final TwilioRestClient client
    ) {
        Request request = new Request(HttpMethod.GET, targetUrl);

        return pageForRequest(client, request);
    }

    private void addQueryParams(final Request request) {
        if (toolId != null) {
            request.addQueryParam("ToolId", toolId);
        }
        if (knowledgeId != null) {
            request.addQueryParam("KnowledgeId", knowledgeId);
        }
        if (pageSize != null) {
            request.addQueryParam("PageSize", pageSize.toString());
        }

        if (getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}
