package com.personal.stepdefinitions;

import com.personal.apis.GoRestApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class GoRestPostNewUserStepDefinition {

	@Given("I want to set the base url {string}")
	public void iWantToSetTheBaseUrl(String baseUrl) {
	   GoRestApi.setBaseUrl(baseUrl);
	}

	@When("I seend the information to {string}")
	public void iSeendTheInformationTo(String endPoint, DataTable infoUsuario) {
		GoRestApi.executePostWithToken(endPoint, infoUsuario);	   
	}

	@Then("I hope status code {int}")
	public void iHopeStatusCode(Integer int1) {
	   
	}

}
