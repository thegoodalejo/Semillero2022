package com.sophos.semillero.apis;

import java.util.Map;

import com.sophos.semillero.restinteractions.RestInteractions;

import io.cucumber.datatable.DataTable;

public class GoRestApi {
	
	private static final String TOKEN="c2c7ee480d82452bd767d6d92c98cac0ade79ef77b0b121a2cc56ecb9a7d60c8";
	
	public static void setBaseUrl(String baseUrl) {
		RestInteractions.setBaseUrl(baseUrl);
	}
	
	public static void executePostWithToken(String endPoint, DataTable infoUsuario) {
		RestInteractions.executePostWithToken(endPoint, infoUsuario.asMap(String.class,String.class), TOKEN);
		
	}
	
	public static void executeGettWithToken(String endPoint, String id) {
		RestInteractions.executeGetWithToken(endPoint, id, TOKEN);
		
	}
	
	public static void validateResponse(int statusCode,String name) {
		RestInteractions.validateStatusCode(statusCode);
		RestInteractions.validateDataResponse(name, "name");
	}

}
