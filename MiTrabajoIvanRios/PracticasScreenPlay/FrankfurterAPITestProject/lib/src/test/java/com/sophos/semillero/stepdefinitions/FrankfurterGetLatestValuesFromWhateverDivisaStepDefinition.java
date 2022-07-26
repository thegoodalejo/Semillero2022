package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.restinteractions.FrankfurterRestInteraction;

import io.cucumber.java.en.When;

public class FrankfurterGetLatestValuesFromWhateverDivisaStepDefinition {
	
	@When("opens the endpoint {string} for {string}")
	public void opensTheEndpointFor(String endpoint1, String endpoint2) {
	    FrankfurterRestInteraction.executeGetForexValues(endpoint1.concat(endpoint2));
	}
}
