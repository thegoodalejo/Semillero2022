package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStepDefinitions {
	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("El usuario se encuentra en la pagina principal")
	public void elUsuarioSeEncuentraEnLaPaginaPrincipal() {
		OnStage.theActorCalled("Juan").wasAbleTo(Open.url("https://www.google.com"));
	}

	@When("Ingresa usuario y contrasenia")
	public void ingresaUsuarioYContrasenia() {

	}

	@Then("Visualiza el mensaje de {string}")
	public void visualizaElMensajeDe(String string) {

	}
}
