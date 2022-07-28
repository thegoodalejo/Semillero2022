package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.Api.JsonPlaceHolderRestApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JsonPlaceHolderNewPostStepDefinitions {
	
	@Given("quiero establecer la base URL de jsonplaceholder {string}")
	public void quieroEstablecerLaBaseURLDeJsonplaceholder(String endPoint) {
		JsonPlaceHolderRestApi.setBaseUrl(endPoint);
	}

	@When("enviamos la informacion del post al endpoint {string}")
	public void enviamosLaInformacionDelPostAlEndpoint(String endPoint,DataTable infoPost) {
		JsonPlaceHolderRestApi.executePost(endPoint, infoPost);
	    
	}

	@Then("vemos que el status code del nuevo post es {int}")
	public void vemosQueElStatusCodeDelNuevoPostEs(Integer int1) {
	    
	}

}
