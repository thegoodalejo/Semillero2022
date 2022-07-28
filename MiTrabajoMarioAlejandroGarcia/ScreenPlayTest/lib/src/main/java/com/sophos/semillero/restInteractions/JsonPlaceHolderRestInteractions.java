package com.sophos.semillero.restInteractions;

import java.util.Map;

import org.junit.Assert;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class JsonPlaceHolderRestInteractions {
	
	private static String baseUrl;
	
	public static void setBaseUrl(String baseUrl) {
		JsonPlaceHolderRestInteractions.baseUrl = baseUrl;	
	}
	public static void executePost(String endPoint, Map<String, String> body) {
		SerenityRest.given().contentType(ContentType.JSON).when().body(body)
		.post(baseUrl.concat(endPoint));
		
		SerenityRest.lastResponse().prettyPeek();
	}
	public static void executeGet(String endPoint, String id) {
		SerenityRest.given()
		.get(baseUrl.concat(endPoint).concat(id));
		
		SerenityRest.lastResponse().prettyPeek();
	}
	public static void validateStatusCode(int statusCode) {
		int responseStatusCode = SerenityRest.lastResponse().getStatusCode();
		Assert.assertEquals(statusCode, responseStatusCode);
		System.out.println("statusCode: "+statusCode);
	}

}
