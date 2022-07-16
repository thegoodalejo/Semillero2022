package com.sophos.semillero.stepdefinitions;
import com.sophos.semillero.tasks.SaucedemoLogin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SaucedemoLoginStepDefinitions {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} se encuentra en la pagina del login")
	public void seEncuentraEnLaPaginaDelLogin(String actorName, DataTable dataTable) {
		OnStage.theActorCalled(actorName).wasAbleTo(SaucedemoLogin.login(dataTable));	
	}
	
	@When("llena los campos")
	public void llenaLosCampos() {
	}

	@Then("Visualiza la lista de productos")
	public void visualizaLaListaDeProductos() {
		
	}

}
