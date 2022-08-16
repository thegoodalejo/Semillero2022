package com.sophos.semillero.stepdefinitions;

import static com.sophos.semillero.interactions.OpenUrl.openUrl;
import static com.sophos.semillero.task.OmioCompleteInfo.completeTheInfo;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class OmioSearchFlightStepDefinition {
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	
	@Given("I was in the {string} page")
	public void iWasInThe(String url) {
		theActorCalled("User").attemptsTo(openUrl(url));
	}

	@When("I want to search for a flight")
	public void iWantToSearchForAFlightOnPage(DataTable dataTable) {
		theActorInTheSpotlight().wasAbleTo(completeTheInfo(dataTable));
	}

	@Then("To find one according to my needs")
	public void toFindOneAccordingToMyNeeds(DataTable dataTable) {
		theActorInTheSpotlight().wasAbleTo();

	}

}
