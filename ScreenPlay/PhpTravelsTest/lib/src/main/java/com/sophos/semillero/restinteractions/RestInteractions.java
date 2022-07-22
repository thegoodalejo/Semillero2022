package com.sophos.semillero.restinteractions;

import java.util.Map;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class RestInteractions {
	
	private static String baseUrl;
	
	public static void setBaseUrl(String baseUrl) {
		RestInteractions.baseUrl = baseUrl;
	}
	
	public static void executePostWithToken(String endPoint, Map<String,String> body, String token) {
		SerenityRest.given().auth().oauth2(token)
		.contentType(ContentType.JSON)
		.when().body(body)
		.post(baseUrl.concat(endPoint));
		
		SerenityRest.lastResponse().prettyPeek();
	}

}
