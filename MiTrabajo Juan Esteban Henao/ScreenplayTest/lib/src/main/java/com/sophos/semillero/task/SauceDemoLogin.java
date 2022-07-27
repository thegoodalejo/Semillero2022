package com.sophos.semillero.task;

import static com.sophos.semillero.userinterfaces.SauceDemoLogInpage.TXT_USER_NAME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.Map;

import com.sophos.semillero.interactions.InteractionTest;
import com.sophos.semillero.userinterfaces.SauceDemoLogInpage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SauceDemoLogin implements Task  {
	private Map <String, String> dataTable;
	
	public SauceDemoLogin(DataTable dataTable) {
		this.dataTable = dataTable.asMap(String.class, String.class);

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.url(dataTable.get("url")),
				/*WaitUntil.the(TXT_USER_NAME, isVisible()).forNoMoreThan(10).seconds(),*/
				Enter.theValue(dataTable.get("userName")).into(TXT_USER_NAME),
				Enter.theValue(dataTable.get("password")).into(SauceDemoLogInpage.TXT_PASSWORD.of("password")),
				Click.on(SauceDemoLogInpage.BUTTON_SUBMIT)/*,
				InteractionTest.number()*/);
		
	}
	
	public static SauceDemoLogin inSauceDemo (DataTable dataTable) {
		return Tasks.instrumented(SauceDemoLogin.class, dataTable);

	}

}
