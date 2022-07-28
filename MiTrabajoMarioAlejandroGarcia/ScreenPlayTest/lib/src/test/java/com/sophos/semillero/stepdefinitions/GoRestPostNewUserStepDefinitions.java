package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.Api.GoRestApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoRestPostNewUserStepDefinitions {
	
	@Given("quiero establecer la base URL {string}")
	public void quieroEstablecerLaBaseURL(String baseUrl) {
	    GoRestApi.setBaseUrl(baseUrl);
	}

	@When("enviamos la informacion del usuario al endpoint {string}")
	public void enviamosLaInformacionDelUsuarioAlEndpoint(String endPoint, DataTable infoUsuario) {
	    GoRestApi.executePostWithToken(endPoint, infoUsuario);	
	}

	@Then("vemos que el status code es {int}")
	public void vemosQueElStatusCodeEs(Integer int1) {
	    
	}

}
