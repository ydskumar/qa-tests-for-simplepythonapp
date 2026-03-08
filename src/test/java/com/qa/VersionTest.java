package com.qa;

import org.junit.jupiter.api.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

@Epic("SimplePythonApp")
@Feature("Version API")
public class VersionTest extends BaseTest{

	  @Test
	  @Story("Verify Version endpoint")
	  @Description("Validate that /returns returns expected result")
	  void shouldReturnVersion() {

	        given()
	        .when()
	            .get("/version")
	        .then()
	            .statusCode(200)
	            .body("version", notNullValue());
	    }
}
