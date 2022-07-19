package com.sophos.semillero.tasks;

import java.util.List;

import com.sophos.semillero.interactions.AddItemToCartInteraction;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AddItemsToCart implements Task{

	private static List<String> items;
	
	public AddItemsToCart(DataTable data) {
		
		this.items = data.asList(String.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				
			AddItemToCartInteraction.addItemsToCart(items)
				
		);
		
	}
	
	public static AddItemsToCart items(DataTable items) {
		return Tasks.instrumented(AddItemsToCart.class, items);
	}
	

}
