package com.sophos.semillero.stepdefinitions;

import static com.sophos.semillero.userinterfaces.NewToursLoginPage.TXT_PASSWORD;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.IsInHomePage;
import com.sophos.semillero.questions.TextOf;
import com.sophos.semillero.tasks.NewToursLogin;
import com.sophos.semillero.userinterfaces.NewToursLoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStepDefinitions {
	
	@Before
	public void setup(){
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} se encuentra en la pagina principal")
	public void elUsuarioSeEncuentraEnLaPaginaPrincipal(String actorName, DataTable datatable ) {
		OnStage.theActorCalled(actorName).wasAbleTo((NewToursLogin.login(datatable)));
		
	}
	
	@When("Ingresa usuario y contrasena")
	public void ingresaUsuarioYContrasena() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("visualiza el mensaje de {string}")
	public void visualizaElMensajeDe(String string) {
	    theActorInTheSpotlight().should(seeThat(TextOf.field(TXT_PASSWORD), IsEqual.equalTo(string)));
	    theActorInTheSpotlight().should(seeThat(IsInHomePage.loggedIn(), IsEqual.equalTo(Boolean.TRUE)));
	}

}
