package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.apis.GoRestApi;
import com.sophos.semillero.tasks.NewLoginSauceDemo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CrearUsuarioStepDefinitions {
	
	@Given("quiero establecer la base url {string}")
	public void quieroEstablecerLaBaseUrl(String baseUrl) {
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