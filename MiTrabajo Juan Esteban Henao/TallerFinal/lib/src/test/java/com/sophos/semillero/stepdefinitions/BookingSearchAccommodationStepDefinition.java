package com.sophos.semillero.stepdefinitions;


import static com.sophos.semillero.interactions.OpenUrl.openUrl;
import static com.sophos.semillero.questions.BookingCheapPrice.cheapPrice;
import static com.sophos.semillero.task.BookingCheapAccommodation.cheapAccommodation;
import static com.sophos.semillero.task.BookingCompleteInfo.completeTheInfo;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BookingSearchAccommodationStepDefinition {
	
	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}
	@Given("I was in the {string}")
	public void iWasInThe(String url) {
		//Inicia la navegación web
		theActorCalled("User").attemptsTo(openUrl(url));
	}
	
	@When("I want to search for an accommodation on the booking page")
	public void iWantToSearchForAnAccommodationOnThePage(DataTable dataTable) {
		//Completa la informacion requerida por la pagina
		theActorInTheSpotlight().wasAbleTo(completeTheInfo(dataTable));
	}

	@Then("To find an accommodation according to my need")
	public void toFindAnAccommodationAccordingToMyNeed() {
		//Ingresa los filtros
		theActorInTheSpotlight().wasAbleTo(cheapAccommodation());
		
		//Pregunta por el mas barato
		theActorInTheSpotlight().asksFor(cheapPrice());
		
	}


}
