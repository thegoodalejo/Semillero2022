package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.api.GoRestApi;
import com.sophos.semillero.restinteractions.RestInteracion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoRestGetUserByIdStepDefinition {

	@When("enviamos la info del usuario por {string} por id {string}")
	public void enviamosLaInfoDelUsuarioPorPor(String endPoint, String id) {
		GoRestApi.executeGetWithToken(endPoint, id);
	}

	@Then("validaremos estatus code {int} y que contenga el nombre {string}")
	public void validaremosEstusCodeYQueContengaElNombre(int codeStatus, String data) {
		GoRestApi.validateResponse(codeStatus, data);
	}

}
