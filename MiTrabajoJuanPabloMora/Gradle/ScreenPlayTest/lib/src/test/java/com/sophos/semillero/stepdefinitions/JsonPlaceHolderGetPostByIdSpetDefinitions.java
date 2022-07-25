package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.apis.JsonPlaceHolderRestApi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class JsonPlaceHolderGetPostByIdSpetDefinitions {
	
	@Given("quiero establecer la base url en jsonplaceholder para el get {string}")
	public void quieroEstablecerLaBaseUrlEnJsonplaceholderParaElGet(String endPoint) {
		JsonPlaceHolderRestApi.setBaseUrl(endPoint);
	}

	@When("enviamos la peticion del post al endpoint {string}, por id {string}")
	public void enviamosLaPeticionDelPostAlEndpointPorId(String endPoint, String id) {
		
		JsonPlaceHolderRestApi.executeGet(endPoint, id);
	}

}
