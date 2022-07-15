package com.sophos.semillero.task;

import java.util.Map;

import com.sophos.semillero.userinterfaces.SauceDemoLogInpage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class SauceDemoLogin implements Task  {
	private Map <String, String> dataTable;
	
	public SauceDemoLogin(DataTable dataTable) {
		this.dataTable = dataTable.asMap(String.class, String.class);

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.url(dataTable.get("url")),
				Enter.theValue(dataTable.get("userName")).into(SauceDemoLogInpage.TXT_USER_NAME),
				Enter.theValue(dataTable.get("password")).into(SauceDemoLogInpage.TXT_PASSWORD),
				Click.on(SauceDemoLogInpage.BUTTON_SUBMIT));
	}
	
	public static SauceDemoLogin login (DataTable dataTable) {
		return Tasks.instrumented(SauceDemoLogin.class, dataTable);

	}

}
