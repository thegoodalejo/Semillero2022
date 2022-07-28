package com.sophos.semillero.Api;

import java.util.Map;

import org.junit.Assert;

import com.sophos.semillero.restInteractions.RestInteractions;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.rest.SerenityRest;

public class GoRestApi {
	
	private static final String TOKEN = "395091e02570786cde594d7098e7bf707259118f559b17c163bf6be6e7e6416b";
	
	public static void setBaseUrl(String baseUrl) {
		RestInteractions.setBaseUrl(baseUrl);
	}
	public static void executePostWithToken(String endPoint, DataTable infoUsuario) {
		RestInteractions.executePostWithToken(endPoint, infoUsuario.asMap(String.class, String.class), TOKEN);;
	}
	public static void executeGetWithToken(String endPoint,String id) {
		RestInteractions.executeGetWithToken(endPoint, id, TOKEN);
	}
	public static void validateResponse(int statusCode, String name) {
		RestInteractions.validateStatusCode(statusCode);
		RestInteractions.validateDataResponse(name, "name");
	}
	
}
