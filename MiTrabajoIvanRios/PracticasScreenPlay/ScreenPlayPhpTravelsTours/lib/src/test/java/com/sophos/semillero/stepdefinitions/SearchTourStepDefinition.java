package com.sophos.semillero.stepdefinitions;

import static com.sophos.semillero.userinterfaces.ToursSectionPage.TAB_TOURS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import com.sophos.semillero.tasks.FillDataToursTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SearchTourStepDefinition {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
		
	}
	
	@Given("{string} clicks on tour tab")
	public void clicksOnTourTab(String actor) {
		theActorCalled(actor).wasAbleTo(
				Open.url("https://www.phptravels.net/"),
				Click.on(TAB_TOURS)
				);
		//Serenity.getDriver().manage().window().maximize();
	}

	@When("fills the information")
	public void fillTheInformation(io.cucumber.datatable.DataTable data) {
		OnStage.theActorInTheSpotlight().wasAbleTo(FillDataToursTask.withTourData(data));
	    
	}

	@Then("should see the available list tours")
	public void shouldSeeTheAvailableListTours() {
	
		
	}

}
