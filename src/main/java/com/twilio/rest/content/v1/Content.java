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

package com.twilio.rest.content.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Map;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class Content extends Resource {

    private static final long serialVersionUID = 58899890984300L;

    @ToString
    public static class TwilioText {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("body")
        @Getter
        @Setter
        private String body;

        public static TwilioText fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, TwilioText.class);
        }
    }

    @ToString
    public static class TwilioMedia {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("body")
        @Getter
        @Setter
        private String body;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("media")
        @Getter
        @Setter
        private List<String> media;

        public static TwilioMedia fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, TwilioMedia.class);
        }
    }

    @ToString
    public static class TwilioLocation {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("latitude")
        @Getter
        @Setter
        private BigDecimal latitude;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("longitude")
        @Getter
        @Setter
        private BigDecimal longitude;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("label")
        @Getter
        @Setter
        private String label;

        public static TwilioLocation fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, TwilioLocation.class);
        }
    }

    @ToString
    public static class ListItem {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("id")
        @Getter
        @Setter
        private String id;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("item")
        @Getter
        @Setter
        private String item;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("description")
        @Getter
        @Setter
        private String description;

        public static ListItem fromJson(String jsonString, ObjectMapper mapper)
            throws IOException {
            return mapper.readValue(jsonString, ListItem.class);
        }
    }

    @ToString
    public static class TwilioListPicker {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("body")
        @Getter
        @Setter
        private String body;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("button")
        @Getter
        @Setter
        private String button;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("items")
        @Getter
        @Setter
        private List<ListItem> items;

        public static TwilioListPicker fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, TwilioListPicker.class);
        }
    }

    @ToString
    public static class CallToActionAction {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("type")
        @Getter
        @Setter
        private Content.CallToActionActionType type;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("title")
        @Getter
        @Setter
        private String title;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("url")
        @Getter
        @Setter
        private String url;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("phone")
        @Getter
        @Setter
        private String phone;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("code")
        @Getter
        @Setter
        private String code;

        public static CallToActionAction fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, CallToActionAction.class);
        }
    }

    @ToString
    public static class TwilioCallToAction {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("body")
        @Getter
        @Setter
        private String body;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("actions")
        @Getter
        @Setter
        private List<CallToActionAction> actions;

        public static TwilioCallToAction fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, TwilioCallToAction.class);
        }
    }

    @ToString
    public static class QuickReplyAction {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("type")
        @Getter
        @Setter
        private Content.QuickReplyActionType type;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("title")
        @Getter
        @Setter
        private String title;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("id")
        @Getter
        @Setter
        private String id;

        public static QuickReplyAction fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, QuickReplyAction.class);
        }
    }

    @ToString
    public static class TwilioQuickReply {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("body")
        @Getter
        @Setter
        private String body;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("actions")
        @Getter
        @Setter
        private List<QuickReplyAction> actions;

        public static TwilioQuickReply fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, TwilioQuickReply.class);
        }
    }

    @ToString
    public static class CardAction {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("type")
        @Getter
        @Setter
        private Content.CardActionType type;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("title")
        @Getter
        @Setter
        private String title;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("url")
        @Getter
        @Setter
        private String url;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("phone")
        @Getter
        @Setter
        private String phone;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("id")
        @Getter
        @Setter
        private String id;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("code")
        @Getter
        @Setter
        private String code;

        public static CardAction fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, CardAction.class);
        }
    }

    @ToString
    public static class TwilioCard {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("title")
        @Getter
        @Setter
        private String title;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("subtitle")
        @Getter
        @Setter
        private String subtitle;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("media")
        @Getter
        @Setter
        private List<String> media;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("actions")
        @Getter
        @Setter
        private List<CardAction> actions;

        public static TwilioCard fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, TwilioCard.class);
        }
    }

    @ToString
    public static class CatalogItem {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("id")
        @Getter
        @Setter
        private String id;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("section_title")
        @Getter
        @Setter
        private String sectionTitle;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("name")
        @Getter
        @Setter
        private String name;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("media_url")
        @Getter
        @Setter
        private String mediaUrl;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("price")
        @Getter
        @Setter
        private BigDecimal price;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("description")
        @Getter
        @Setter
        private String description;

        public static CatalogItem fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, CatalogItem.class);
        }
    }

    @ToString
    public static class TwilioCatalog {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("title")
        @Getter
        @Setter
        private String title;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("body")
        @Getter
        @Setter
        private String body;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("subtitle")
        @Getter
        @Setter
        private String subtitle;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("id")
        @Getter
        @Setter
        private String id;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("items")
        @Getter
        @Setter
        private List<CatalogItem> items;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("dynamic_items")
        @Getter
        @Setter
        private String dynamicItems;

        public static TwilioCatalog fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, TwilioCatalog.class);
        }
    }

    @ToString
    public static class CarouselAction {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("type")
        @Getter
        @Setter
        private Content.CarouselActionType type;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("title")
        @Getter
        @Setter
        private String title;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("url")
        @Getter
        @Setter
        private String url;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("phone")
        @Getter
        @Setter
        private String phone;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("id")
        @Getter
        @Setter
        private String id;

        public static CarouselAction fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, CarouselAction.class);
        }
    }

    @ToString
    public static class CarouselCard {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("title")
        @Getter
        @Setter
        private String title;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("body")
        @Getter
        @Setter
        private String body;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("media")
        @Getter
        @Setter
        private String media;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("actions")
        @Getter
        @Setter
        private List<CarouselAction> actions;

        public static CarouselCard fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, CarouselCard.class);
        }
    }

    @ToString
    public static class TwilioCarousel {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("body")
        @Getter
        @Setter
        private String body;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("cards")
        @Getter
        @Setter
        private List<CarouselCard> cards;

        public static TwilioCarousel fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, TwilioCarousel.class);
        }
    }

    @ToString
    public static class FlowsPageComponentSelectItem {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("id")
        @Getter
        @Setter
        private String id;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("title")
        @Getter
        @Setter
        private String title;

        public static FlowsPageComponentSelectItem fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(
                jsonString,
                FlowsPageComponentSelectItem.class
            );
        }
    }

    @ToString
    public static class FlowsPageComponent {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("label")
        @Getter
        @Setter
        private String label;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("type")
        @Getter
        @Setter
        private String type;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("text")
        @Getter
        @Setter
        private String text;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("options")
        @Getter
        @Setter
        private List<FlowsPageComponentSelectItem> options;

        public static FlowsPageComponent fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, FlowsPageComponent.class);
        }
    }

    @ToString
    public static class FlowsPage {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("id")
        @Getter
        @Setter
        private String id;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("next_page_id")
        @Getter
        @Setter
        private String nextPageId;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("title")
        @Getter
        @Setter
        private String title;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("subtitle")
        @Getter
        @Setter
        private String subtitle;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("layout")
        @Getter
        @Setter
        private List<FlowsPageComponent> layout;

        public static FlowsPage fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, FlowsPage.class);
        }
    }

    @ToString
    public static class TwilioFlows {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("body")
        @Getter
        @Setter
        private String body;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("button_text")
        @Getter
        @Setter
        private String buttonText;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("subtitle")
        @Getter
        @Setter
        private String subtitle;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("media_url")
        @Getter
        @Setter
        private String mediaUrl;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("pages")
        @Getter
        @Setter
        private List<FlowsPage> pages;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("type")
        @Getter
        @Setter
        private String type;

        public static TwilioFlows fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, TwilioFlows.class);
        }
    }

    @ToString
    public static class WhatsappCard {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("body")
        @Getter
        @Setter
        private String body;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("footer")
        @Getter
        @Setter
        private String footer;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("media")
        @Getter
        @Setter
        private List<String> media;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("header_text")
        @Getter
        @Setter
        private String headerText;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("actions")
        @Getter
        @Setter
        private List<CardAction> actions;

        public static WhatsappCard fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, WhatsappCard.class);
        }
    }

    @ToString
    public static class AuthenticationAction {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("type")
        @Getter
        @Setter
        private Content.AuthenticationActionType type;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("copy_code_text")
        @Getter
        @Setter
        private String copyCodeText;

        public static AuthenticationAction fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, AuthenticationAction.class);
        }
    }

    @ToString
    public static class WhatsappAuthentication {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("add_security_recommendation")
        @Getter
        @Setter
        private Boolean addSecurityRecommendation;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("code_expiration_minutes")
        @Getter
        @Setter
        private BigDecimal codeExpirationMinutes;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("actions")
        @Getter
        @Setter
        private List<AuthenticationAction> actions;

        public static WhatsappAuthentication fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, WhatsappAuthentication.class);
        }
    }

    @ToString
    public static class Types {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("twilio/text")
        @Getter
        @Setter
        private TwilioText twilioText;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("twilio/media")
        @Getter
        @Setter
        private TwilioMedia twilioMedia;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("twilio/location")
        @Getter
        @Setter
        private TwilioLocation twilioLocation;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("twilio/list-picker")
        @Getter
        @Setter
        private TwilioListPicker twilioListPicker;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("twilio/call-to-action")
        @Getter
        @Setter
        private TwilioCallToAction twilioCallToAction;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("twilio/quick-reply")
        @Getter
        @Setter
        private TwilioQuickReply twilioQuickReply;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("twilio/card")
        @Getter
        @Setter
        private TwilioCard twilioCard;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("twilio/catalog")
        @Getter
        @Setter
        private TwilioCatalog twilioCatalog;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("twilio/carousel")
        @Getter
        @Setter
        private TwilioCarousel twilioCarousel;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("twilio/flows")
        @Getter
        @Setter
        private TwilioFlows twilioFlows;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("whatsapp/card")
        @Getter
        @Setter
        private WhatsappCard whatsappCard;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("whatsapp/authentication")
        @Getter
        @Setter
        private WhatsappAuthentication whatsappAuthentication;

        public static Types fromJson(String jsonString, ObjectMapper mapper)
            throws IOException {
            return mapper.readValue(jsonString, Types.class);
        }
    }

    @ToString
    public static class ContentCreateRequest {

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("friendly_name")
        @Getter
        @Setter
        private String friendlyName;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("variables")
        @Getter
        @Setter
        private Map<String, String> variables;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("language")
        @Getter
        @Setter
        private String language;

        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        @JsonProperty("types")
        @Getter
        @Setter
        private Types types;

        public ContentCreateRequest(final String language, final Types types) {
            this.language = language;
            this.types = types;
        }

        public static ContentCreateRequest fromJson(
            String jsonString,
            ObjectMapper mapper
        ) throws IOException {
            return mapper.readValue(jsonString, ContentCreateRequest.class);
        }
    }

    public static ContentCreator creator(
        final Content.ContentCreateRequest contentCreateRequest
    ) {
        return new ContentCreator(contentCreateRequest);
    }

    public static ContentDeleter deleter(final String pathSid) {
        return new ContentDeleter(pathSid);
    }

    public static ContentFetcher fetcher(final String pathSid) {
        return new ContentFetcher(pathSid);
    }

    public static ContentReader reader() {
        return new ContentReader();
    }

    /**
     * Converts a JSON String into a Content object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Content object represented by the provided JSON
     */
    public static Content fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Content.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Content object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Content object represented by the provided JSON
     */
    public static Content fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Content.class);
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

    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String sid;
    private final String accountSid;
    private final String friendlyName;
    private final String language;
    private final Map<String, Object> variables;
    private final Map<String, Object> types;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private Content(
        @JsonProperty("date_created") final String dateCreated,
        @JsonProperty("date_updated") final String dateUpdated,
        @JsonProperty("sid") final String sid,
        @JsonProperty("account_sid") final String accountSid,
        @JsonProperty("friendly_name") final String friendlyName,
        @JsonProperty("language") final String language,
        @JsonProperty("variables") final Map<String, Object> variables,
        @JsonProperty("types") final Map<String, Object> types,
        @JsonProperty("url") final URI url,
        @JsonProperty("links") final Map<String, String> links
    ) {
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.sid = sid;
        this.accountSid = accountSid;
        this.friendlyName = friendlyName;
        this.language = language;
        this.variables = variables;
        this.types = types;
        this.url = url;
        this.links = links;
    }

    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getAccountSid() {
        return this.accountSid;
    }

    public final String getFriendlyName() {
        return this.friendlyName;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Map<String, Object> getVariables() {
        return this.variables;
    }

    public final Map<String, Object> getTypes() {
        return this.types;
    }

    public final URI getUrl() {
        return this.url;
    }

    public final Map<String, String> getLinks() {
        return this.links;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Content other = (Content) o;

        return (
            Objects.equals(dateCreated, other.dateCreated) &&
            Objects.equals(dateUpdated, other.dateUpdated) &&
            Objects.equals(sid, other.sid) &&
            Objects.equals(accountSid, other.accountSid) &&
            Objects.equals(friendlyName, other.friendlyName) &&
            Objects.equals(language, other.language) &&
            Objects.equals(variables, other.variables) &&
            Objects.equals(types, other.types) &&
            Objects.equals(url, other.url) &&
            Objects.equals(links, other.links)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            dateCreated,
            dateUpdated,
            sid,
            accountSid,
            friendlyName,
            language,
            variables,
            types,
            url,
            links
        );
    }

    public enum QuickReplyActionType {
        QUICK_REPLY("QUICK_REPLY");

        private final String value;

        private QuickReplyActionType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static QuickReplyActionType forValue(final String value) {
            return Promoter.enumFromString(
                value,
                QuickReplyActionType.values()
            );
        }
    }

    public enum CardActionType {
        URL("URL"),
        PHONE_NUMBER("PHONE_NUMBER"),
        QUICK_REPLY("QUICK_REPLY"),
        COPY_CODE("COPY_CODE"),
        VOICE_CALL("VOICE_CALL");

        private final String value;

        private CardActionType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static CardActionType forValue(final String value) {
            return Promoter.enumFromString(value, CardActionType.values());
        }
    }

    public enum CarouselActionType {
        URL("URL"),
        PHONE_NUMBER("PHONE_NUMBER"),
        QUICK_REPLY("QUICK_REPLY");

        private final String value;

        private CarouselActionType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static CarouselActionType forValue(final String value) {
            return Promoter.enumFromString(value, CarouselActionType.values());
        }
    }

    public enum CallToActionActionType {
        URL("URL"),
        PHONE_NUMBER("PHONE_NUMBER"),
        COPY_CODE("COPY_CODE"),
        VOICE_CALL("VOICE_CALL");

        private final String value;

        private CallToActionActionType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static CallToActionActionType forValue(final String value) {
            return Promoter.enumFromString(
                value,
                CallToActionActionType.values()
            );
        }
    }

    public enum AuthenticationActionType {
        COPY_CODE("COPY_CODE");

        private final String value;

        private AuthenticationActionType(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static AuthenticationActionType forValue(final String value) {
            return Promoter.enumFromString(
                value,
                AuthenticationActionType.values()
            );
        }
    }
}
