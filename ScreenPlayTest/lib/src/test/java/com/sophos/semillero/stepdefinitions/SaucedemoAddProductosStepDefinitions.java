package com.sophos.semillero.stepdefinitions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SaucedemoAddProductosStepDefinitions {
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	
	@Given("{string} se encuentre logueado")
	public void seEncuentreLogueado(String actorName, DataTable dataTable) {
	    
	}

	@When("Agrega los productos al carrito")
	public void agregaLosProductosAlCarrito() {
	}

	@Then("Visualiza el incremento de los productos en el logo del carrito")
	public void visualizaElIncrementoDeLosProductosEnElLogoDelCarrito() {
	}


}
