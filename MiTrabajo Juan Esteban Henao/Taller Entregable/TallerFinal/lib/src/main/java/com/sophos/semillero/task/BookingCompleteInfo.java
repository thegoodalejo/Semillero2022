package com.sophos.semillero.task;


import static com.sophos.semillero.interactions.BookingAddPeopleAndHabitations.addPeopleAndHabitations;
import static com.sophos.semillero.interactions.BookingSelectCity.selectCity;
import static com.sophos.semillero.interactions.BookingSelectDate.selectDate;
import static com.sophos.semillero.interactions.OpenUrl.openUrl;

import java.util.Map;

import com.sophos.semillero.interactions.BookingAddPeopleAndHabitations;
import com.sophos.semillero.interactions.BookingSelectCity;
import com.sophos.semillero.interactions.BookingSelectDate;
import com.sophos.semillero.userinterfaces.BookingPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class BookingCompleteInfo implements Task {
	private Map <String, String> dataTable;
	private String strUrl;
	
	public BookingCompleteInfo(DataTable dataTable, String url) {
		this.dataTable = dataTable.asMap(String.class, String.class);
		this.strUrl=url;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				openUrl(strUrl),
				selectCity(dataTable),
				selectDate(dataTable),
				addPeopleAndHabitations(dataTable),
				Click.on(BookingPage.BTN_SEARCH)

		);
	}
	
	public static BookingCompleteInfo completeTheInfo(DataTable dataTable, String url) {
		return Tasks.instrumented(BookingCompleteInfo.class, dataTable, url);
	}

}
