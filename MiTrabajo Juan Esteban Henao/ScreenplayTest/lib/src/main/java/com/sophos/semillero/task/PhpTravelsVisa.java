package com.sophos.semillero.task;

import static com.sophos.semillero.userinterfaces.PhpTravelsVisaPage.TAB_VISA;

import java.util.Map;

import com.sophos.semillero.userinterfaces.PhpTravelsVisaPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class PhpTravelsVisa  implements Task  {
	private Map <String, String> dataTable;
	
	
	public PhpTravelsVisa(DataTable dataTable) {
		this.dataTable = dataTable.asMap(String.class, String.class);

	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.url(dataTable.get("url")));
				
		
	} 
	
	public static PhpTravelsVisa inPhpTravels (DataTable dataTable) {
		return Tasks.instrumented(PhpTravelsVisa.class, dataTable);

	}

}
