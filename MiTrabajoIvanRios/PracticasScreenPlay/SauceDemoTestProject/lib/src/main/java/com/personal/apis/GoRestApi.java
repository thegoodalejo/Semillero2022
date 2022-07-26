package com.personal.apis;

import com.personal.restinteractions.GoRestInteraction;

import io.cucumber.datatable.DataTable;

public class GoRestApi {
	
	private static final String TOKEN ="f63cf1d7f39dac11336d64c1b6dc33adf65b4ad1d5aa21aecbd6ebacd358ff38";
	
	public static void setBaseUrl(String baseUrl) {
		GoRestInteraction.setBaseUrl(baseUrl);
	}
	
	public static void executePostWithToken(String endPoint, DataTable infoUsuario) {
		GoRestInteraction.executePostWithToken(endPoint, infoUsuario.asMap(String.class, String.class), TOKEN);
	}
	
	public static void executeGetWithToken(String endPoint, String id) {
		GoRestInteraction.executeGetWithToken(endPoint, id, TOKEN);
	}
	
	public static void validateResponse(int statusCode, String name) {
		GoRestInteraction.validateStatusCode(statusCode);
		GoRestInteraction.validateDataResponse(name,"name");
	}

}
