package com.sophos.semillero.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

import java.util.List;

import java.util.logging.Logger;

import com.sophos.semillero.questions.ItemsInCart;
import com.sophos.semillero.questions.TitleInventory;
import com.sophos.semillero.tasks.AddItemsToCart;
import com.sophos.semillero.tasks.GoToCart;
import com.sophos.semillero.tasks.DoLogin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddItemToCartStepDefinition {
	
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
	   );
		
	}

	@When("agrego productos al carrito")
	public void agregoProductosAlCarrito(DataTable data) {
		
		/*Agregamos 2 productos al carrito*/
		theActorInTheSpotlight().wasAbleTo(AddItemsToCart.items(data));

	}

	@Then("vio los productos agregados en el carrito")
	public void vioLosProductosAgregadosEnElCarrito() {

		/*Ingresamos al carrito*/
		theActorInTheSpotlight().wasAbleTo(GoToCart.navigate());
		
		theActorInTheSpotlight().should(
				
				seeThat("The amount Items ", ItemsInCart.value(), equalTo(2))
		);
	}
}