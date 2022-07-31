package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.tasks.NewFindAccommodation;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GoFindAcoommodationStepDefinitions {
	
	@Before
	public void setup(){
	     OnStage.setTheStage(new OnlineCast()); 
	}

	@Given("since I am on the page {string}")
	public void sinceIAmOnThePage(String string) {
		OnStage.theActorCalled("Juan").wasAbleTo(Open.url(string));
	}

	@When("I want to look for an accommodation on page")
	public void iWantToLookForAnAccommodationOnPage(DataTable dataTable) {
		OnStage.theActorInTheSpotlight().wasAbleTo(NewFindAccommodation.accomodation(dataTable));

	}

	@Then("find an accommodation according to my need")
	public void findAnAccommodationAccordingToMyNeed() {

	}
}
