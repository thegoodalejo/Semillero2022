package com.sophos.semillero.tasks;

import static com.sophos.semillero.userinterfaces.SauceDemoLoginPage.BTN_LOGIN;
import static com.sophos.semillero.userinterfaces.SauceDemoLoginPage.TXT_USER_NAME;

import java.util.Map;

import com.sophos.semillero.interactions.InteractionTest;
import com.sophos.semillero.userinterfaces.SauceDemoLoginPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class SauceDemoLogin implements Task {
	private Map<String, String> tablaLoginSauceDemo;
	
	public SauceDemoLogin(DataTable dataTable) {
		this.tablaLoginSauceDemo = dataTable.asMap(String.class, String.class);
		System.out.println("Hola soy el constructor vacio");
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.url(tablaLoginSauceDemo.get("url")),
				Enter.theValue(tablaLoginSauceDemo.get("username")).into(TXT_USER_NAME),
				Enter.theValue(tablaLoginSauceDemo.get("password")).into(SauceDemoLoginPage.TXT_PASSWORD),
				Click.on(BTN_LOGIN),
				InteractionTest.number());
		
	}
	public static SauceDemoLogin inSauceDemo(DataTable dataTable) {
		return Tasks.instrumented(SauceDemoLogin.class, dataTable);
	}

}
