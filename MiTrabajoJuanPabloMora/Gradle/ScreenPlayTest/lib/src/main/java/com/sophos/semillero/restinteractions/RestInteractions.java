package com.sophos.semillero.restinteractions;

import java.util.Map;

import org.junit.Assert;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class RestInteractions {
	
	private static String baseUrl;
	
	public static void setBaseUrl(String baseUrl) {
		RestInteractions.baseUrl=baseUrl;
	}
	
	public static void executePostWithToken(String endPoint, Map<String,String> body, String token) {
		SerenityRest.given().auth().oauth2(token)
		.contentType(ContentType.JSON)
		.when().body(body)
		.post(baseUrl.concat(endPoint));
		
		SerenityRest.lastResponse().prettyPeek();
		
	}
	
	public static void executeGetWithToken(String endPoint, String id, String token) {
		SerenityRest.given().auth().oauth2(token)
		.get(baseUrl.concat(endPoint).concat(id));
		
		SerenityRest.lastResponse().prettyPeek();
		
	}
	
	public static void validateStatusCode(int statusCode){
		int responseStatusCode = SerenityRest.lastResponse().getStatusCode();
		Assert.assertEquals(statusCode, responseStatusCode);
	}
	public static void validateDataResponse(String data,String path){
		String actualData = SerenityRest.lastResponse().jsonPath().getString(path);
		System.out.print("path: "+path+" -- > "+actualData);
		Assert.assertEquals(data, actualData);
	}
	

}
