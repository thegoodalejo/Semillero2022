package com.sophos.semillero.restinteractions;

import java.util.Map;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class LoginPruebaPostInteractions {
	
private static String baseUrl;
	
	public static void setBaseUrl(String baseUrl) {
		LoginPruebaPostInteractions.baseUrl=baseUrl;
	}
	
	public static void executePostLogin(String endPoint, Map<String,String> body) {
		SerenityRest.given()
		.contentType(ContentType.JSON)
		.when().body(body)
		.post(baseUrl.concat(endPoint));
		
		SerenityRest.lastResponse().prettyPeek();
		
	}

}
