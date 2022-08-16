package com.sophos.semillero.stepdefinitions;


import static com.sophos.semillero.task.BookingCheapAccommodation.cheapAccommodation;
import static com.sophos.semillero.task.BookingCompleteInfo.completeTheInfo;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophos.semillero.task.BookingCheapAccommodation;
import com.sophos.semillero.task.BookingCompleteInfo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BookingSearchAccommodationStepDefinition {
	
	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@When("I want to search for an accommodation on the {string} page")
	public void iWantToSearchForAnAccommodationOnThePage(String url, DataTable dataTable) {
		theActorCalled("User").wasAbleTo(completeTheInfo(dataTable, url));
	}

	@Then("To find an accommodation according to my need")
	public void toFindAnAccommodationAccordingToMyNeed() {
		theActorInTheSpotlight().wasAbleTo(cheapAccommodation());
	}


}
