package com.sophos.semillero.task;

import static com.sophos.semillero.interactions.OmioAddPassengerAndAge.addPassengerAndAges;
import static com.sophos.semillero.interactions.OmioEnterData.enterDate;
import static com.sophos.semillero.interactions.OmioSelectCityOriginAndDestination.enterCityOringinAndDestination;
import static com.sophos.semillero.userinterfaces.OmioPage.BTN_ACCEPT_COOKIE;
import static com.sophos.semillero.userinterfaces.OmioPage.BTN_CLOSE_BOOKING;
import static com.sophos.semillero.userinterfaces.OmioPage.BTN_SEARCH;
import static com.sophos.semillero.userinterfaces.OmioPage.BTN_SELECT_Test;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OmioCompleteInfo implements Task {
	private Map <String, String> dataTable;

	
	public OmioCompleteInfo(DataTable dataTable) {
		this.dataTable = dataTable.asMap(String.class, String.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(BTN_ACCEPT_COOKIE),
				enterCityOringinAndDestination(dataTable),
				addPassengerAndAges(dataTable),
				enterDate(dataTable),
				Click.on(BTN_CLOSE_BOOKING),
				Click.on(BTN_SEARCH), 
				Click.on(BTN_SELECT_Test)
				);
		
	}
	
	public static OmioCompleteInfo completeTheInfo(DataTable dataTable) {
		return Tasks.instrumented(OmioCompleteInfo.class, dataTable);
	}

}
