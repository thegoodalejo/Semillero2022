package com.sophos.semillero.tasks;

import static com.sophos.semillero.userinterfaces.NewToursLoginPage.TXT_PASSWORD;
import static com.sophos.semillero.userinterfaces.NewToursLoginPage.TXT_USER_NAME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.Map;

import com.sophos.semillero.userinterfaces.NewToursLoginPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.WebElementState;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;


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
				WaitUntil.the(TXT_PASSWORD,isVisible()).forNoMoreThan(10).seconds(),
				Enter.theValue(sessionTable.get("userName")).into(TXT_USER_NAME),
				Enter.theValue(sessionTable.get("password")).into(TXT_PASSWORD),
				Click.on(NewToursLoginPage.BTN_SUBMIT)
				);		
	}
	public static NewToursLogin login(DataTable datatable) {
		return Tasks.instrumented(NewToursLogin.class,datatable);
	}
	
}
