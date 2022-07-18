package com.sophos.semillero.tasks;

import static com.sophos.semillero.userinterfaces.SaucedemoAddProductsPage.*;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;


public class SaucedemoAddProducts implements Task {
	
	private Map <String, String> saucedemoProductsTable;
	
	public SaucedemoAddProducts(DataTable dataTableProducts) {
		this.saucedemoProductsTable = dataTableProducts.asMap(String.class, String.class);
		
	}
	
	 
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Open.url(saucedemoProductsTable.get("url")),
				Click.on(BTN_PRODUCT1),
				Click.on(BTN_PRODUCT2),
				Click.on(BTN_SHOPPING_CART)
				);		
	}
	public static SaucedemoAddProducts ofTheProductList(DataTable datatable) {
		return Tasks.instrumented(SaucedemoAddProducts.class,datatable);
	}
	
}
