package com.sophos.semillero.tasks;

import java.util.Map;

import com.sophos.semillero.userinterfaces.NewLoginSauceDemoPage;
import com.sophos.semillero.userinterfaces.NewToursLoginPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class NewLoginSauceDemo implements Task {
	
	private Map <String, String> tablaJuan;
	
	public NewLoginSauceDemo(DataTable dataTable) {
		this.tablaJuan = dataTable.asMap(String.class, String.class);
		System.out.println("Hola soy el constructor vacio");
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.url(tablaJuan.get("url")),
				Enter.theValue(tablaJuan.get("username")).into(NewLoginSauceDemoPage.TXT_USER_NAME),
				Enter.theValue(tablaJuan.get("password")).into(NewLoginSauceDemoPage.TXT_PASSWORD),
				Click.on(NewLoginSauceDemoPage.BTN_SUBMIT)
				);
		// TODO Auto-generated method stub
		
	}
	public static NewLoginSauceDemo login(DataTable dataTable) {
		return Tasks.instrumented(NewLoginSauceDemo.class,dataTable);
	} 
	
}
