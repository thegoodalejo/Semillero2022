package com.falabella.loyalty.api;

import com.falabella.loyalty.restinteractions.RestInteraction;

import io.cucumber.datatable.DataTable;

public class LdrGenerateCustomerKeyApi {
	
	public static void setBaseUrl(String baseUrl) {

		RestInteraction.setBaseUrl(baseUrl);
	}
	
	public static void excecutePost(DataTable infoUsuario) {
		RestInteraction.excecutePost(infoUsuario.asMap(String.class, String.class));
	}
	
	public static void validateResponse(String status) {
		RestInteraction.validateResponse(status, "status");
	}

}
