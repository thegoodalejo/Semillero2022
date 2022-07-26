package com.personal.stepdefinitions;

import static com.personal.questions.ConfirmPurchaseMessage.value;
import static com.personal.userinterfaces.CartPage.BTN_CHECKOUT;
import static com.personal.userinterfaces.CheckoutOverviewPage.BTN_FINISH;
import static com.personal.userinterfaces.InventoryPage.BTN_CART;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import com.personal.tasks.AddItemToShoppingCartTask;
import com.personal.tasks.VerifyPurchase;
import com.personal.userinterfaces.CheckoutInformationPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ConfirmPurchaseStepDefinition {

	
	@Before
	public void setup() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	
	@Given("{string} haya agregado productos al carrito")
	public void hayaAgregadoProductosAlCarrito(String actorName, DataTable data) {
		theActorCalled(actorName).wasAbleTo(AddItemToShoppingCartTask.addItemToCart(data));
		theActorInTheSpotlight().wasAbleTo(Click.on(BTN_CART));
	}

	@Given("haga clic en checkout")
	public void hagaClicEnCheckout() {
		theActorInTheSpotlight().wasAbleTo(Click.on(BTN_CHECKOUT));
	}

	@When("diligencie los datos")
	public void diligencieLosDatos(DataTable data) {
		theActorInTheSpotlight().wasAbleTo(VerifyPurchase.withUserInformation(data));	
		theActorInTheSpotlight().attemptsTo(Click.on(CheckoutInformationPage.BTN_CONTINUE));
	}

	@And("haga clic en Finish")
	public void hagaClicEnFinish() {
	   theActorInTheSpotlight().wasAbleTo(Click.on(BTN_FINISH)); 
	}
	@Then("puedo ver el mensaje {string}")
	public void puedoVerElMensaje(String message) {
	   theActorInTheSpotlight().should(GivenWhenThen.seeThat("The displayed message", value(),equalTo(message)));
	}
}
