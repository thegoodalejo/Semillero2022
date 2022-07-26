package com.personal.questions;

import static com.personal.userinterfaces.CheckoutCompletePage.LBL_THANKS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ConfirmPurchaseMessage implements Question<String> {

	public static Question<String> value(){
		return new ConfirmPurchaseMessage();
	}
	
	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return BrowseTheWeb.as(actor).find(LBL_THANKS).getText();
	}
	
	

}
