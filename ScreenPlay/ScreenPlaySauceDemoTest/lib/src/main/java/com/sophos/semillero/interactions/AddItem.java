package com.sophos.semillero.interactions;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.sophos.semillero.userinterfaces.CartPage;
import com.sophos.semillero.userinterfaces.InventoryPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddItem implements Interaction{
	
	private List<String> items;
	
	public AddItem(List<String> items) {
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
	
	public static AddItem toCart(List<String> items) {
		return Tasks.instrumented(AddItem.class, items);
	}

}
