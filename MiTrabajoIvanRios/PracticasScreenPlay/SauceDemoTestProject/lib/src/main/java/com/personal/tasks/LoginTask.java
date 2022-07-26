package com.personal.tasks;

import static com.personal.userinterfaces.LoginPage.BTN_LOGIN;
import static com.personal.userinterfaces.LoginPage.TXT_PASSWORD;
import static com.personal.userinterfaces.LoginPage.TXT_USERNAME;

import java.util.Map;

import com.personal.userinterfaces.LoginPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTask implements Task {
	private Map<String,String> userData;
	
	public LoginTask(DataTable data) {
		this.userData = data.asMap(String.class, String.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.keyValues(userData.get("username")).into(TXT_USERNAME),
				Enter.keyValues(userData.get("password")).into(TXT_PASSWORD),
				Click.on(BTN_LOGIN)
				);
	}
	
	public static LoginTask login(DataTable data) {
		return Tasks.instrumented(LoginTask.class, data);
	}

}
