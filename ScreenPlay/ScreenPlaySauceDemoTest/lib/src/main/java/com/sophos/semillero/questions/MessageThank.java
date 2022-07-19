package com.sophos.semillero.questions;

import com.sophos.semillero.userinterfaces.CheckoutCompletePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

public class MessageThank implements Question<String>{

	public static MessageThank value() {
		return new MessageThank();
	}
	
	@Override
	public String answeredBy(Actor actor) {
		
		return BrowseTheWeb.as(actor).find(CheckoutCompletePage.LBL_THANK).getTextContent();
	}

}
