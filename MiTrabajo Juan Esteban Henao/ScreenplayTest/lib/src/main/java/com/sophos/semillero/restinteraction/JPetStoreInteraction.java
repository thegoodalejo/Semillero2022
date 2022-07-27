package com.sophos.semillero.restinteraction;

import java.util.Map;

import org.junit.Assert;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class JPetStoreInteraction {
	
	private static String baseUrl;
	
	
	public static void setBaseUrl(String url) {
		JPetStoreInteraction.baseUrl=url;
	}
	

	public static void executePostNoToken(String endPoint, Map<Object, Object> body) {
		SerenityRest.given()
		.contentType(ContentType.JSON)
		.when().body(body).post(baseUrl.concat(endPoint));
		
		SerenityRest.lastResponse().prettyPeek();
		
	}
	public static void validateStatusCode(int statusCode) {
		int responseStatusCode = SerenityRest.lastResponse().getStatusCode();
		Assert.assertEquals(responseStatusCode, statusCode);
	}


	public static void executeGetNoToken(String endPoint, String referencia) {
		SerenityRest.given()
		.contentType(ContentType.JSON)
		.when().post(baseUrl.concat(endPoint).concat(referencia));
		
		SerenityRest.lastResponse().prettyPeek();
	}

}
