package com.sophos.semillero.tasks;

import java.util.Map;

import com.sophos.semillero.userinterfaces.NewToursLoginPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;


public class NewToursLogin implements Task {
	
	private Map <String, String> sessionTable;
	
	public NewToursLogin(DataTable datatable) {
		this.sessionTable = datatable.asMap(String.class, String.class);
		
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Open.url(sessionTable.get("url")),
				Enter.theValue(sessionTable.get("userName")).into(NewToursLoginPage.TXT_USER_NAME),
				Enter.theValue(sessionTable.get("password")).into(NewToursLoginPage.TXT_PASSWORD),
				Click.on(NewToursLoginPage.BTN_SUBMIT)
				);		
	}
	public static NewToursLogin login(DataTable datatable) {
		return Tasks.instrumented(NewToursLogin.class,datatable);
	}
	
}
