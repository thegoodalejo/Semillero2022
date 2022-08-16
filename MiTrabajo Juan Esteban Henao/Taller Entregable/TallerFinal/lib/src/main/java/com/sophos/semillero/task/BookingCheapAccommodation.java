package com.sophos.semillero.task;

import static com.sophos.semillero.interactions.OpenUrl.openUrl;
import static com.sophos.semillero.questions.BookingCheapPrice.cheapPrice;

import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sophos.semillero.interactions.BookingAddPeopleAndHabitations;
import com.sophos.semillero.interactions.BookingSelectCity;
import com.sophos.semillero.interactions.BookingSelectDate;
import com.sophos.semillero.questions.BookingCheapPrice;
import com.sophos.semillero.userinterfaces.BookingPage;
import net.serenitybdd.core.pages.WebElementFacade;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BookingCheapAccommodation implements Task {

	public BookingCheapAccommodation() {

	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(

				Click.on(BookingPage.BTN_FILTRO_9POINTS) 
			//	Click.on(BookingPage.BTN_FILTRO_PLAYA)

		);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor.asksFor(cheapPrice());

	}

	public static BookingCheapAccommodation cheapAccommodation() {
		return Tasks.instrumented(BookingCheapAccommodation.class);
	}

}
