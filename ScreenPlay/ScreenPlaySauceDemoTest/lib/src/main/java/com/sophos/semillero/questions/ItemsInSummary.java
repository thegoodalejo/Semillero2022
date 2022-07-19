package com.sophos.semillero.questions;

import com.sophos.semillero.userinterfaces.CheckoutSecondPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ItemsInSummary implements Question<Integer>{
	
	public static ItemsInSummary value() {
		return new ItemsInSummary();
	}

	@Override
	public Integer answeredBy(Actor actor) {
		
		return BrowseTheWeb.as(actor).findAll(CheckoutSecondPage.ITEMS_IN_SUMMARY).size();
 
	}

}
