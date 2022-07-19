package com.sophos.semillero.tasks;

import java.util.List;

import com.sophos.semillero.interactions.FillForm;
import com.sophos.semillero.models.Customer;
import com.sophos.semillero.userinterfaces.CheckoutOnePage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DoPurchaseVerification implements Task{

	private List<Customer> customer;
	
	public DoPurchaseVerification(DataTable customer) {
		this.customer = customer.asList(Customer.class); 
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				
				FillForm.withPersonalData(customer.get(0)),
				
				/*Es necesario hacer una interaccion para un click de un boton?*/
				Click.on(CheckoutOnePage.BTN_CONTINUE)
		);
		
	}
	
	public static DoPurchaseVerification withPersonalData(DataTable customer) {
		return Tasks.instrumented(DoPurchaseVerification.class, customer);
	}

}
