package com.sophos.semillero.tasks;

import static com.sophos.semillero.userinterfaces.NewToursLoginPage.TXT_PASSWORD;
import static com.sophos.semillero.userinterfaces.NewToursLoginPage.TXT_USER_NAME;

import java.util.Map;

import com.sophos.semillero.interactions.InteractionTestLogin;
import com.sophos.semillero.userinterfaces.NewToursLoginPage;

import groovy.transform.ToString;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class NewToursLogin implements Task {
	
	private Map <String, String> tablaUsuarios;
	
	
	public NewToursLogin(DataTable dataTable) {
		this.tablaUsuarios=dataTable.asMap(String.class, String.class);	
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(

				Open.url(tablaUsuarios.get("url")),
				Enter.theValue(tablaUsuarios.get("userName")).into(TXT_USER_NAME),
				Enter.theValue(tablaUsuarios.get("password")).into(TXT_PASSWORD), 
				Click.on(NewToursLoginPage.BTN_SUBMIT),
				InteractionTestLogin.number()

		);
	}

	public static NewToursLogin login(DataTable dataTable) {
		return Tasks.instrumented(NewToursLogin.class,dataTable);
	}

}
