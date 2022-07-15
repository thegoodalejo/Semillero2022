package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.task.SauceDemoAddProducts;
import com.sophos.semillero.task.SauceDemoLogin;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class AddProductsSauceDemoStepDefinitions {

	
	@Given("the {string} is authenticated")
	public void theIsAuthenticated(String actorName) {

	}

	@When("add products to cart")
	public void addProductsToCart() {
		OnStage.theActorCalled("user").wasAbleTo(SauceDemoAddProducts.addProducts());

	}

	@Then("saw the products in the cart")
	public void sawTheProductsInTheCart() {


	}
}
