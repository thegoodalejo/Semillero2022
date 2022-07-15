package com.sophos.semillero.stepdefinitions;



import com.sophos.semillero.task.SauceDemoLogin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LogInSauceDemoStepDefinitions {

	@Given("{string} was in the login page")
	public void wasInTheLoginPage(String actorName, DataTable dataTable) {	
		OnStage.theActorCalled(actorName).wasAbleTo(SauceDemoLogin.login(dataTable));
	}

	@When("{string} was login in")
	public void wasLoginIn(String string) {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Then("{string} saw the message login success")
	public void sawTheMessageLoginSuccess(String string) {

	}

}
