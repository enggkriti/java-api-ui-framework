package com.apiuitest.utils;

import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class ApiUtils {

    public static void validateStatusCode(Response response, int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    public static void validateResponseTime(Response response, long maxTimeInMs) {
        response.then().time(lessThan(maxTimeInMs));
    }

    public static void validateJsonSchema(Response response, String schemaPath) {
        // This would require additional setup for JSON schema validation
        LoggerUtil.info("JSON schema validation would be implemented here");
    }

    public static String getResponseAsString(Response response) {
        return response.asString();
    }
}