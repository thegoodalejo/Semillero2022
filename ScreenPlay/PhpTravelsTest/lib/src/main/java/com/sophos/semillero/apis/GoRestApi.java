package com.sophos.semillero.apis;

import com.sophos.semillero.restinteractions.RestInteractions;

import io.cucumber.datatable.DataTable;

public class GoRestApi {
	
	private static final String TOKEN = "39344332e50b5157226e66bc1dae1c43f04950251a1fd1f884c577d4168147e4";
	
	public static void setBaseUrl(String baseUrl) {
		RestInteractions.setBaseUrl(baseUrl);
	}
	
	public static void executePostWithToken(String endPoint, DataTable infoUsuario) {
		RestInteractions.executePostWithToken(endPoint, infoUsuario.asMap(String.class, String.class), TOKEN);
	}

}
