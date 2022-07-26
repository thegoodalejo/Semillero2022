package com.falabella.loyalty.stepdefinitions;

import com.falabella.loyalty.api.LdrGenerateCustomerKeyApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LdrPostGenerateCustomerKeyStepDefinition {
	
	@Given("Yo quiero establecer la base url {string}")
	public void yoQuieroEstablecerLaBaseUrl(String baseUrl) {
	    LdrGenerateCustomerKeyApi.setBaseUrl(baseUrl);
	}

	@When("envio la informacion del usuario")
	public void envioLaInformacionDelUsuario(DataTable infoUsuario) {
	 LdrGenerateCustomerKeyApi.excecutePost(infoUsuario);   
	}

	@Then("valido estatus {string} cuando se genera la key")
	public void validoEstatusCuandoSeGeneraLaKey(String status) {
	    LdrGenerateCustomerKeyApi.validateResponse(status);
	}


}
