package com.sophos.semillero.stepdefinitions;


import com.sophos.semillero.tasks.NewToursLogin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Data;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStepDefinitions {

	@Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

	@Given("{string} se encuentra en la pagina principal")
	public void seEncuentraEnLaPaginaPrincipal(String actorName, DataTable dataTable) {
		//se llama al constructor con string
	    OnStage.theActorCalled(actorName).wasAbleTo((NewToursLogin.loginWithString(dataTable)));
	}

	@When("Ingresa sus credenciales")
	public void IngresaSusCredenciales() {
	}

	@Then("Se redirige a la pagina de Inventario de productos")
	public void seRedirigeALapaginaDeInventariodDeProducto() {
		
	}
}
