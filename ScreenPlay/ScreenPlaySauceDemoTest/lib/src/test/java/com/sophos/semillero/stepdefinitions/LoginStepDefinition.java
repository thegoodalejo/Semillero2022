package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.questions.TitleInventory;
import com.sophos.semillero.tasks.DoLogin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinition {
	
	private String actorName;
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} ingreso a la pagina principal")
	public void ingresoALaPaginaPrincipal(String actorName) {
		
		this.actorName = actorName;
		OnStage.theActor(actorName).attemptsTo(Open.url("https://www.saucedemo.com/"));
		
	}

	@When("diligencio el formulario de login")
	public void diligencioElFormularioDeLogin(DataTable credentials) {
		
		OnStage.theActor(actorName).attemptsTo(DoLogin.withParameters(credentials));
		
	}

	@Then("le redirecciono a la pagina de inventario")
	public void leRedireccionoALaPaginaDeInventario() {
	
		theActorInTheSpotlight().should(
				seeThat("The displayed title", TitleInventory.value(), equalTo("PRODUCTS"))
		);
		
	}

}
