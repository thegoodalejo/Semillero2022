package com.sophos.semillero.task;


import static com.sophos.semillero.interactions.BookingAddPeopleAndHabitations.addPeopleAndHabitations;
import static com.sophos.semillero.interactions.BookingSelectCity.selectCity;
import static com.sophos.semillero.interactions.BookingSelectDate.selectDate;

import static com.sophos.semillero.userinterfaces.BookingPage.BTN_SEARCH;

import java.util.Map;



import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class BookingCompleteInfo implements Task {
	private Map <String, String> dataTable;

	
	public BookingCompleteInfo(DataTable dataTable) {
		this.dataTable = dataTable.asMap(String.class, String.class);
	
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				selectCity(dataTable),
				selectDate(dataTable),
				addPeopleAndHabitations(dataTable),
				Click.on(BTN_SEARCH)

		);
	}
	
	public static BookingCompleteInfo completeTheInfo(DataTable dataTable) {
		return Tasks.instrumented(BookingCompleteInfo.class, dataTable);
	}

}
