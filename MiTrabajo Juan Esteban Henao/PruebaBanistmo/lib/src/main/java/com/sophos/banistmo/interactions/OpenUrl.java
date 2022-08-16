package com.sophos.banistmo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUrl implements Interaction {

	private String strUrl;

	public OpenUrl(String url) {
		this.strUrl = url;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.url(strUrl));

	}

	public static OpenUrl openUrl(String url) {
		return Tasks.instrumented(OpenUrl.class, url);
	}

}
