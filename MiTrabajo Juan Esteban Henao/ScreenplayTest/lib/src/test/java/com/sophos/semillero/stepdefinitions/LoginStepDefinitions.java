package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.task.NewToursLogIn;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStepDefinitions {
	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("El {string} se encuentra en la pagina principal")
	public void elUsuarioSeEncuentraEnLaPaginaPrincipal(String actorName, DataTable dataTable) {
		OnStage.theActorCalled(actorName).wasAbleTo(NewToursLogIn.login(dataTable));
		//Serenity.getDriver().manage().window().maximize(); para maximizar la ventana
	}

	@When("Ingresa usuario y contrasenia")
	public void ingresaUsuarioYContrasenia() {

	}

	@Then("Visualiza el mensaje de {string}")
	public void visualizaElMensajeDe(String string) {

	}
}
