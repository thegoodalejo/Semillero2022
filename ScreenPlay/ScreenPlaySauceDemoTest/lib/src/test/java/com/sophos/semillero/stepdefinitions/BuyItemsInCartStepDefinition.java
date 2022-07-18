package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.questions.ItemsInCart;
import com.sophos.semillero.tasks.GoToCart;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class BuyItemsInCartStepDefinition {
	
	private String actorName;
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} tiene productos agregados al carrito")
	public void tieneProductosAgregadosAlCarrito(String actorName) {
		
		this.actorName = actorName;
	    theActorCalled(actorName).wasAbleTo(GoToCart.gotToCart());
	    
	    theActorInTheSpotlight().should(
	    		seeThat(ItemsInCart.value(), IsEqual.equalTo(2))
	    		);
	}

	@When("hizo un checkout de los productos")
	public void hizoUnCheckoutDeLosProductos() {
	    
	}

	@Then("vio un mensaje de compra exitosa")
	public void vioUnMensajeDeCompraExitosa() {
	    
	}

}
