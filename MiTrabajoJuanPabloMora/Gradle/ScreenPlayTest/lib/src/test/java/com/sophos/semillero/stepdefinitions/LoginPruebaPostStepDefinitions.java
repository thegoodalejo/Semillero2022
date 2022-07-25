package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.apis.LoginPruebaPostApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPruebaPostStepDefinitions {
	
	@Given("quiero establecer la base url en login prueba {string}")
	public void quieroEstablecerLaBaseUrlEnLoginPrueba(String endPoint) {
          LoginPruebaPostApi.setBaseUrl(endPoint);
	}
	
	@When("enviamos las credenciales al endpoint {string}")
	public void enviamosLasCredencialesAlEndpoint(String endPoint, DataTable infoPost) {
		LoginPruebaPostApi.executePost(endPoint, infoPost);
	}

	@Then("vemos que el login es exitoso {int}")
	public void vemosQueElLoginEsExitoso(Integer int1) {

	}

}
