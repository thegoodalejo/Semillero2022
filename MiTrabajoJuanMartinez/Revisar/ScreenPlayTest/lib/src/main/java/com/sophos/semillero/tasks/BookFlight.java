package com.sophos.semillero.tasks;

import static com.sophos.semillero.userinterfaces.BookFlightPage.*;

import java.util.Map;

import com.sophos.semillero.interactions.InteractionFlightPrices;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BookFlight implements Task {
	private Map <String, String> bookTable;
	
	public BookFlight(DataTable dataTable) {
		this.bookTable=dataTable.asMap(String.class, String.class);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				//WaitUntil.the(BTN_FLIGHTS,isVisible()).forNoMoreThan(10).seconds(),
				Click.on(BTN_FLIGHTS),
				Enter.theValue(bookTable.get("from")).into(TXT_FROM),
				Click.on(BTN_FIRSTOPTION),
				Enter.theValue(bookTable.get("to")).into(TXT_TO),
				Click.on(BTN_FIRSTOPTION),
				Enter.theValue(bookTable.get("departureDate")).into(TXT_DEPARTURE_DATE),
				Click.on(BTN_PASSENGERS),
				Enter.theValue(bookTable.get("adults")).into(TXT_ADULTS),
				Enter.theValue(bookTable.get("childs")).into(TXT_CHILDS),
				Enter.theValue(bookTable.get("infants")).into(TXT_INFANTS),
				Click.on(BTN_FLIGHTS),
				Click.on(BTN_SEARCHFLIGHTS),
				InteractionFlightPrices.prices()
				);
		
	}
	
	public static BookFlight book(DataTable dataTable) {
		return Tasks.instrumented(BookFlight.class,dataTable);
	}

}
