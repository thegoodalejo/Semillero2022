package com.sophos.semillero.stepdefinitions;



import static com.sophos.semillero.userinterfaces.SauceDemoLogInpage.TXT_USER_NAME;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.IsHomePage;
import com.sophos.semillero.questions.TextOf;
import com.sophos.semillero.task.SauceDemoLogin;
import com.sophos.semillero.userinterfaces.SauceDemoLogInpage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LogInSauceDemoStepDefinitions {

	@Given("{string} was in the login page")
	public void wasInTheLoginPage(String actorName, DataTable dataTable) {	
		theActorCalled(actorName).wasAbleTo(SauceDemoLogin.inSauceDemo(dataTable));
	}

	@When("{string} was login in")
	public void wasLoginIn(String string) {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("{string} saw the message login success")
	public void sawTheMessageLoginSuccess(String string) {
	/*	theActorInTheSpotlight().should(seeThat(TextOf.field(TXT_USER_NAME), IsEqual.equalTo(string)));
		theActorInTheSpotlight().should(seeThat(IsHomePage.logged(), IsEqual.equalTo(Boolean.TRUE)));*/
	}

}
