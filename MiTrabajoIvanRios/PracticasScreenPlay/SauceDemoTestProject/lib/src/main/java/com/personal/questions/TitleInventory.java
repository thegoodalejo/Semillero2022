package com.personal.questions;

import static com.personal.userinterfaces.InventoryPage.LBL_TITLE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class TitleInventory implements Question<String>{
	
	public static Question<String> value(){
		return new TitleInventory();
	}

	@Override
	public String answeredBy(Actor actor) {
		return BrowseTheWeb.as(actor).find(LBL_TITLE).getText();
	}

}
