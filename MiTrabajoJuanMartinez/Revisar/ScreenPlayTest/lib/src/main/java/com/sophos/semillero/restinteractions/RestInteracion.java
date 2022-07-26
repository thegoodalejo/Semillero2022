package com.sophos.semillero.restinteractions;

import java.util.Map;

import org.junit.Assert;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class RestInteracion {

	private static String baseUrl;

	public static void setBaseUrl(String baseUrl) {

		RestInteracion.baseUrl = baseUrl;
	}

	public static void executePostWithToken(String endPoint, Map<String, String> body, String token) {
		SerenityRest.given().auth().oauth2(token).contentType(ContentType.JSON).when().body(body)
				.post(baseUrl.concat(endPoint));

		SerenityRest.lastResponse().prettyPeek();

	}

	public static void executeGetWithToken(String endPoint, String id, String token) {
		SerenityRest.given().auth().oauth2(token).get(baseUrl.concat(endPoint).concat(id));

		SerenityRest.lastResponse().prettyPeek();

	}

	public static void validateResponseStatusCode(int statusCode) {
		int responseStatusCode = SerenityRest.lastResponse().getStatusCode();
		Assert.assertEquals(statusCode, responseStatusCode);
	}
	
	public static void validateDateResponse(String data,String path) {
		String actualResponse = SerenityRest.lastResponse().jsonPath().getString(path);
		System.out.println("path:"+path+"------->"+actualResponse);
		Assert.assertEquals(data, actualResponse);
	}
}
