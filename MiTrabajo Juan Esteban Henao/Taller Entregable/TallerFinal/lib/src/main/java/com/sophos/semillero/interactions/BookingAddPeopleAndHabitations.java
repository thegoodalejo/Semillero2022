package com.sophos.semillero.interactions;

import java.util.Map;

import com.sophos.semillero.userinterfaces.BookingPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BookingAddPeopleAndHabitations implements Interaction {
	
	private Map <String, String> infoUser;
	
	public BookingAddPeopleAndHabitations(Map informacion) {
		this.infoUser=informacion;
	}

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
			Click.on(BookingPage.BTN_PERSONS_AND_HABITATIONS),
			Click.on(BookingPage.BTN_ADD_HABITATIONS)
	);

		
	}
	
	public static BookingAddPeopleAndHabitations addPeopleAndHabitations(Map informacion) {
		return Tasks.instrumented(BookingAddPeopleAndHabitations.class, informacion);
	}
  
 

}
