package com.personal.questions;

import com.personal.userinterfaces.CartPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ItemsInCart implements Question<Integer> {

	public static Question<Integer> value(){
		return new ItemsInCart();
	}
	@Override
	public Integer answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return BrowseTheWeb.as(actor).findAll(CartPage.ITEMS).size();
	}
	

}
