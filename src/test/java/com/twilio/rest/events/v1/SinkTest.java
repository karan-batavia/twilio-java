/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.events.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.TwilioException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class SinkTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.EVENTS.toString(),
                                          "/v1/Sinks/DGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Sink.fetcher("DGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"status\": \"initialized\",\"sink_configuration\": {\"arn\": \"arn:aws:kinesis:us-east-1:111111111:stream/test\",\"role_arn\": \"arn:aws:iam::111111111:role/Role\",\"external_id\": \"1234567890\"},\"description\": \"A Sink\",\"sid\": \"DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"sink_type\": \"kinesis\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"url\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"sink_test\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Test\",\"sink_validate\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Validate\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Sink.fetcher("DGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.EVENTS.toString(),
                                          "/v1/Sinks");
            request.addPostParam("Description", serialize("description"));
            request.addPostParam("SinkConfiguration", serialize(new java.util.HashMap<String, Object>()));
            request.addPostParam("SinkType", serialize(Sink.SinkType.KINESIS));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Sink.creator("description", new java.util.HashMap<String, Object>(), Sink.SinkType.KINESIS).create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"status\": \"initialized\",\"sink_configuration\": {\"arn\": \"arn:aws:kinesis:us-east-1:111111111:stream/test\",\"role_arn\": \"arn:aws:iam::111111111:role/Role\",\"external_id\": \"1234567890\"},\"description\": \"My Kinesis Sink\",\"sid\": \"DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"sink_type\": \"kinesis\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"url\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"sink_test\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Test\",\"sink_validate\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Validate\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Sink.creator("description", new java.util.HashMap<String, Object>(), Sink.SinkType.KINESIS).create();
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.EVENTS.toString(),
                                          "/v1/Sinks/DGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Sink.deleter("DGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testDeleteResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("null", TwilioRestClient.HTTP_STATUS_CODE_NO_CONTENT);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Sink.deleter("DGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.EVENTS.toString(),
                                          "/v1/Sinks");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Sink.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sinks\": [],\"meta\": {\"page\": 0,\"page_size\": 10,\"first_page_url\": \"https://events.twilio.com/v1/Sinks?PageSize=10&Page=0\",\"previous_page_url\": null,\"url\": \"https://events.twilio.com/v1/Sinks?PageSize=10&Page=0\",\"next_page_url\": null,\"key\": \"sinks\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Sink.reader().read());
    }

    @Test
    public void testReadResultsResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sinks\": [{\"status\": \"initialized\",\"sink_configuration\": {\"arn\": \"arn:aws:kinesis:us-east-1:111111111:stream/test\",\"role_arn\": \"arn:aws:iam::111111111:role/Role\",\"external_id\": \"1234567890\"},\"description\": \"A Sink\",\"sid\": \"DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T19:00:00Z\",\"sink_type\": \"kinesis\",\"date_updated\": \"2015-07-30T19:00:00Z\",\"url\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"sink_test\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Test\",\"sink_validate\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Validate\"}},{\"status\": \"initialized\",\"sink_configuration\": {\"arn\": \"arn:aws:kinesis:us-east-1:222222222:stream/test\",\"role_arn\": \"arn:aws:iam::111111111:role/Role\",\"external_id\": \"1234567890\"},\"description\": \"ANOTHER Sink\",\"sid\": \"DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"date_created\": \"2015-07-30T20:00:00Z\",\"sink_type\": \"kinesis\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"url\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"links\": {\"sink_test\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab/Test\",\"sink_validate\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab/Validate\"}},{\"status\": \"active\",\"sink_configuration\": {\"destination\": \"http://example.org/webhook\",\"method\": \"POST\",\"batch_events\": true},\"description\": \"A webhook Sink\",\"sid\": \"DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac\",\"date_created\": \"2015-07-30T21:00:00Z\",\"sink_type\": \"webhook\",\"date_updated\": \"2015-07-30T21:00:00Z\",\"url\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac\",\"links\": {\"sink_test\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac/Test\",\"sink_validate\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac/Validate\"}}],\"meta\": {\"page\": 0,\"page_size\": 20,\"first_page_url\": \"https://events.twilio.com/v1/Sinks?PageSize=20&Page=0\",\"previous_page_url\": null,\"url\": \"https://events.twilio.com/v1/Sinks?PageSize=20&Page=0\",\"next_page_url\": null,\"key\": \"sinks\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Sink.reader().read());
    }

    @Test
    public void testReadResultsInUseResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sinks\": [{\"status\": \"initialized\",\"sink_configuration\": {\"arn\": \"arn:aws:kinesis:us-east-1:111111111:stream/test\",\"role_arn\": \"arn:aws:iam::111111111:role/Role\",\"external_id\": \"1234567890\"},\"description\": \"A Sink\",\"sid\": \"DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T19:00:00Z\",\"sink_type\": \"kinesis\",\"date_updated\": \"2015-07-30T19:00:00Z\",\"url\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"sink_test\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Test\",\"sink_validate\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Validate\"}},{\"status\": \"initialized\",\"sink_configuration\": {\"arn\": \"arn:aws:kinesis:us-east-1:222222222:stream/test\",\"role_arn\": \"arn:aws:iam::111111111:role/Role\",\"external_id\": \"1234567890\"},\"description\": \"ANOTHER Sink\",\"sid\": \"DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"date_created\": \"2015-07-30T20:00:00Z\",\"sink_type\": \"kinesis\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"url\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"links\": {\"sink_test\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab/Test\",\"sink_validate\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab/Validate\"}},{\"status\": \"active\",\"sink_configuration\": {\"destination\": \"http://example.org/webhook\",\"method\": \"POST\",\"batch_events\": true},\"description\": \"A webhook Sink\",\"sid\": \"DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac\",\"date_created\": \"2015-07-30T21:00:00Z\",\"sink_type\": \"webhook\",\"date_updated\": \"2015-07-30T21:00:00Z\",\"url\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac\",\"links\": {\"sink_test\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac/Test\",\"sink_validate\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac/Validate\"}}],\"meta\": {\"page\": 0,\"page_size\": 20,\"first_page_url\": \"https://events.twilio.com/v1/Sinks?InUse=True&PageSize=20&Page=0\",\"previous_page_url\": null,\"url\": \"https://events.twilio.com/v1/Sinks?InUse=True&PageSize=20&Page=0\",\"next_page_url\": null,\"key\": \"sinks\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Sink.reader().read());
    }

    @Test
    public void testReadResultsStatusResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sinks\": [{\"status\": \"active\",\"sink_configuration\": {\"destination\": \"http://example.org/webhook\",\"method\": \"POST\",\"batch_events\": true},\"description\": \"A webhook Sink\",\"sid\": \"DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac\",\"date_created\": \"2015-07-30T21:00:00Z\",\"sink_type\": \"webhook\",\"date_updated\": \"2015-07-30T21:00:00Z\",\"url\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac\",\"links\": {\"sink_test\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac/Test\",\"sink_validate\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac/Validate\"}}],\"meta\": {\"page\": 0,\"page_size\": 20,\"first_page_url\": \"https://events.twilio.com/v1/Sinks?Status=active&PageSize=20&Page=0\",\"previous_page_url\": null,\"url\": \"https://events.twilio.com/v1/Sinks?Status=active&PageSize=20&Page=0\",\"next_page_url\": null,\"key\": \"sinks\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Sink.reader().read());
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.EVENTS.toString(),
                                          "/v1/Sinks/DGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            request.addPostParam("Description", serialize("description"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Sink.updater("DGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "description").update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"status\": \"initialized\",\"sink_configuration\": {\"arn\": \"arn:aws:kinesis:us-east-1:111111111:stream/test\",\"role_arn\": \"arn:aws:iam::111111111:role/Role\",\"external_id\": \"1234567890\"},\"description\": \"My Kinesis Sink\",\"sid\": \"DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"sink_type\": \"kinesis\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"url\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"sink_test\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Test\",\"sink_validate\": \"https://events.twilio.com/v1/Sinks/DGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Validate\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Sink.updater("DGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "description").update();
    }
}