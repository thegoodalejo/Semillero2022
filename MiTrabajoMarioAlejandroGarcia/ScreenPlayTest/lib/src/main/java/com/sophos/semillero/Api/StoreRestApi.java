package com.sophos.semillero.Api;


import com.sophos.semillero.restInteractions.StoreRestInteractions;

import io.cucumber.datatable.DataTable;

public class StoreRestApi {
	public static void setBaseUrl(String baseUrl) {
		StoreRestInteractions.setBaseUrl(baseUrl);
	}
	public static void executePost(String endPoint, DataTable infoUser) {
		StoreRestInteractions.executePost(endPoint, infoUser.asMap(String.class, String.class));
	}

}
