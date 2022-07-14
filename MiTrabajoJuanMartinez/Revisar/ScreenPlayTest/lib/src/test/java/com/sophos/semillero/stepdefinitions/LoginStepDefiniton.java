package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
public class LoginStepDefiniton {

	@Before
    public void setup() {

        OnStage.setTheStage(new OnlineCast());

    }

    @Given("el usuario ingreso a la pagina principal")
    public void elUsuarioIngresoALaPaginaPrincipal() {

        OnStage.theActorCalled("Jeffer");
    }

    @When("diligencio el formulario de login")
    public void diligencioElFormularioDeLogin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("le mostro un mensaje de login exitoso")
    public void leMostroUnMensajeDeLoginExitoso() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
