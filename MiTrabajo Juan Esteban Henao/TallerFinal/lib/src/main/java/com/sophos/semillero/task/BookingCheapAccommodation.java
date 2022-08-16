package com.sophos.semillero.task;

import static com.sophos.semillero.userinterfaces.BookingPage.BTN_FILTRO_9POINTS;
import static com.sophos.semillero.userinterfaces.BookingPage.FILTER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class BookingCheapAccommodation implements Task {

	public BookingCheapAccommodation() {

	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				WaitUntil.the(FILTER, isVisible()).forNoMoreThan(4).seconds(),
				Click.on(BTN_FILTRO_9POINTS));
				
	}

	public static BookingCheapAccommodation cheapAccommodation() {
		return Tasks.instrumented(BookingCheapAccommodation.class);
	}

}
