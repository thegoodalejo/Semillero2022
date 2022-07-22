package com.sophos.semillero.tasks;

import static com.sophos.semillero.userinterfaces.PhpTravelsSearchToursPage.BTN_DAY_DATE;
import static com.sophos.semillero.userinterfaces.PhpTravelsSearchToursPage.BTN_TOURS;
import static com.sophos.semillero.userinterfaces.PhpTravelsSearchToursPage.INPUT_QTY_ADULT;
import static com.sophos.semillero.userinterfaces.PhpTravelsSearchToursPage.INPUT_QTY_CHILD;
import static com.sophos.semillero.userinterfaces.PhpTravelsSearchToursPage.TXT_CITY;
import static com.sophos.semillero.userinterfaces.PhpTravelsSearchToursPage.TXT_SEARCH_CITY;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.Map;

import com.sophos.semillero.userinterfaces.PhpTravelsSearchToursPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class NewSearchToursPhpTravels implements Task {
	
	private Map <String, String> tablaSearchTours;
	
	public NewSearchToursPhpTravels(DataTable dataTable) {
		this.tablaSearchTours = dataTable.asMap(String.class, String.class);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Open.url(tablaSearchTours.get("url")),
				Click.on(BTN_TOURS),
				Click.on(TXT_SEARCH_CITY),
				Enter.theValue(tablaSearchTours.get("city")).into(TXT_CITY),
				Click.on(PhpTravelsSearchToursPage.TXT_DATE),
				Click.on(BTN_DAY_DATE),
				Click.on(PhpTravelsSearchToursPage.BTN_TRAVELLERS),
				Enter.theValue(tablaSearchTours.get("cantAdult")).into(INPUT_QTY_ADULT),
				Enter.theValue(tablaSearchTours.get("cantChild")).into(INPUT_QTY_CHILD),
				Click.on(TXT_SEARCH_CITY)
				);
		
	}
	public static NewSearchToursPhpTravels searchTours(DataTable dataTable) {
		return Tasks.instrumented(NewSearchToursPhpTravels.class, dataTable);
	} 

}
