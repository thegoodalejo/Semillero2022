package com.sophos.semillero.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class IsHomePage implements Question<Boolean> {


	@Override
	public Boolean answeredBy(Actor actor) {
		Target homePageLogo = null;
		return homePageLogo.resolveFor(actor).isVisible();
	}
	
	public static IsHomePage logged() {
		return new IsHomePage();

	}

}
