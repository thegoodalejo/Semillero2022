package com.sophos.semillero.apis;

import com.sophos.semillero.restinteractions.FrankfurterRestInteraction;

import io.cucumber.datatable.DataTable;

public class FrankfurterApi {
	
	public static void setBaseUrl(String baseUrl) {
		FrankfurterRestInteraction.setBaseUrl(baseUrl);
	}
	public static void executeGetForexValues(String endPoint) {
		FrankfurterRestInteraction.executeGetForexValues(endPoint);
	}
	public static void executePostConvertEuros(DataTable data, String endPoint) {
		FrankfurterRestInteraction.executePostConvertEuros(data, endPoint);
	}
	public static void printPostConvertEuros() {
		FrankfurterRestInteraction.printPostConvertEuros();
	}
}
