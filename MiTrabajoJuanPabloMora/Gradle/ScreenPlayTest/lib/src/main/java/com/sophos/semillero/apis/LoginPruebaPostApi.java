package com.sophos.semillero.apis;

import com.sophos.semillero.restinteractions.LoginPruebaPostInteractions;

import io.cucumber.datatable.DataTable;

public class LoginPruebaPostApi {
	
	public static void setBaseUrl(String baseUrl) {
		LoginPruebaPostInteractions.setBaseUrl(baseUrl);
	}
	
	public static void executePost(String endPoint, DataTable infoPost) {
		LoginPruebaPostInteractions.executePostLogin(endPoint, infoPost.asMap(String.class,String.class));
		
	}

}
