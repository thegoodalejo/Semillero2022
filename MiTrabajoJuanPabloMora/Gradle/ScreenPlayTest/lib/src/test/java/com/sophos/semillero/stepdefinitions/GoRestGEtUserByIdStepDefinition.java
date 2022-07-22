package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.apis.GoRestApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoRestGEtUserByIdStepDefinition {
	
	
	@When("enviamos la informacion del usuario al endpoint {string}, por id {string}")
	public void enviamosLaInformacionDelUsuarioAlEndpointPorId(String endPoint, String id) {
		
		GoRestApi.executeGettWithToken(endPoint, id);

	}
	
	@Then("vemos que el status code es {int} y que contenga el nombre {string}")
	public void vemosQueElStatusCodeEsYQueContengaElNombre(int statusCode, String data) {
		GoRestApi.validateResponse(statusCode, data);

	}

}
