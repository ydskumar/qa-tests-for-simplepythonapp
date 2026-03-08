package com.qa;

import org.junit.jupiter.api.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

@Epic("SimplePythonApp")
@Feature("Metrics API")
public class MetricsTest extends BaseTest{

	@Test
	@Story("Verify Metrics endpoint")
	@Description("Validate that /metrics returns healthy status")
    void shouldReturnUptimeMetric() {

        given()
        .when()
            .get("/metrics")
        .then()
            .statusCode(200)
            .body("uptime", greaterThanOrEqualTo(0f));
    }
}
