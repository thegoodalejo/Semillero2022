package com.sophos.semillero.tasks;

import java.util.Map;

import com.sophos.semillero.userinterfaces.NewToursLoginPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class NewToursLogin implements Task {
	private Map<String, String> tablaMario;
	
	public NewToursLogin(DataTable dataTable) {
		this.tablaMario = dataTable.asMap(String.class, String.class);
		System.out.println("Hola soy el constructor vacio");
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.url(tablaMario.get("url")),
				Enter.theValue(tablaMario.get("username")).into(NewToursLoginPage.TXT_USER_NAME),
				Enter.theValue(tablaMario.get("password")).into(NewToursLoginPage.TXT_PASSWORD),
				Click.on(NewToursLoginPage.BTN_LOGIN));
	}
	
	public static NewToursLogin login(DataTable dataTable) {
		return Tasks.instrumented(NewToursLogin.class,dataTable);
	}
	


}
