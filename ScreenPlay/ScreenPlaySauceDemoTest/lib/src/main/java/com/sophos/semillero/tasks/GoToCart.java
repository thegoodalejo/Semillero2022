package com.sophos.semillero.tasks;

import com.sophos.semillero.userinterfaces.InventoryPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToCart implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				
				Click.on(InventoryPage.BTN_CART)
				
		);
		
	}
	
	public static GoToCart navigate() {
		return Tasks.instrumented(GoToCart.class);
	}

}
