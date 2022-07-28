package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.Api.JsonPlaceHolderRestApi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JsonPlaceHolderGetPostByIdStepDefinitions {
	
	@When("enviamos la informacion del post al endpoint {string} por id {string}")
	public void enviamosLaInformacionDelPostAlEndpointPorId(String endPoint, String id) {
		JsonPlaceHolderRestApi.executeGet(endPoint, id);
	}
	
	@Then("vemos que el status code del post consultado es {int}")
	public void vemosQueElStatusCodeDelPostConsultadoEs(Integer statusCode) {
		JsonPlaceHolderRestApi.validateStatusCode(statusCode);
	}
	
}
