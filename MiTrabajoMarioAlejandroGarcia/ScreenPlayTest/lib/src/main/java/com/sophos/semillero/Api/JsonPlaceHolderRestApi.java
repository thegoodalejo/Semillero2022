package com.sophos.semillero.Api;

import com.sophos.semillero.restInteractions.JsonPlaceHolderRestInteractions;
import com.sophos.semillero.restInteractions.RestInteractions;

import io.cucumber.datatable.DataTable;

public class JsonPlaceHolderRestApi {
	
	public static void setBaseUrl(String baseUrl) {
		JsonPlaceHolderRestInteractions.setBaseUrl(baseUrl);
	}
	public static void executePost(String endPoint, DataTable infoPost) {
		JsonPlaceHolderRestInteractions.executePost(endPoint, infoPost.asMap(String.class, String.class));
	}
	public static void executeGet(String endPoint,String id) {
		JsonPlaceHolderRestInteractions.executeGet(endPoint, id);
	}
	public static void validateStatusCode(int statusCode) {
		JsonPlaceHolderRestInteractions.validateStatusCode(statusCode);
	}
	
	
}
