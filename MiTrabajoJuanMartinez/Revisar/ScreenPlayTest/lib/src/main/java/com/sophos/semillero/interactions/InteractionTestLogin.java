package com.sophos.semillero.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class InteractionTestLogin implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {

		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}

	}

	public static InteractionTestLogin number() {
		return Tasks.instrumented(InteractionTestLogin.class);
	}
}
