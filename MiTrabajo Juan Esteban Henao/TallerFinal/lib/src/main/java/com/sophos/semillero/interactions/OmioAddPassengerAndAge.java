package com.sophos.semillero.interactions;

import java.util.ArrayList;
import java.util.Map;

import com.sophos.semillero.userinterfaces.OmioPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class OmioAddPassengerAndAge implements Interaction {
	
	private Map<String, String> infoUser;

	public OmioAddPassengerAndAge(Map<String, String> informacion) {
		this.infoUser = informacion;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(OmioPage.COMBO_PASSENGER));

		for (int i = 0; i < returnNumYoung(); i++) {
			actor.attemptsTo(Click.on(OmioPage.BTN_ADD_YOUNG));
		}
		for (int i = 0; i < returnNumSenior(); i++) {
			actor.attemptsTo(Click.on(OmioPage.BTN_ADD_SENIOR));
		}

		for (int i = 0; i < returnNumAdults(); i++) {
			actor.attemptsTo(Click.on(OmioPage.BTN_ADD_ADULTS));
		}
		if (returnNumYoung() > 0) {
			for (int i = 1; i <= returnNumYoung(); i++) {
				actor.attemptsTo(Click.on(OmioPage.COMBO_SELECT_AGE.of(i + "")),
						Click.on(OmioPage.BTN_SELECT__AGE.of(i + "", returnAgesYoungs().get(i - 1) + "")));
			}
		}

		if (returnNumSenior() > 0) {
			for (int i = 1; i < returnNumSenior() + returnNumYoung(); i++) {
				actor.attemptsTo(Click.on(OmioPage.COMBO_SELECT_AGE.of(i + returnNumYoung() + "")),
						Click.on(OmioPage.BTN_SELECT__AGE.of(i + returnNumYoung() + "",
								returnAgesSenior().get(i - 1) + "")));
			}
		}
	}
	
	
	public int returnNumYoung() {
		int numYoung = Integer.parseInt(infoUser.get("jovenes"));
		return numYoung;
	}

	public int returnNumAdults() {
		int numAdults = Integer.parseInt(infoUser.get("adultos"));
		return numAdults - 1;
	}

	public int returnNumSenior() {
		int numSenior = Integer.parseInt(infoUser.get("viejos"));
		return numSenior;
	}
	/**
	 * 
	 * @return
	 */
	public ArrayList<Integer> returnAgesYoungs() {
		ArrayList<Integer> listAges = new ArrayList<>();
		String edades = infoUser.get("edad_jovenes");
		for (int i = 0; i < returnNumYoung(); i++) {
			listAges.add(Integer.parseInt(edades.split("-")[i]));
		}
		return listAges;

	}

	public ArrayList<Integer> returnAgesSenior() {
		ArrayList<Integer> listAges = new ArrayList<>();
		String edades = infoUser.get("edad_viejos");
		for (int i = 0; i < returnNumSenior(); i++) {
			listAges.add(Integer.parseInt(edades.split("-")[i]));
		}
		return listAges;

	}
	
	public static OmioAddPassengerAndAge addPassengerAndAges(Map<String, String> informacion) {
		return Tasks.instrumented(OmioAddPassengerAndAge.class, informacion);
	}

}
