package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.tasks.NewLoginSauceDemo;
import com.sophos.semillero.tasks.NewToursLogin;
import com.sophos.semillero.userinterfaces.NewLoginSauceDemoPage;

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
	public void setup(){
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} se encuentra en la pagina principa")
	public void elUsuarioSeEncuentraEnLaPaginaPrincipal(String actorName, DataTable datatable ) {
		OnStage.theActorCalled(actorName).wasAbleTo((NewLoginSauceDemo.login(datatable)));
	}
	
	@When("Ingresa usuario ")
	public void ingresaUsuarioYContrasena() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("visualiza el mensaje d {string}")
	public void visualizaElMensajeDe(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}