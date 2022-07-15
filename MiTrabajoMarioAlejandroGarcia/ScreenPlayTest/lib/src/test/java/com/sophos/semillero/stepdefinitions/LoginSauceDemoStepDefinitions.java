package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.tasks.SauceDemoLogin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginSauceDemoStepDefinitions {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} se encuentra en la pagina principal de SauceDemo")
	public void elUsuarioSeEncuentraEnLaPaginaPrincipalDeSauceDemo(String actorName, DataTable dataTable) {
		OnStage.theActorCalled(actorName).wasAbleTo(SauceDemoLogin.login(dataTable));
	    
	}

	@When("Ingresa sus credenciales")
	public void ingresaSusCredenciales() {
	    
	}

	@Then("Se redirige a la pagina de Inventario de productos")
	public void seRedirigeALaPaginaDeInventarioDeProductos() {
	    
	}


}
