package com.sophos.semillero.interactions;

import java.util.Map;

import org.openqa.selenium.Keys;

import com.sophos.semillero.userinterfaces.BookingPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BookingSelectCity implements Interaction {
	
	private Map <String, String> infoUser;
	
	public BookingSelectCity(Map informacion) {
		this.infoUser=informacion;
	}

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
		Click.on(BookingPage.TXT_INPUT_CITY),
		Enter.keyValues(infoUser.get("Lugar")).into(BookingPage.TXT_INPUT_CITY),
		Click.on(BookingPage.BTN_FIRST_OPTION_CITY));

		
	}
	
	public static BookingSelectCity selectCity(Map informacion) {
		return Tasks.instrumented(BookingSelectCity.class, informacion);
	}
 

}
