package com.sophos.semillero.apis;

import com.sophos.semillero.restinteractions.RestInteractions;

import io.cucumber.datatable.DataTable;

public class GoRestApi {

	private static final String TOKEN = "924e373132aa40529733d211af3c848390c4d5c6128f7aa5d587bf1870fcaf7d";

	public static void setBaseUrl(String baseUrl) {
		RestInteractions.setBaseUrl(baseUrl);
	}

	public static void executePostWithToken(String endPoint, DataTable infoUsuario) {
		RestInteractions.executePostWithToken(endPoint, infoUsuario.asMap(String.class, String.class), TOKEN);
	}

	public static void executeGetWithToken(String endPoint, String id) {
		RestInteractions.executeGetWithToken(endPoint, id,  TOKEN);

	}
	public static void validateResponse(int statusCode, String name) {
		RestInteractions.validateStatusCode(statusCode);
		RestInteractions.validateDataResponse(name, "name");
	}

}
