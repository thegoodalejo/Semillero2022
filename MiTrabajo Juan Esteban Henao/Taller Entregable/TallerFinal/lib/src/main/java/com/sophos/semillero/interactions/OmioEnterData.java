package com.sophos.semillero.interactions;
import java.util.Map;
import com.sophos.semillero.userinterfaces.OmioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;



public class OmioEnterData implements Interaction {

	private Map<String, String> infoUser;

	public OmioEnterData(Map informacion) {
		this.infoUser = informacion;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(

				Click.on(OmioPage.DATEPICKER_CALENDAR), 
				Click.on(OmioPage.BTN_DAY_CALENDAR
						.of(infoUser.get("fecha_salida") + " 2022 00:00:00 GMT-0500 (hora estándar de Colombia)")));
		
		if (!(infoUser.get("fecha_regreso").equalsIgnoreCase("0"))) {
			actor.attemptsTo(
					Click.on(OmioPage.BTN_DAY_CALENDAR_REGRESO), 
					Click.on(OmioPage.BTN_DAY_CALENDAR
					.of(infoUser.get("fecha_regreso") + " 2022 00:00:00 GMT-0500 (hora estándar de Colombia)")));
		}

	}

	public static OmioEnterData enterDate(Map informacion) {
		return Tasks.instrumented(OmioEnterData.class, informacion);
	}

}
