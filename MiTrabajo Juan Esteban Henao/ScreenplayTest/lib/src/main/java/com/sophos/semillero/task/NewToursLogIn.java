package com.sophos.semillero.task;

import java.util.Map;

import com.sophos.semillero.userinterfaces.NewToursLogInPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class NewToursLogIn implements Task {
	private Map <String, String> dataTable;
	
	public NewToursLogIn(DataTable dataTable) {
		this.dataTable = dataTable.asMap(String.class, String.class);
		
	}
	public NewToursLogIn(int numero) {
		System.out.println("Hola recibo un numero");
		
	}
	public NewToursLogIn(String palabra) {
		System.out.println("Hola recibo una palabra");
		
	}
	public NewToursLogIn(int numero, String palabra) {
		System.out.println("Hola recibo un numero y una palabra");
		
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.url(dataTable.get("url")),
				Enter.theValue(dataTable.get("userName")).into(NewToursLogInPage.TXT_USER_NAME),
				Enter.theValue(dataTable.get("password")).into(NewToursLogInPage.TXT_PASSWORD),
				Click.on(NewToursLogInPage.BUTTON_SUBMIT));
		
	}
	
	public static NewToursLogIn login(DataTable dataTable) {
		return Tasks.instrumented(NewToursLogIn.class, dataTable);
	}


}
