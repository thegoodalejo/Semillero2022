package com.sophos.semillero.stepdefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class BuyProductsStepDefinitions {
	@Before
	public void setUp() {
		OnStage.setTheStage(new OnlineCast());
	}
}
