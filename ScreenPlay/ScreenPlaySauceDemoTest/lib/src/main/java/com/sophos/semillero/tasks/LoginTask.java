package com.sophos.semillero.tasks;

import java.util.Map;

import com.sophos.semillero.userinterfaces.LoginPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class LoginTask implements Task {
	
	private Map<String, String> data;
	
	public LoginTask(DataTable data) {
		this.data = data.asMap(String.class, String.class);
	}


	@Override
	public <T extends Actor> void performAs(T actor) {

		/* Recibimos la lista de acciones que va hacer el actor */
		actor.attemptsTo(
				Enter.keyValues(data.get("user")).into(LoginPage.TXT_USERNAME),
				Enter.keyValues(data.get("pass")).into(LoginPage.TXT_PASSWORD),
				Click.on(LoginPage.BTN_LOGIN)
				);

	}

	public static LoginTask login(DataTable data) {
		return Tasks.instrumented(LoginTask.class, data);
	}

}
