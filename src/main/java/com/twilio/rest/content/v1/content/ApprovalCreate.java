/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Content
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.content.v1.content;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import lombok.Builder;
import lombok.ToString;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class ApprovalCreate extends Resource {

    private static final long serialVersionUID = 150858338844938L;

    @ToString
    @Builder
    public static class ContentApprovalRequest {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("name")
        private String name;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("category")
        private String category;

        public static ContentApprovalRequest fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, ContentApprovalRequest.class);
        }
    }

    public static ApprovalCreateCreator creator(
        final String pathContentSid,
        final ApprovalCreate.ContentApprovalRequest contentApprovalRequest
    ) {
        return new ApprovalCreateCreator(
            pathContentSid,
            contentApprovalRequest
        );
    }

    /**
     * Converts a JSON String into a ApprovalCreate object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return ApprovalCreate object represented by the provided JSON
     */
    public static ApprovalCreate fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ApprovalCreate.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a ApprovalCreate object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return ApprovalCreate object represented by the provided JSON
     */
    public static ApprovalCreate fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, ApprovalCreate.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    public static String toJson(Object object, ObjectMapper mapper) {
        try {
            return mapper.writeValueAsString(object);
        } catch (final JsonMappingException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (JsonProcessingException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String name;
    private final String category;
    private final String contentType;
    private final String status;
    private final String rejectionReason;
    private final Boolean allowCategoryChange;

    @JsonCreator
    private ApprovalCreate(
        @JsonProperty("name") final String name,
        @JsonProperty("category") final String category,
        @JsonProperty("content_type") final String contentType,
        @JsonProperty("status") final String status,
        @JsonProperty("rejection_reason") final String rejectionReason,
        @JsonProperty("allow_category_change") final Boolean allowCategoryChange
    ) {
        this.name = name;
        this.category = category;
        this.contentType = contentType;
        this.status = status;
        this.rejectionReason = rejectionReason;
        this.allowCategoryChange = allowCategoryChange;
    }

    public final String getName() {
        return this.name;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getRejectionReason() {
        return this.rejectionReason;
    }

    public final Boolean getAllowCategoryChange() {
        return this.allowCategoryChange;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ApprovalCreate other = (ApprovalCreate) o;

        return (
            Objects.equals(name, other.name) &&
            Objects.equals(category, other.category) &&
            Objects.equals(contentType, other.contentType) &&
            Objects.equals(status, other.status) &&
            Objects.equals(rejectionReason, other.rejectionReason) &&
            Objects.equals(allowCategoryChange, other.allowCategoryChange)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            category,
            contentType,
            status,
            rejectionReason,
            allowCategoryChange
        );
    }
}
