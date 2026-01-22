package com.apiuitest.api.base;

import org.testng.annotations.BeforeClass;
import com.apiuitest.config.ConfigReader;
import io.restassured.RestAssured;

public class ApiBaseTest {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = ConfigReader.getBaseUrl();
    }
}