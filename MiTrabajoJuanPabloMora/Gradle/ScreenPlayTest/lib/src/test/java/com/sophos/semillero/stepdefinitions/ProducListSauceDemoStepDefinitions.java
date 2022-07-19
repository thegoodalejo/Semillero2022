package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.tasks.NewLoginSauceDemo;
import com.sophos.semillero.tasks.NewProductListSauceDemo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ProducListSauceDemoStepDefinitions {
	
	@Before
	public void setup(){
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} se encuentra en la pagina inventarios")
	public void elUsuarioSeEncuentraEnLaPaginaInventarios(String actorName, DataTable datatable ) {
		OnStage.theActorCalled(actorName).wasAbleTo((NewProductListSauceDemo.login(datatable)));
		
	}
	
	@When("Ingresa a la lista de articulos")
	public void IngresaALaListaDeArticulos() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("agrega 2 articulos al carrito {string}")
	public void agrega2ArticulosAlCarrito(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}
