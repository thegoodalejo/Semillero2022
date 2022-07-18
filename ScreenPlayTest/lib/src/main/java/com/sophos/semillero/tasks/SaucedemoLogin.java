package com.sophos.semillero.tasks;

import static com.sophos.semillero.userinterfaces.SaucedemoLoginPage.BTN_SUBMIT;
import static com.sophos.semillero.userinterfaces.SaucedemoLoginPage.TXT_PASSWORD;
import static com.sophos.semillero.userinterfaces.SaucedemoLoginPage.TXT_USER_NAME;

import java.util.Map;

import com.sophos.semillero.interactions.InteractionTest;
import com.sophos.semillero.userinterfaces.SaucedemoLoginPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;


public class SaucedemoLogin implements Task {
	
	private Map <String, String> saucedemoSessionTable;
	
	public SaucedemoLogin(DataTable datatable) {
		this.saucedemoSessionTable = datatable.asMap(String.class, String.class);
	}
	
	 
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Open.url(saucedemoSessionTable.get("url")),
				Enter.theValue(saucedemoSessionTable.get("userName")).into(TXT_USER_NAME),
				Enter.theValue(saucedemoSessionTable.get("password")).into(TXT_PASSWORD.of("password")),
				Click.on(BTN_SUBMIT)
				);		
	}
	public static SaucedemoLogin inSaucedemo(DataTable datatable) {
		return Tasks.instrumented(SaucedemoLogin.class,datatable);
	}
	
}
