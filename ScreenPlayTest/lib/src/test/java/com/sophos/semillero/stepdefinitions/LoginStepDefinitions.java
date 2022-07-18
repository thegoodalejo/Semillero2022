package com.sophos.semillero.stepdefinitions;

import static com.sophos.semillero.userinterfaces.SaucedemoLoginPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.IsInHomePage;
import com.sophos.semillero.questions.TextOf;
import com.sophos.semillero.tasks.NewToursLogin;
import com.sophos.semillero.userinterfaces.SaucedemoLoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStepDefinitions {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	@Given("{string} se encuentra en la pagina principal")
	public void elUsuarioSeEncuentraEnLaPaginaPrincipal(String actorName, DataTable datatable) {
	    // Write code here that turns the phrase above into concrete actions
		theActorCalled(actorName).wasAbleTo(NewToursLogin.login(datatable));	
		}

	@When("Ingresa Usuario y Contrasenia")
	public void ingresaUsuarioYContrasenia() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("Visualiza el mensaje {string}")
	public void visualizaElMensaje(String string) {
		theActorInTheSpotlight().should(seeThat(TextOf.field(TXT_USER_NAME),IsEqual.equalTo(string)));
		theActorInTheSpotlight().should(seeThat(IsInHomePage.loggedIn(), IsEqual.equalTo(Boolean.TRUE)));
	}


}
