package com.sophos.semillero.api;



import com.sophos.semillero.restinteractions.RestInteracion;

import io.cucumber.datatable.DataTable;

public class GoRestApi {
	
	private static final String TOKEN="00bebaca619140d36328b7f574eb5995563a2c56ea5eb1c74cd530bd64b092e9";

	public static void setBaseUrl(String baseUrl) {

		RestInteracion.setBaseUrl(baseUrl);
	}

	public static void executePostWithToken(String endPoint, DataTable infoUsuario) {
		RestInteracion.executePostWithToken(endPoint, infoUsuario.asMap(String.class, String.class), TOKEN);
	}
	
	public static void executeGetWithToken(String endPoint, String id) {
		RestInteracion.executeGetWithToken(endPoint, id, TOKEN);
	}
	
	public static void validateResponse(int statusCode, String name) {
		RestInteracion.validateResponseStatusCode(statusCode);
		RestInteracion.validateDateResponse(name,"name");
	}

}
