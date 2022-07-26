package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.restinteractions.FrankfurterRestInteraction;

import io.cucumber.java.en.When;

public class FrankfurterGetConvertBetweenDivisasValuesStepDefinition {

	@When("opens the endpoint {string} to a {int} {string} divisa {string} to {string} divisa {string}")
	public void opensTheEndpointToADivisaToDivisa(String latest, Integer quantity, String from, 
			String origin, String to, String destination) {
		
	    String endpoint = latest.concat(String.valueOf(quantity))
	    		.concat(from).concat(origin).concat(to).concat(destination);
	    System.out.println(endpoint);
	    FrankfurterRestInteraction.executeGetForexValues(endpoint);
	    
	}
}
