package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.apis.GoRestApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GoRestNewUserStepDefinition {
	
//	@Before
//	public void setUp() {
//		OnStage.setTheStage(new OnlineCast());
//	}
	
	@Given("quiero establecer la url base {string}")
	public void quieroEstablecerLaUrlBase(String baseUrl) {
	    GoRestApi.setBaseUrl(baseUrl);

	}

	@When("enviamos la informacion del usuario al endpoint {string}")
	public void enviamosLaInformacionDelUsuarioAlEndpoint(String url, DataTable dataTableInfoUsuario) {
	   GoRestApi.executePostWithToken(url, dataTableInfoUsuario);

	}

	@Then("vemos que el status code es {int}")
	public void vemosQueElStatusCodeEs(Integer int1) {
	    

	}

}
