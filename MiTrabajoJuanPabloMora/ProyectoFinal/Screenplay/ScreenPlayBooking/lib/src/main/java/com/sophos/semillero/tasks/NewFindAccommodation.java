package com.sophos.semillero.tasks;

import java.util.Map;

import com.sophos.semillero.userinterfaces.FindAccommodationPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class NewFindAccommodation implements Task {
	
	private Map<String, String> reservationTable;
	
	public NewFindAccommodation(DataTable dataTable){
		   this.reservationTable = dataTable.asMap(String.class, String.class);
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(reservationTable.get("place")).into(FindAccommodationPage.INPUT_NAME_PLACE),
				         Click.on(FindAccommodationPage.CLICK_NAME_PLACE),
				         Click.on(FindAccommodationPage.CLICK_ROOM),
				        // Click.on(FindAccommodationPage.CLICK_DATE_ENTRY),
				        // Click.on(FindAccommodationPage.CLICK_DATE_EXIT),
				         Click.on(FindAccommodationPage.CLICK_SEARCH)

				);
		
		
	}
	
	public static NewFindAccommodation accomodation(DataTable dataTable) {
		
	return Tasks.instrumented(NewFindAccommodation.class, dataTable);
	}

}
