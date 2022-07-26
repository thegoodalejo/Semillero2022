package com.sophos.semillero.restinteractions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sophos.semillero.models.ConvertValues;

import io.cucumber.datatable.DataTable;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class FrankfurterRestInteraction {

	private static String baseUrl;
	private static List<ConvertValues> divisaValues;
	private static Map<String,Float> convertions = new HashMap<>(); 
	private static Map<String, Float> mapEuroValues;
	
	public static void setBaseUrl(String baseUrl) {
		FrankfurterRestInteraction.baseUrl=baseUrl;
	}
	
	public static void executeGetForexValues(String endPoint) {
		SerenityRest.given().contentType(ContentType.JSON)
		.get(baseUrl.concat(endPoint));
		
		SerenityRest.lastResponse().prettyPeek();
	}
	
	public static void executePostConvertEuros(DataTable data, String endPoint) {
		SerenityRest.given().contentType(ContentType.JSON)
		.get(baseUrl.concat(endPoint));
				
		FrankfurterRestInteraction.divisaValues = data.asList(ConvertValues.class);
		mapEuroValues = SerenityRest.lastResponse().jsonPath().getMap("rates");
		for(ConvertValues divisa:divisaValues) {
			Float dataConvert = Float.parseFloat(divisa.getQuantity())*mapEuroValues.get(divisa.getDivisa());
			convertions.put(divisa.getDivisa(), dataConvert);
		}
	}
	
	public static void printPostConvertEuros() {
		for(String key:convertions.keySet()) {
			System.out.println("----------------------------------------");
			System.out.println("Conversión de EUR a "+key);
			System.out.println("Valor del "+key+": "+mapEuroValues.get(key));
			System.out.println("Cantidad de EUR a convertir: "+Math.round(convertions.get(key)/mapEuroValues.get(key)));
			System.out.println("----------------------------------------");
			System.out.println("Resultado: "+convertions.get(key));
			System.out.println("----------------------------------------"+"\n");
			
		}
	}
}
