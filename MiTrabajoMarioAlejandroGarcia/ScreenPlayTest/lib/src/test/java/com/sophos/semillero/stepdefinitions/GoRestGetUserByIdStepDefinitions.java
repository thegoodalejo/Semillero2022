package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.Api.GoRestApi;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoRestGetUserByIdStepDefinitions {
	
	@When("enviamos la informacion del usuario al endpoint {string} por id {string}")
	public void enviamosLaInformacionDelUsuarioAlEndpointPorId(String endPoint, String id) {
	    GoRestApi.executeGetWithToken(endPoint, id);
	}

	@Then("vemos que el status code es {int} y que contenga el nombre {string}")
	public void vemosQueElStatusCodeEsYQueContengaElNombre(Integer statusCode, String data) {
	    GoRestApi.validateResponse(statusCode, data);
	}

}
