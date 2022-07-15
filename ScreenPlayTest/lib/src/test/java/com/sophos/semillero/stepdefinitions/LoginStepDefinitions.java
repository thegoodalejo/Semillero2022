package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.tasks.NewToursLogin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStepDefinitions {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	@Given("{string} se encuentra en la pagina principal")
	public void elUsuarioSeEncuentraEnLaPaginaPrincipal(String actorName, DataTable datatable) {
	    // Write code here that turns the phrase above into concrete actions
		OnStage.theActorCalled(actorName).wasAbleTo(NewToursLogin.login(datatable));	
		}

	@When("Ingresa Usuario y Contrasenia")
	public void ingresaUsuarioYContrasenia() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("Visualiza el mensaje {string}")
	public void visualizaElMensaje(String string) {
	    // Write code here that turns the phrase above into concrete actions
	}


}
