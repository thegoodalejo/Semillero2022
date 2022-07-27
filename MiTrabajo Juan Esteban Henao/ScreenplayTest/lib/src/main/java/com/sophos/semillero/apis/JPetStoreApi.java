package com.sophos.semillero.apis;

import com.sophos.semillero.restinteraction.JPetStoreInteraction;

import io.cucumber.datatable.DataTable;

public class JPetStoreApi {

	public static void setBaseUrl(String url) {
		JPetStoreInteraction.setBaseUrl(url);
	}
	
	public static void executePostNoToken(String endPoint, DataTable infoUsuario) {
		JPetStoreInteraction.executePostNoToken(endPoint, infoUsuario.asMap(String.class, String.class));
	}
	public static void validateStatusCode(int statusCode) {
		JPetStoreInteraction.validateStatusCode(statusCode);
	}

	public static void executeGetNoToken(String endPoint, String referencia) {
		JPetStoreInteraction.executeGetNoToken(endPoint, referencia);
		
	}
	
	
}
