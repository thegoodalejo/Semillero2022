package com.sophos.semillero.task;

import com.sophos.semillero.userinterfaces.SauceDemoAddProductsPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SauceDemoAddProducts implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(SauceDemoAddProductsPage.BTN_PRODUCT1),
				Click.on(SauceDemoAddProductsPage.BTN_PRODUCT2),
				Click.on(SauceDemoAddProductsPage.BTN_CAR));
	}
	
	
	public static SauceDemoAddProducts addProducts() {
		return Tasks.instrumented(SauceDemoAddProducts.class);

	}

}
