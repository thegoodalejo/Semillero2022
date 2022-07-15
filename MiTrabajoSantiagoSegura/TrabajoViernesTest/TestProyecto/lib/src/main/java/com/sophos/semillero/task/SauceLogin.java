package com.sophos.semillero.task;

import java.util.Map;

import com.sophos.semillero.userinterfaces.SauceLoginPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class SauceLogin implements Task {

	 private Map<String,String> tablaSantiago;
	public  SauceLogin(DataTable dateTable) {
          this.tablaSantiago=dateTable.asMap(String.class, String.class);
		System.out.println("constructor vacio");
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
	   //todo lo que el actor va hacer se anexa aca 
	    actor.attemptsTo(Open.url(tablaSantiago.get("url")),
	    		Enter.theValue(tablaSantiago.get("userName")).into(SauceLoginPage.TXT_USER_NAME),
	    		Enter.theValue(tablaSantiago.get("password")).into(SauceLoginPage.TXT_PASSWORD),
	    		 Click.on(SauceLoginPage.BTN_LOGIN));
	    		


	}

	public static SauceLogin login(DataTable tabla) {

		return Tasks.instrumented(SauceLogin.class,tabla);    // el instrumented realiza el match en tiempo de ejecución 
	}
	
}
