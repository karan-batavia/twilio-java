/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Microvisor
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.microvisor.v1.device;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;

import com.twilio.exception.ApiException;

import lombok.ToString;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import java.util.Objects;



@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class DeviceSecret extends Resource {
    private static final long serialVersionUID = 4318157927104L;

    public static DeviceSecretCreator creator(final String pathDeviceSid, final String key, final String value){
        return new DeviceSecretCreator(pathDeviceSid, key, value);
    }

    public static DeviceSecretDeleter deleter(final String pathDeviceSid, final String pathKey){
        return new DeviceSecretDeleter(pathDeviceSid, pathKey);
    }

    public static DeviceSecretFetcher fetcher(final String pathDeviceSid, final String pathKey){
        return new DeviceSecretFetcher(pathDeviceSid, pathKey);
    }

    public static DeviceSecretReader reader(final String pathDeviceSid){
        return new DeviceSecretReader(pathDeviceSid);
    }

    /**
    * Converts a JSON String into a DeviceSecret object using the provided ObjectMapper.
    *
    * @param json Raw JSON String
    * @param objectMapper Jackson ObjectMapper
    * @return DeviceSecret object represented by the provided JSON
    */
    public static DeviceSecret fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, DeviceSecret.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
    * Converts a JSON InputStream into a DeviceSecret object using the provided
    * ObjectMapper.
    *
    * @param json Raw JSON InputStream
    * @param objectMapper Jackson ObjectMapper
    * @return DeviceSecret object represented by the provided JSON
    */
    public static DeviceSecret fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, DeviceSecret.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String deviceSid;
    private final String key;
    private final ZonedDateTime dateRotated;
    private final URI url;

    @JsonCreator
    private DeviceSecret(
        @JsonProperty("device_sid")
        final String deviceSid,

        @JsonProperty("key")
        final String key,

        @JsonProperty("date_rotated")
        final String dateRotated,

        @JsonProperty("url")
        final URI url
    ) {
        this.deviceSid = deviceSid;
        this.key = key;
        this.dateRotated = DateConverter.iso8601DateTimeFromString(dateRotated);
        this.url = url;
    }

        public final String getDeviceSid() {
            return this.deviceSid;
        }
        public final String getKey() {
            return this.key;
        }
        public final ZonedDateTime getDateRotated() {
            return this.dateRotated;
        }
        public final URI getUrl() {
            return this.url;
        }

    @Override
    public boolean equals(final Object o) {
        if (this==o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DeviceSecret other = (DeviceSecret) o;

        return Objects.equals(deviceSid, other.deviceSid) &&  Objects.equals(key, other.key) &&  Objects.equals(dateRotated, other.dateRotated) &&  Objects.equals(url, other.url)  ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviceSid, key, dateRotated, url);
    }

}

