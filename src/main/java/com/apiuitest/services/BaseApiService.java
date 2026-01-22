package com.apiuitest.services;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import com.apiuitest.config.ConfigReader;

public class BaseApiService {
    protected RequestSpecification request;

    public BaseApiService() {
        RestAssured.baseURI = ConfigReader.getBaseUrl();
        request = RestAssured.given().contentType("application/json");
    }

    protected Response get(String endpoint) {
        return request.get(endpoint);
    }

    protected Response post(String endpoint, Object body) {
        return request.body(body).post(endpoint);
    }

    protected Response put(String endpoint, Object body) {
        return request.body(body).put(endpoint);
    }

    protected Response delete(String endpoint) {
        return request.delete(endpoint);
    }
}