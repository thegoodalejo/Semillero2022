package com.sophos.semillero.interactions;

import java.util.List;

import com.sophos.semillero.userinterfaces.ToursSectionPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ElementOfSearchListInteraction implements Interaction{
	private String destination;
	
	public ElementOfSearchListInteraction(String destination) {
		this.destination = destination;
	}
	
    @Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		WebElementFacade element =  ToursSectionPage.LST_DESTINATIONS.resolveFor(actor);
				actor.attemptsTo(Click.on(element));
		
	}
    
    public static ElementOfSearchListInteraction clickOnElementOfList(String destination) {
    	return Tasks.instrumented(ElementOfSearchListInteraction.class,destination);
    }

}
