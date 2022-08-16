package com.sophos.semillero.interactions;

import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.interactions.Keyboard;

import com.sophos.semillero.userinterfaces.OmioPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class OmioSelectCityOriginAndDestination implements Interaction {
	
	private Map <String, String> infoUser;
	
	public OmioSelectCityOriginAndDestination(Map informacion) {
		this.infoUser=informacion;
	}

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
		Click.on(OmioPage.TXT_INPUT_ORIGIN),
		Enter.keyValues(infoUser.get("salida")).into(OmioPage.TXT_INPUT_ORIGIN).thenHit(Keys.TAB),
		//WaitUntil.the(OmioPage.TXT_INPUT_ORIGIN, WebElementStateMatchers.isVisible()),
		Enter.theValue(infoUser.get("llegada")).into(OmioPage.TXT_INPUT_DESTINATION));
		
	}
	
	public static OmioSelectCityOriginAndDestination enterCityOringinAndDestination(Map informacion) {
		return Tasks.instrumented(OmioSelectCityOriginAndDestination.class, informacion);
	}

	

}
