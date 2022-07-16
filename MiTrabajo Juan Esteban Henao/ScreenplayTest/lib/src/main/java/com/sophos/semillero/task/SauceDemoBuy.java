package com.sophos.semillero.task;

import java.util.Map;

import com.sophos.semillero.userinterfaces.SauceDemoBuyPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class SauceDemoBuy implements Task {
	private Map <String, String> dataTable;
	
	
	public SauceDemoBuy(DataTable dataTable) {
		this.dataTable = dataTable.asMap(String.class, String.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(SauceDemoBuyPage.BTN_CHECKOUT),
				Enter.theValue(dataTable.get("firsName")).into(SauceDemoBuyPage.FIRSNAME),
				Enter.theValue(dataTable.get("lastName")).into(SauceDemoBuyPage.LASTNAME),
				Enter.theValue(dataTable.get("postalCode")).into(SauceDemoBuyPage.POSTALCODE),
				Click.on(SauceDemoBuyPage.BTN_CONTINUE));
		
	}
	
	public static SauceDemoBuy buy (DataTable dataTable) {
		return Tasks.instrumented(SauceDemoBuy.class, dataTable);

	}

}
