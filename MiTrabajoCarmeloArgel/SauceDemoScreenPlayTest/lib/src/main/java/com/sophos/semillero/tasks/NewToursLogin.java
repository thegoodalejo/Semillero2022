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

	private Map <String, String> tablaCarmelo;
	
	public NewToursLogin(DataTable dataTable) {
		this.tablaCarmelo = dataTable.asMap(String.class, String.class);
		
	//System.out.println("Hola soy el constructor vacio");
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// Anexamos todo lo que el actor hará 
		actor.attemptsTo(Open.url(tablaCarmelo.get("url")),
				Enter.theValue(tablaCarmelo.get("userName")).into(NewToursLoginPage.TXT_USER_NAME),
				Enter.theValue(tablaCarmelo.get("password")).into(NewToursLoginPage.TXT_PASSWORD),
				Click.on(NewToursLoginPage.BTN_SUBMIT));
	}
	
	public static NewToursLogin login(DataTable dataTable) {
		return Tasks.instrumented(NewToursLogin.class, dataTable); 
	}
	
}
