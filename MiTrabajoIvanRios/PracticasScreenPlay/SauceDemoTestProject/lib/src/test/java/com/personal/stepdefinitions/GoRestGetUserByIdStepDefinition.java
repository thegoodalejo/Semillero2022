package com.personal.stepdefinitions;

import com.personal.apis.GoRestApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class GoRestGetUserByIdStepDefinition {

	@When("I send the id {string} to the endpoint {string}")
	public void iSendTheIdToTheEndpoint(String id, String endPoint) {
	    GoRestApi.executeGetWithToken(endPoint, id);
	}

	@Then("I see that name is equal to {string}")
	public void iSeeThatNameIsEqualTo(String name) {
	    GoRestApi.validateResponse(200, name);
	}

}
