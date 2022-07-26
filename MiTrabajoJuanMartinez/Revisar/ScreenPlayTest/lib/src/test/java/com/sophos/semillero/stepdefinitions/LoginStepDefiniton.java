package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.tasks.NewToursLogin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStepDefiniton {
	
	@Before
	public void setup() {

		OnStage.setTheStage(new OnlineCast());

	}

	@Given("{string} se encuentra en la pagina principal")
	public void elUsuarioSeEncuentraEnLaPaginaPrincipal(String actorName, DataTable dataTable) {
		OnStage.theActorCalled(actorName).wasAbleTo(NewToursLogin.login(dataTable));
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("Ingresa credenciales")
	public void ingresaCredenciales() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("visualiza el mensaje de {string}")
	public void visualizaElMensajeDe(String string) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

}
