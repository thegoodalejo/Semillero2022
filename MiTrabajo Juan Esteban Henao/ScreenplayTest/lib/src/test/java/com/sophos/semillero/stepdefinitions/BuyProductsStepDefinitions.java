package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.task.SauceDemoBuy;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class BuyProductsStepDefinitions {

	@Given("the {string} has added products to the cart")
	public void theHasAddedProductsToTheCart(String string) {

	}

	@When("finalizes the purchase of the products")
	public void finalizesThePurchaseOfTheProducts(DataTable dataTable) {
		OnStage.theActorCalled("User").wasAbleTo(SauceDemoBuy.buy(dataTable));

	}

	@Then("view the purchase confirmation")
	public void viewThePurchaseConfirmation() {

	}

	@And("view the purchase invoice")
	public void viewThePurchaseInvoice() {

	}
}
