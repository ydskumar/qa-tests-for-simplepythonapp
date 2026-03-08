package com.qa;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

@Epic("SimplePythonApp")
@Feature("Health API")
public class HealthTest extends BaseTest {

	@Test
	@Story("Verify health endpoint")
	@Description("Validate that /health returns healthy status")
	void shouldReturnHealthyStatus() {

		given()
		.when()
			.get("/health")
		.then()
			.statusCode(200)
			.body("status", equalTo("healthy"));
	}
}
