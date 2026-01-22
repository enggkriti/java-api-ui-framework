package com.apiuitest.shared.base;

import org.testng.annotations.BeforeClass;
import com.apiuitest.shared.config.ConfigReader;
import io.restassured.RestAssured;

public class ApiBaseTest {

    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = ConfigReader.getBaseUrl();
    }
}