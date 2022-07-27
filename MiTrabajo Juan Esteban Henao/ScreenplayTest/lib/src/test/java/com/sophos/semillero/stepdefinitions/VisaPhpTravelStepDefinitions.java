package com.sophos.semillero.stepdefinitions;


import static com.sophos.semillero.task.PhpTravelsVisa.inPhpTravels;
import static com.sophos.semillero.task.PhpTravelsVisaCompleteInfo.completeInfo;
import static com.sophos.semillero.userinterfaces.PhpTravelsVisaPage.TAB_VISA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophos.semillero.interactions.CompleteInfoVisa;
import com.sophos.semillero.runners.VisaPhpTravelsTest;
import com.sophos.semillero.task.PhpTravelsVisa;
import com.sophos.semillero.task.PhpTravelsVisaCompleteInfo;
import com.sophos.semillero.task.PhpTravelsVisaValidateMessage;
import com.sophos.semillero.userinterfaces.PhpTravelsVisaPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

public class VisaPhpTravelStepDefinitions {

	@Given("{string} was in the main page")
	public void wasInTheMainPage(String actorName, DataTable dataTable) {
		theActorCalled(actorName).wasAbleTo(inPhpTravels(dataTable));
	}

	@And("stay in the visa tab")
	public void stayInTheVisaTab() {
		theActorInTheSpotlight().attemptsTo(Click.on(TAB_VISA));
	}

	@When("the complete the info")
	public void theCompleteTheInfo(DataTable dataTable) {
		theActorInTheSpotlight().attemptsTo(PhpTravelsVisaCompleteInfo.completeInfo(dataTable));
	}

	@Then("{string} saw the message {string}")
	public void sawTheMessage(String string, String message) {
		theActorInTheSpotlight().attemptsTo(PhpTravelsVisaValidateMessage.validateMessage(message));
	}

}
