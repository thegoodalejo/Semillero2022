package com.falabella.loyalty.restinteractions;

import static org.junit.Assert.assertEquals;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class GetCustomerByKeyRestInteraction {

	private static String baseUrl;

	public static void setBaseUrl(String baseUrl) {

		GetCustomerByKeyRestInteraction.baseUrl = baseUrl;
	}

	public static void executeGetCostumerByKey(String key, String TOKEN) {
		// SerenityRest.given().get("https://34.107.239.151/fif/loyalty/v1.0/cl/customer/rKNgk4WhYOsGcOHQjY_U_ctGWVN9l50_XJM5uAAw-w0=");
		SerenityRest.given().contentType(ContentType.JSON).when().header("host", "api-qa.cmrpuntos.cl")
				.param("key", TOKEN).urlEncodingEnabled(false).relaxedHTTPSValidation().get(baseUrl.concat(key));

		// SerenityRest.given().when().get(baseUrl.concat(key).concat("?key=").concat(TOKEN));

		SerenityRest.lastResponse().prettyPeek();
	}

	public static void validateStatusCodeResponse(int statusCode) {
		int statusCodeResponse=SerenityRest.lastResponse().getStatusCode();
		assertEquals(statusCode, statusCodeResponse);
	}

	public static void validateStatusResponse(String status, String pathStatus) {
		String statusResponse=SerenityRest.lastResponse().jsonPath().getString(pathStatus);
		System.out.println("El status del response es ----->"+statusResponse);
		assertEquals(statusResponse, status);
	}
}
