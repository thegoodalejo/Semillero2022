package com.sophos.semillero.apis;

import com.sophos.semillero.restinteractions.JsonPlaceHolderRestInteractions;

import io.cucumber.datatable.DataTable;

public class JsonPlaceHolderRestApi {
	
	public static void setBaseUrl(String baseUrl) {
		JsonPlaceHolderRestInteractions.setBaseUrl(baseUrl);
	}
	
	public static void executePost(String endPoint, DataTable infoPost) {
		JsonPlaceHolderRestInteractions.executePost(endPoint, infoPost.asMap(String.class,String.class));
		
	}
	
	public static void executeGet(String endPoint, String id) {
		JsonPlaceHolderRestInteractions.executeGet(endPoint, id);
		
	}

}
