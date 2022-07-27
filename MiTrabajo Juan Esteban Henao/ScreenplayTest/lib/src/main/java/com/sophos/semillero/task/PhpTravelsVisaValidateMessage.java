package com.sophos.semillero.task;

import com.sophos.semillero.questions.IsVisibleMessageVisa;
import com.sophos.semillero.userinterfaces.PhpTravelsVisaPage;

import io.cucumber.datatable.DataTable;
import junit.framework.Assert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class PhpTravelsVisaValidateMessage implements Task {

	private String message;
	
	public PhpTravelsVisaValidateMessage(String message) {
		this.message=message;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.asksFor(IsVisibleMessageVisa.message(PhpTravelsVisaPage.FINALMESSAGE, message));
		
		
	}
	public static PhpTravelsVisaValidateMessage validateMessage (String message) {
		return Tasks.instrumented(PhpTravelsVisaValidateMessage.class, message);

	}

}
