package com.sophos.semillero.stepdefinitions;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.sophos.semillero.tasks.SaucedemoAddProducts;
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
	public void seEncuentreLogueado(String actorName) {
		
	}

	@When("Agrega los productos al carrito")
	public void agregaLosProductosAlCarrito(DataTable dataTable) {
		theActorInTheSpotlight().wasAbleTo(SaucedemoAddProducts.ofTheProductList(dataTable));	
	}

	@Then("Visualiza el incremento de los productos en el logo del carrito")
	public void visualizaElIncrementoDeLosProductosEnElLogoDelCarrito() {
	}


}
