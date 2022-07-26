package com.sophos.semillero.tasks;

import com.sophos.semillero.userinterfaces.BookFlightPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUrlBookFlight implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.url("https://www.phptravels.net/"));

	}

	public static OpenUrlBookFlight book() {
		return Tasks.instrumented(OpenUrlBookFlight.class);
	}

}
