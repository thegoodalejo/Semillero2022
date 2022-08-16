package com.sophos.banistmo.task;

import com.sophos.banistmo.userinterface.BanistmoPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class BanistmoLocatePDF implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BanistmoPage.BTN_APRENDER_ES_FACIL),
				WaitUntil.the(BanistmoPage.BTN_LEGALES, WebElementStateMatchers.isVisible()).forNoMoreThan(1).seconds(),
				Click.on(BanistmoPage.BTN_LEGALES),
				WaitUntil.the(BanistmoPage.BTN_FATCA, WebElementStateMatchers.isVisible()).forNoMoreThan(1).seconds(),
				Click.on(BanistmoPage.BTN_FATCA),
				WaitUntil.the(BanistmoPage.BTN_PDF, WebElementStateMatchers.isVisible()).forNoMoreThan(1).seconds(),
				Click.on(BanistmoPage.BTN_PDF)
				);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	public static BanistmoLocatePDF locatePDF() {
		return Tasks.instrumented(BanistmoLocatePDF.class);
	}
}
