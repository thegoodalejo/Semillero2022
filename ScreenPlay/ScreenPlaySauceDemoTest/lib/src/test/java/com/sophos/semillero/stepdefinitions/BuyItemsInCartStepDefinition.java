package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

import org.hamcrest.core.IsEqual;

import com.sophos.semillero.exceptions.FailedPurchase;
import com.sophos.semillero.exceptions.NoProductsInCart;
import com.sophos.semillero.questions.ItemsInCart;
import com.sophos.semillero.questions.ItemsInSummary;
import com.sophos.semillero.questions.MessageThank;
import com.sophos.semillero.tasks.AddItemsToCart;
import com.sophos.semillero.tasks.DoPurchaseVerification;
import com.sophos.semillero.tasks.GoToCart;
import com.sophos.semillero.userinterfaces.CartPage;
import com.sophos.semillero.userinterfaces.CheckoutCompletePage;
import com.sophos.semillero.userinterfaces.CheckoutSecondPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class BuyItemsInCartStepDefinition {
	
	private Integer amountItems;
	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} tiene productos agregados al carrito")
	public void tieneProductosAgregadosAlCarrito(String actorName, DataTable items) {
	    
		this.amountItems = items.asList(String.class).size();
		
	    theActorCalled(actorName).wasAbleTo(AddItemsToCart.items(items));
	    
	    theActorInTheSpotlight().wasAbleTo(GoToCart.navigate());
	    
	    theActorInTheSpotlight().should(
	    		seeThat(ItemsInCart.value(), equalTo(amountItems))
	    		.orComplainWith(FailedPurchase.class, "No products added to cart")
	    		);
	    
	}

	@When("hizo un checkout de los productos")
	public void hizoUnCheckoutDeLosProductos(DataTable data) {
		
		theActorInTheSpotlight().attemptsTo(
				
				Click.on(CartPage.BTN_CHECKOUT)
		);
		
		theActorInTheSpotlight().wasAbleTo(DoPurchaseVerification.withPersonalData(data));
		
	}
	
	@When("vio la factura generada")
	public void vioLaFacturaGenerada() {
		
		theActorInTheSpotlight().should(
				seeThat(ItemsInSummary.value(), equalTo(amountItems))
				.orComplainWith(NoProductsInCart.class, "No Products added to cart")
				);
		
		theActorInTheSpotlight().attemptsTo(
				Click.on(CheckoutSecondPage.BTN_FINISH)
				);
	}

	@Then("vio un mensaje de compra exitosa")
	public void vioUnMensajeDeCompraExitosa() {
	    
		theActorInTheSpotlight().should(
				seeThat(MessageThank.value(), equalTo("THANK YOU FOR YOUR ORDER"))
				.orComplainWith(FailedPurchase.class, "Failed to complete purchase")
				);
		
	}

}
