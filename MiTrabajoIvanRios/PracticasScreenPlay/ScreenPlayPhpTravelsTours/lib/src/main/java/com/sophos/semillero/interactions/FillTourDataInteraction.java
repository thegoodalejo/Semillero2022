package com.sophos.semillero.interactions;

import java.util.List;

import com.sophos.semillero.models.TourInformation;
import com.sophos.semillero.userinterfaces.ToursSectionPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class FillTourDataInteraction implements Interaction {

	private TourInformation tourData;
	
	public FillTourDataInteraction(TourInformation data) {
		this.tourData=data;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(ToursSectionPage.COMBO_DESTINATION),
				Enter.keyValues(this.tourData.getDestination()).into(ToursSectionPage.TXT_DESTINATION),
				WaitUntil.the(ToursSectionPage.LST_DESTINATIONS,WebElementStateMatchers.isVisible()),
				ElementOfSearchListInteraction.clickOnElementOfList(tourData.getDestination()),
				Click.on(ToursSectionPage.DATE_CHECKIN),
				SetDateInteraction.setDate(tourData.getDate()),
				Click.on(ToursSectionPage.COMBO_TRAVELERS),
				Enter.theValue(this.tourData.getAdultsQuantity()).into(ToursSectionPage.TXT_ADULTS),
				Enter.theValue(this.tourData.getChildrenQuantity()).into(ToursSectionPage.TXT_CHILD),
				Click.on(ToursSectionPage.BTN_SEARCH)
				);
		}
	
	public static FillTourDataInteraction fillData(TourInformation data) {
		return Tasks.instrumented(FillTourDataInteraction.class, data);
	}

}
