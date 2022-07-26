package com.personal.tasks;

import java.util.List;

import com.personal.interactions.AddItemToShoppingCart;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class AddItemToShoppingCartTask implements Task {
	
	private static List<String> items;
	
	public AddItemToShoppingCartTask(DataTable dataTable) {
		this.items = dataTable.asList(String.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				AddItemToShoppingCart.addItemsToCart(items)
				);
		
	}

public static AddItemToShoppingCartTask addItemToCart(DataTable data) {
	return Tasks.instrumented(AddItemToShoppingCartTask.class, data);
}

}
