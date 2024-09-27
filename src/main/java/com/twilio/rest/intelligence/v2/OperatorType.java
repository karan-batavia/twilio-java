/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Intelligence
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.intelligence.v2;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Map;
import java.util.Objects;
import lombok.ToString;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class OperatorType extends Resource {

    private static final long serialVersionUID = 227558057824727L;

    public static OperatorTypeFetcher fetcher(final String pathSid) {
        return new OperatorTypeFetcher(pathSid);
    }

    public static OperatorTypeReader reader() {
        return new OperatorTypeReader();
    }

    /**
     * Converts a JSON String into a OperatorType object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return OperatorType object represented by the provided JSON
     */
    public static OperatorType fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, OperatorType.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a OperatorType object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return OperatorType object represented by the provided JSON
     */
    public static OperatorType fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, OperatorType.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String name;
    private final String sid;
    private final String friendlyName;
    private final String description;
    private final URI docsLink;
    private final OperatorType.OutputType outputType;
    private final List<String> supportedLanguages;
    private final OperatorType.Provider provider;
    private final OperatorType.Availability availability;
    private final Boolean configurable;
    private final Map<String, Object> configSchema;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private OperatorType(
        @JsonProperty("name") final String name,
        @JsonProperty("sid") final String sid,
        @JsonProperty("friendly_name") final String friendlyName,
        @JsonProperty("description") final String description,
        @JsonProperty("docs_link") final URI docsLink,
        @JsonProperty("output_type") final OperatorType.OutputType outputType,
        @JsonProperty("supported_languages") final List<
            String
        > supportedLanguages,
        @JsonProperty("provider") final OperatorType.Provider provider,
        @JsonProperty(
            "availability"
        ) final OperatorType.Availability availability,
        @JsonProperty("configurable") final Boolean configurable,
        @JsonProperty("config_schema") final Map<String, Object> configSchema,
        @JsonProperty("date_created") final String dateCreated,
        @JsonProperty("date_updated") final String dateUpdated,
        @JsonProperty("url") final URI url
    ) {
        this.name = name;
        this.sid = sid;
        this.friendlyName = friendlyName;
        this.description = description;
        this.docsLink = docsLink;
        this.outputType = outputType;
        this.supportedLanguages = supportedLanguages;
        this.provider = provider;
        this.availability = availability;
        this.configurable = configurable;
        this.configSchema = configSchema;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getFriendlyName() {
        return this.friendlyName;
    }

    public final String getDescription() {
        return this.description;
    }

    public final URI getDocsLink() {
        return this.docsLink;
    }

    public final OperatorType.OutputType getOutputType() {
        return this.outputType;
    }

    public final List<String> getSupportedLanguages() {
        return this.supportedLanguages;
    }

    public final OperatorType.Provider getProvider() {
        return this.provider;
    }

    public final OperatorType.Availability getAvailability() {
        return this.availability;
    }

    public final Boolean getConfigurable() {
        return this.configurable;
    }

    public final Map<String, Object> getConfigSchema() {
        return this.configSchema;
    }

    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OperatorType other = (OperatorType) o;

        return (
            Objects.equals(name, other.name) &&
            Objects.equals(sid, other.sid) &&
            Objects.equals(friendlyName, other.friendlyName) &&
            Objects.equals(description, other.description) &&
            Objects.equals(docsLink, other.docsLink) &&
            Objects.equals(outputType, other.outputType) &&
            Objects.equals(supportedLanguages, other.supportedLanguages) &&
            Objects.equals(provider, other.provider) &&
            Objects.equals(availability, other.availability) &&
            Objects.equals(configurable, other.configurable) &&
            Objects.equals(configSchema, other.configSchema) &&
            Objects.equals(dateCreated, other.dateCreated) &&
            Objects.equals(dateUpdated, other.dateUpdated) &&
            Objects.equals(url, other.url)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            sid,
            friendlyName,
            description,
            docsLink,
            outputType,
            supportedLanguages,
            provider,
            availability,
            configurable,
            configSchema,
            dateCreated,
            dateUpdated,
            url
        );
    }

    public enum Provider {
        TWILIO("twilio"),
        AMAZON("amazon"),
        OPENAI("openai");

        private final String value;

        private Provider(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Provider forValue(final String value) {
            return Promoter.enumFromString(value, Provider.values());
        }
    }

    public enum OutputType {
        TEXT_CLASSIFICATION("text-classification"),
        TEXT_EXTRACTION("text-extraction"),
        TEXT_EXTRACTION_NORMALIZED("text-extraction-normalized"),
        TEXT_GENERATION("text-generation");

        private final String value;

        private OutputType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static OutputType forValue(final String value) {
            return Promoter.enumFromString(value, OutputType.values());
        }
    }

    public enum Availability {
        INTERNAL("internal"),
        BETA("beta"),
        GENERAL_AVAILABILITY("general-availability"),
        RETIRED("retired"),
        DEPRECATED("deprecated");

        private final String value;

        private Availability(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Availability forValue(final String value) {
            return Promoter.enumFromString(value, Availability.values());
        }
    }
}
