package com.falabella.loyalty.stepdefinitions;

import com.falabella.loyalty.api.LdrGetCustomerByKeyApi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LdrGetCustomerByKeyStepDefinition {
	@Given("Yo quiero establecer la baseurl {string}")
	public void yoQuieroEstablecerLaBaseurl(String baseUrl) {
		LdrGetCustomerByKeyApi.setBaseUrl(baseUrl);
	}

	@When("envio la key del usuario {string}")
	public void envioLaKeyDelUsuario(String key) {
		LdrGetCustomerByKeyApi.executeGetCostumerByKey(key);
	}

	@Then("valido estatus {string} y estatuscode {int}")
	public void validoEstatusYEstatuscode(String status, Integer statuscode) {
	LdrGetCustomerByKeyApi.validateResponse(status, statuscode);	
	}
}
