package com.sophos.semillero.questions;

import com.sophos.semillero.userinterfaces.InventoryPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class TitleInventory implements Question<String>{
	
	public static Question<String> value(){
		return new TitleInventory();
	}
	
	@Override
	public String answeredBy(Actor actor) {
		return BrowseTheWeb.as(actor).find(InventoryPage.LBL_TITLE).getText();
	}

}
