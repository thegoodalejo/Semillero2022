package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.tasks.BookFlight;
import com.sophos.semillero.tasks.OpenUrlBookFlight;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BookFlightStepDefinition {
	@Before
	public void setup() {

		OnStage.setTheStage(new OnlineCast());

	}

	@Given("{string} se encuentra en el HomePage")
	public void seEncuentraEnElHomePage(String string) {
		OnStage.theActorCalled(string).wasAbleTo(OpenUrlBookFlight.book());
	}

	@When("realiza una busqueda de vuelo")
	public void realizaUnaBusquedaDeVuelo(DataTable dataTable) {
		OnStage.theActorInTheSpotlight().wasAbleTo(BookFlight.book(dataTable));
	}

	@Then("encuentra el vuelo mas barato")
	public void encuentraElVueloMasBarato() {
		
	}
}
