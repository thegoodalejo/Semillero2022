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
	public void setup(){
		OnStage.setTheStage(new OnlineCast());
	}
	
	
	@Given("El usuario se encuentra en la pagina principal")
	public void elUsuarioSeEncuentraEnLaPaginaPrincipal() {
		OnStage.theActorCalled("Juan").wasAbleTo(Open.url("www.google.com"));
		
	}
	

	@When("Ingresa usuario y contrasena")
	public void ingresaUsuarioYContrasena() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	

	@Then("visualiza el mensaje de {string}")
	public void visualizaElMensajeDe(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
