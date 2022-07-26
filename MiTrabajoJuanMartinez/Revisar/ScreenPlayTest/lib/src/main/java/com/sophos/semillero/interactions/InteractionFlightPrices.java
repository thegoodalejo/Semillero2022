package com.sophos.semillero.interactions;

import static com.sophos.semillero.userinterfaces.BookFlightPage.TXT_FLIGHTPRICES;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class InteractionFlightPrices implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {

		List<WebElementFacade> prices = TXT_FLIGHTPRICES.resolveAllFor(actor);

		for (WebElementFacade price : prices) {
			System.out.println(price.getTextValue());
		}
	}

	public static InteractionFlightPrices prices() {
		return Tasks.instrumented(InteractionFlightPrices.class);
	}

}
