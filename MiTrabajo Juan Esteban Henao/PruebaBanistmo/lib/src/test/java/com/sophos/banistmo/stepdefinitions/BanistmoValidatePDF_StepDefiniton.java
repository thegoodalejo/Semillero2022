package com.sophos.banistmo.stepdefinitions;

import com.sophos.banistmo.interactions.OpenUrl;
import com.sophos.banistmo.task.BanistmoLocatePDF;
import com.sophos.banistmo.task.BanistmoValidatePDF;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BanistmoValidatePDF_StepDefiniton {
	
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("I was in the {string}")
	public void iWasInThe(String url) {
	   OnStage.theActorCalled("User").attemptsTo(OpenUrl.openUrl(url));
	}

	@When("I went the PDF path")
	public void iWentThePDFPath() {
		OnStage.theActorInTheSpotlight().attemptsTo(BanistmoLocatePDF.locatePDF());
	}

	@Then("I validate that the generated pdf is correct")
	public void iValidateThatTheGeneratedPdfIsCorrect() {
		OnStage.theActorInTheSpotlight().attemptsTo(BanistmoValidatePDF.validatePDF());
	}
}
