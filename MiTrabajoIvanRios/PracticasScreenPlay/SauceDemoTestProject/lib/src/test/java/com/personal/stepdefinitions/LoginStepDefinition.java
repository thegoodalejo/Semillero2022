package com.personal.stepdefinitions;

import org.hamcrest.core.IsEqual;

import com.personal.exceptions.InvalidCredentials;
import com.personal.questions.TitleInventory;
import com.personal.questions.UserLockedError;
import com.personal.tasks.LoginTask;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStepDefinition {
	private String actorName;
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} esta en la pagina principal")
	public void estaEnLaPaginaPrincipal(String actorName, DataTable dataTable) {
		this.actorName=actorName;
		OnStage.theActorCalled(actorName).attemptsTo(Open.url("https://www.saucedemo.com/"));
	   
	}

	@When("diligencie el formulario del login")
	public void diligencieElFormularioDelLogin(DataTable dataTable) {
	    OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.login(dataTable));
	}

	@Then("es dirigido hacia la pagina de inventario")
	public void esDirigidoHaciaLaPaginaDeInventario() {
	    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("The Displayed title", TitleInventory.value(), IsEqual.equalTo("PRODUCTS")).orComplainWith(InvalidCredentials.class,"Credencialies Incorrectas"));
	    
	}

	@Then("se visualiza mensaje {string}")
	public void seVisualizaMensaje(String message) {
	    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("The Error Message",UserLockedError.value(), IsEqual.equalTo(message)));
	}
}
