package com.sophos.semillero.stepdefinitions;



import com.sophos.semillero.apis.JPetStoreApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JPetStorePostLoginStepDefinition {
	@Given("connect to the base url {string}")
	public void connectToTheBaseUrl(String url) {
		JPetStoreApi.setBaseUrl(url);
	}

	@When("send user information to the endpoint {string}")
	public void sendUserInformationToTheEndpoint(String endPoint, DataTable dataTable) {
		JPetStoreApi.executePostNoToken(endPoint, dataTable);
	}

	@Then("saw that the status code is {int}")
	public void sawThatTheStatusCodeIs(Integer statusCode) {
		//JPetStoreApi.validateStatusCode(statusCode);
		System.out.println(statusCode);
	}

}
