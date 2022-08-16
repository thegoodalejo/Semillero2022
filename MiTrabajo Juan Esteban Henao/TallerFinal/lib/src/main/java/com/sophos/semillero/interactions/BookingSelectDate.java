package com.sophos.semillero.interactions;

import static com.sophos.semillero.userinterfaces.BookingPage.BTN_NEXT_MONTH;
import static com.sophos.semillero.userinterfaces.BookingPage.BTN_SELECT_DATE;

import java.util.Map;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BookingSelectDate implements Interaction {
	
	private Map <String, String> infoUser;
	
	public BookingSelectDate(Map<String, String> informacion) {
		this.infoUser=informacion;
	}

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
	Click.on(BTN_NEXT_MONTH),			
	Click.on(BTN_SELECT_DATE.of(infoUser.get("Check-in"))),
	Click.on(BTN_SELECT_DATE.of(infoUser.get("Check-out")))
	);

		
	}
	
	public static BookingSelectDate selectDate(Map<String, String> informacion) {
		return Tasks.instrumented(BookingSelectDate.class, informacion);
	}
  

}
