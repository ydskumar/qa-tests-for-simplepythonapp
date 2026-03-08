package com.qa;

import org.junit.jupiter.api.BeforeAll;

import io.restassured.RestAssured;

public class BaseTest {

	 @BeforeAll
	    static void setup() {

	        String baseUrl = System.getenv("BASE_URL");

	        if (baseUrl == null || baseUrl.isEmpty()) {
	            baseUrl = "http://localhost:8081"; // fallback for local
	        }

	        RestAssured.baseURI = baseUrl;

	        System.out.println("Running tests against: " + baseUrl);
	    }
}
