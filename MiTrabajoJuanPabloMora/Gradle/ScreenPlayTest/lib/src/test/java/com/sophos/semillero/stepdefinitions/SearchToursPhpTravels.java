package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.tasks.NewLoginSauceDemo;
import com.sophos.semillero.tasks.NewSearchToursPhpTravels;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SearchToursPhpTravels {
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} se encuentra en la pagina principal de PhpTravels")
	public void seEncuentraEnLaPaginaPrincipalDePhpTravels(String actorName, DataTable Datatable) {
		OnStage.theActorCalled(actorName).wasAbleTo((NewSearchToursPhpTravels.searchTours(Datatable)));
	}

	@When("Ingresa parametros de busqueda")
	public void ingresaParametrosDeBusqueda() {
	    
	}

	@Then("Se redirige a la pagina de Busqueda de Tours")
	public void seRedirigeALaPaginaDeBusquedaDeTours() {
	    
	}
	
}