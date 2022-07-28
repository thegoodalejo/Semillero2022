package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.Api.StoreRestApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreRestPostRegisterNewUserStepDefinitions {
	
	@Given("Quiero establecer la base URL de StoreRestApi {string}")
	public void quieroEstablecerLaBaseURLDeStoreRestApi(String baseUrl) {
		StoreRestApi.setBaseUrl(baseUrl);
	}

	@When("Enviamos la informacion del usuario al endpoint {string}")
	public void enviamosLaInformacionDelUsuarioAlEndpoint(String endPoint, DataTable infoUser) {
	    StoreRestApi.executePost(endPoint, infoUser);
	}

	@Then("Visualizamos que el status code es {int}")
	public void visualizamosQueElStatusCodeEs(Integer int1) {
	    
	}

}
