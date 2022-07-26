package com.sophos.semillero.interactions;

import java.util.List;

import com.sophos.semillero.userinterfaces.ToursSectionPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SetDateInteraction implements Interaction {

	private String date;
	private String[] dateSplit = new String[3];
	
	public SetDateInteraction(String date) {
		this.date = date;
		this.dateSplit = this.date.split("-");
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		WebElementFacade elementDay = ToursSectionPage.DAY_DATE.of(dateSplit[0]).resolveFor(actor);
		System.out.println("Fecha");
		for (String day : dateSplit) {
			System.out.println("Day: "+day);
		}
		actor.attemptsTo(Click.on(elementDay));
		
	}
	
	public static SetDateInteraction setDate(String date) {
		return Tasks.instrumented(SetDateInteraction.class, date);
	}

}
