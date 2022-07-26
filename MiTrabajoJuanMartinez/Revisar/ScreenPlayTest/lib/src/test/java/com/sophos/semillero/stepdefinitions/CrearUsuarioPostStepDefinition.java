package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.api.GoRestApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CrearUsuarioPostStepDefinition {
	
	@Given("quiero establecer la base url {string}")
	public void quieroEstablecerLaBaseUrl(String baseUrl) {
		GoRestApi.setBaseUrl(baseUrl);
	   
	}

	@When("enviamos la info del usuario por {string}")
	public void enviamosLaInfoDelUsuarioPor(String endPoint, DataTable infoUsuario) {
	    GoRestApi.executePostWithToken(endPoint,infoUsuario);
	}

	@Then("validaremos estus code {int}")
	public void validaremosEstusCode(Integer int1) {
	    
	}
}
