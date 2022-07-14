package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoguinStepDefinitions {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	
	@Given("El usuario esta en la pagina de login")
	public void elUsuarioEstaEnLaPaginaDeLogin() {
	    // Write code here that turns the phrase above into concrete actions
		OnStage.theActorCalled("santiago").wasAbleTo(Open.url("https://www.google.com/"));
	
	}

	@When("validara el usuario")
	public void validaraElUsuario() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("y su clave")
	public void ySuClave() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("entrara a la pagina de vuelos")
	public void entraraALaPaginaDeVuelos() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	
}
