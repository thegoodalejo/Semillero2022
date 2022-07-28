package com.sophos.semillero.restInteractions;

import java.util.Map;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class StoreRestInteractions {
private static String baseUrl;
	
	public static void setBaseUrl(String baseUrl) {
		StoreRestInteractions.baseUrl = baseUrl;	
	}
	public static void executePost(String endPoint, Map<String, String> body) {
		SerenityRest.given().contentType(ContentType.JSON).when().body(body)
		.post(baseUrl.concat(endPoint));
		
		SerenityRest.lastResponse().prettyPeek();
	}

}
