package com.sophos.semillero.interactions;

import java.util.Map;

import com.sophos.semillero.userinterfaces.BookingPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BookingSelectDate implements Interaction {
	
	private Map <String, String> infoUser;
	
	public BookingSelectDate(Map informacion) {
		this.infoUser=informacion;
	}

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
	Click.on(BookingPage.BTN_NEXT_MONTH),			
	Click.on(BookingPage.BTN_SELECT_DATE.of(infoUser.get("Check-in"))),
	Click.on(BookingPage.BTN_SELECT_DATE.of(infoUser.get("Check-out")))
	);

		
	}
	
	public static BookingSelectDate selectDate(Map informacion) {
		return Tasks.instrumented(BookingSelectDate.class, informacion);
	}
  

}
