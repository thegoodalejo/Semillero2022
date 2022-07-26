package com.personal.questions;

import static com.personal.userinterfaces.LoginPage.LBL_LOCKED_USER;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class UserLockedError implements Question<String> {
	
	public static Question<String> value(){
		return new UserLockedError();
	}
	
	@Override
	public String answeredBy(Actor actor) {
		return BrowseTheWeb.as(actor).find(LBL_LOCKED_USER).getText();
	}

}
