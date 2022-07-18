package com.sophos.semillero.interactions;

import java.util.List;

import com.sophos.semillero.userinterfaces.InventoryPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddItemToCartInteraction implements Interaction{
	
	private List<String> items;
	
	public AddItemToCartInteraction(List<String> items) {
		this.items = items;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
	
		for(String item : items) {
			
			actor.attemptsTo(
					Click.on(InventoryPage.CARD_PRODUCT.of(item))
			);
		}
		
	}
	
	public static AddItemToCartInteraction addItemsToCart(List<String> items) {
		return Tasks.instrumented(AddItemToCartInteraction.class, items);
	}

}
