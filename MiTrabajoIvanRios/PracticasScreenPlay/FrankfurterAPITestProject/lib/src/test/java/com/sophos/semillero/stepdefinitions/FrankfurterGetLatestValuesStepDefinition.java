package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.apis.FrankfurterApi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FrankfurterGetLatestValuesStepDefinition {

	
	@Given("{string} sets the base url {string}")
	public void setsTheBaseUrl(String actor, String baseUrl) {
	    FrankfurterApi.setBaseUrl(baseUrl);
	}

	@When("opens the endpoint {string}")
	public void opensTheEndpoint(String endPoint) {
	    FrankfurterApi.executeGetForexValues(endPoint);
	}

	@Then("can see the forex list values")
	public void canSeeTheForexListValues() {
	    
	}

}
