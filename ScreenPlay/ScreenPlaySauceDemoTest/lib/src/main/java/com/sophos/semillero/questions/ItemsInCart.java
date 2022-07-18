package com.sophos.semillero.questions;

import java.util.List;

import com.sophos.semillero.userinterfaces.CartPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ItemsInCart implements Question<Integer>{
	
	public static Question<Integer> value() {
		return new ItemsInCart();
	}
	
	@Override
	public Integer answeredBy(Actor actor) {
		return BrowseTheWeb.as(actor).findAll(CartPage.ITEMS).size();
	}
	
	

}
