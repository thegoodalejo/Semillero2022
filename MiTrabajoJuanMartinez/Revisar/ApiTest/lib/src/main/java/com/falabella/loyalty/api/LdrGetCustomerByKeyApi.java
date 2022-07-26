package com.falabella.loyalty.api;

import com.falabella.loyalty.restinteractions.GetCustomerByKeyRestInteraction;
import com.falabella.loyalty.restinteractions.RestInteraction;

public class LdrGetCustomerByKeyApi {

	private static final String TOKEN = "AIzaSyDc3NBYI1lJGkUDp6_27s1-iSF2vWWWd9I";

	public static void setBaseUrl(String baseUrl) {
		GetCustomerByKeyRestInteraction.setBaseUrl(baseUrl);
	}
	
	public static void executeGetCostumerByKey(String key) {
		GetCustomerByKeyRestInteraction.executeGetCostumerByKey(key, TOKEN);
	}
	
	public static void validateResponse(String status, int statusCode) {
		GetCustomerByKeyRestInteraction.validateStatusResponse(status,"status");
		GetCustomerByKeyRestInteraction.validateStatusCodeResponse(statusCode);
	}

}
