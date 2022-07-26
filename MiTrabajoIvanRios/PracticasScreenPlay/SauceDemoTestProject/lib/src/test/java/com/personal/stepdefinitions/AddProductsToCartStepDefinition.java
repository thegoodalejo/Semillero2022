package com.personal.stepdefinitions;

import static com.personal.tasks.AddItemToShoppingCartTask.addItemToCart;
import static com.personal.tasks.LoginTask.login;
import static com.personal.userinterfaces.InventoryPage.BTN_CART;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

import org.hamcrest.core.IsEqual;

import com.personal.questions.ItemsInCart;
import com.personal.questions.TitleInventory;
import com.personal.tasks.AddItemToShoppingCartTask;
import com.personal.tasks.LoginTask;
import com.personal.userinterfaces.InventoryPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddProductsToCartStepDefinition {
	
	private String actorName;
		
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("{string} este logueado")
	public void esteLogueado(String actorName, DataTable dataTable) {
			 this.actorName = actorName;
			 theActorCalled(actorName).wasAbleTo(Open.url("https://www.saucedemo.com/"));
			 theActorInTheSpotlight().wasAbleTo(LoginTask.login(dataTable));
			 theActorInTheSpotlight().should(seeThat("The displayed title", TitleInventory.value(),equalTo("PRODUCTS")));
	}

	@When("agregue los productos")
	public void agregueLosProductos(DataTable data) {
		theActorInTheSpotlight().wasAbleTo(addItemToCart(data));	    
	}

	@Then("ve los productos agregados en el carrito")
	public void veLosProductosAgregadosEnElCarrito() {
	    theActorInTheSpotlight().wasAbleTo(Click.on(BTN_CART));
	    theActorInTheSpotlight().should(seeThat("The Amount Items", ItemsInCart.value(),equalTo(2)));
	}


}
