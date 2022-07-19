package com.sophos.semillero.tasks;

import static com.sophos.semillero.userinterfaces.NewToursLoginPage.TXT_PASSWORD;
import static com.sophos.semillero.userinterfaces.NewToursLoginPage.TXT_USER_NAME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.Map;

import com.sophos.semillero.userinterfaces.NewToursLoginPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class NewToursLogin implements Task {
	
	private Map <String, String> tablaJuan;
	
	public NewToursLogin(DataTable dataTable) {
		this.tablaJuan = dataTable.asMap(String.class, String.class);
		System.out.println("Hola soy el constructor vacio");
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.url(tablaJuan.get("url")),
				WaitUntil.the(TXT_PASSWORD,isVisible()).forNoMoreThan(10).seconds(),
				Enter.theValue(tablaJuan.get("username")).into(TXT_USER_NAME),
				Enter.theValue(tablaJuan.get("password")).into(TXT_PASSWORD),
				Click.on(NewToursLoginPage.BTN_SUBMIT)
				);
		// TODO Auto-generated method stub
		
	}
	public static NewToursLogin login(DataTable dataTable) {
		return Tasks.instrumented(NewToursLogin.class,dataTable);
	} 
	
}
