package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

import com.sophos.semillero.exceptions.InvalidCredentials;
import com.sophos.semillero.exceptions.NoProductsInCart;
import com.sophos.semillero.questions.ItemsInCart;
import com.sophos.semillero.questions.TitleInventory;
import com.sophos.semillero.tasks.AddItemsToCart;
import com.sophos.semillero.tasks.GoToCart;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class AddItemToCartStepDefinition {
	
	private Integer amountItems;
	
	@Before
	public void setup() {
		/*Funciono sin poner esta parte*/
		OnStage.setTheStage(new OnlineCast());
	}

	@Given("{string} se ha autenticado")
	public void seHaAutenticado(String actorName) {
	   
	   /*Verificamos que si se autentico*/
	   theActorInTheSpotlight().should(
			   
			   seeThat("The displayed title ", TitleInventory.value(), equalTo("PRODUCTS"))
			   .orComplainWith(InvalidCredentials.class, "Invalid credentials")
	   );
		
	}

	@When("agrego productos al carrito")
	public void agregoProductosAlCarrito(DataTable items) {
		
		this.amountItems = items.asList(String.class).size();
		
		theActorInTheSpotlight().wasAbleTo(AddItemsToCart.items(items));

	}
		

	@Then("vio los productos agregados en el carrito")
	public void vioLosProductosAgregadosEnElCarrito() {

		/*Ingresamos al carrito*/
		theActorInTheSpotlight().wasAbleTo(GoToCart.navigate());
		
		/*Verificamos que la cantidad de elementos agregados es la misma que esta en el carrito*/
		theActorInTheSpotlight().should(
				
				seeThat("The amount Items ", ItemsInCart.value(), equalTo(amountItems))
				.orComplainWith(NoProductsInCart.class, "No products added to cart")
		);
	
	}
}
