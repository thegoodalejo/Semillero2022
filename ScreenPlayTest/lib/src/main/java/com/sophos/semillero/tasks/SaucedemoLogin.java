package com.sophos.semillero.tasks;

import java.util.Map;

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
				Enter.theValue(saucedemoSessionTable.get("userName")).into(SaucedemoLoginPage.TXT_USER_NAME),
				Enter.theValue(saucedemoSessionTable.get("password")).into(SaucedemoLoginPage.TXT_PASSWORD),
				Click.on(SaucedemoLoginPage.BTN_SUBMIT)
				);		
	}
	public static SaucedemoLogin login(DataTable datatable) {
		return Tasks.instrumented(SaucedemoLogin.class,datatable);
	}
	
}
