package com.sophos.semillero.interactions;

import static com.sophos.semillero.userinterfaces.BookingPage.BTN_ADD_HABITATIONS;
import static com.sophos.semillero.userinterfaces.BookingPage.BTN_PERSONS_AND_HABITATIONS;

import java.util.Map;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BookingAddPeopleAndHabitations implements Interaction {

	private Map<String, String> infoUser;

	public BookingAddPeopleAndHabitations(Map<String, String> informacion) {
		this.infoUser = informacion;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(BTN_PERSONS_AND_HABITATIONS), 
				Click.on(BTN_ADD_HABITATIONS));

	}

	public static BookingAddPeopleAndHabitations addPeopleAndHabitations(Map<String, String> informacion) {
		return Tasks.instrumented(BookingAddPeopleAndHabitations.class, informacion);
	}

}
