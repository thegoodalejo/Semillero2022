package com.sophos.semillero.questions;

import static com.sophos.semillero.userinterfaces.NewToursLoginPage.TXT_PASSWORD;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class IsInHomePage implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		 Target homePageLogo=null;
		return homePageLogo.resolveFor(actor).isVisible();
	}
	
	public static IsInHomePage loggedIn() {
		return new IsInHomePage();
	}
	
	//TXT_PASSWORD.resolveFor(null).isVisible()

}
