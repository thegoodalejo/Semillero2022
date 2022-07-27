package com.sophos.semillero.task;


import com.sophos.semillero.interactions.CompleteInfoVisa;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class PhpTravelsVisaCompleteInfo implements Task{
	
	DataTable dataTable;
	
	public PhpTravelsVisaCompleteInfo(DataTable dataTable) {
		this.dataTable=dataTable;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(CompleteInfoVisa.completeInfo(dataTable));
		
		
	}

	public static PhpTravelsVisaCompleteInfo completeInfo (DataTable dataTable) {
		return Tasks.instrumented(PhpTravelsVisaCompleteInfo.class, dataTable);

	}
}
