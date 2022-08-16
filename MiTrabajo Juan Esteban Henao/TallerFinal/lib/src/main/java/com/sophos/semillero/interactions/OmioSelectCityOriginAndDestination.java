package com.sophos.semillero.interactions;

import static com.sophos.semillero.userinterfaces.OmioPage.TXT_INPUT_DESTINATION;
import static com.sophos.semillero.userinterfaces.OmioPage.TXT_INPUT_ORIGIN;

import java.util.Map;

import org.openqa.selenium.Keys;

import com.sophos.semillero.userinterfaces.OmioPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class OmioSelectCityOriginAndDestination implements Interaction {
	
	private Map <String, String> infoUser;
	
	public OmioSelectCityOriginAndDestination(Map<String, String> informacion) {
		this.infoUser=informacion;
	}

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
		//Selecciono el txt para ingresar datos
		Click.on(OmioPage.TXT_INPUT_ORIGIN),
		// ingreso el lugar de salida y luego hago doy un tab
		Enter.keyValues(infoUser.get("salida")).into(TXT_INPUT_ORIGIN).thenHit(Keys.TAB),
		//ingreso el lugar de llegada
		Enter.theValue(infoUser.get("llegada")).into(TXT_INPUT_DESTINATION));
		
	}
	
	public static OmioSelectCityOriginAndDestination enterCityOringinAndDestination(Map<String, String> informacion) {
		return Tasks.instrumented(OmioSelectCityOriginAndDestination.class, informacion);
	}

	

}
