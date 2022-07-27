package com.sophos.semillero.apis;

import java.util.Map;

import com.sophos.semillero.restinteraction.RestInteraction;

import io.cucumber.datatable.DataTable;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class GoRestApi {
	private static final String TOKEN ="d5fcb855eeb71f47f0d7fbbcffc263d2c82cff927eb603353466b8b006bd8060";
	
	
	public static void setBaseUrl(String url) {
		RestInteraction.setBaseUrl(url);
	}
	
	public static void executePostWithToken(String endPoint, DataTable infoUsuario) {
		RestInteraction.executePostWithToken(endPoint, infoUsuario.asMap(String.class, String.class), TOKEN);
	}
	public static void executeGetWithToken(String endPoint, String id) {
		RestInteraction.executeGetWithToken(endPoint, id, TOKEN);
	}
	public static void validateResponse(int statusCode, String name) {
		RestInteraction.validateStatusCode(statusCode);
		RestInteraction.validateDataResponse(name, "name");
	}

}
