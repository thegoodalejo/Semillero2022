package com.sophos.semillero.interactions;

import com.sophos.semillero.models.Customer;
import com.sophos.semillero.userinterfaces.CheckoutOnePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class FillForm implements Interaction{
	
	private Customer customer;
	
	public FillForm(Customer customer) {
		this.customer = customer;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Enter.theValue(customer.getFirstName()).into(CheckoutOnePage.TXT_FIRST_NAME),
				Enter.theValue(customer.getLastName()).into(CheckoutOnePage.TXT_LAST_NAME),
				Enter.theValue(customer.getZipCode()).into(CheckoutOnePage.TXT_ZIP_CODE)
		);
		
	}
	
	public static FillForm withPersonalData(Customer customer) {
		return Tasks.instrumented(FillForm.class, customer);
	}

}
