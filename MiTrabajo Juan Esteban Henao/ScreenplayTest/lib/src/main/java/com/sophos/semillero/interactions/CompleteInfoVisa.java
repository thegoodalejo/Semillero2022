package com.sophos.semillero.interactions;

import java.util.Map;

import org.openqa.selenium.Keys;

import com.sophos.semillero.userinterfaces.PhpTravelsVisaPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;

public class CompleteInfoVisa implements Interaction {
	public Map <String, String> dataTable;
	
	public CompleteInfoVisa(DataTable datatable) {
		this.dataTable=datatable.asMap(String.class, String.class);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(PhpTravelsVisaPage.COMBO_FROMCOUNTRY),
				Enter.theValue(dataTable.get("fromCountry")).into(PhpTravelsVisaPage.INPUT_COUNTRY).thenHit(Keys.ENTER),
			//	Hit.the(Keys.ENTER).keyIn(PhpTravelsVisaPage.COMBO_FROMCOUNTRY),
				Click.on(PhpTravelsVisaPage.COMBO_TOCOUNTRY),
				Enter.theValue(dataTable.get("toCountry")).into(PhpTravelsVisaPage.INPUT_COUNTRY),
				Hit.the(Keys.ENTER).keyIn(PhpTravelsVisaPage.COMBO_TOCOUNTRY),
				Click.on(PhpTravelsVisaPage.DATEPICKER),
				Click.on(PhpTravelsVisaPage.INDAY.of(returnDay())),
				Click.on(PhpTravelsVisaPage.BTN_SUBMIT),
				
				
				
				Enter.theValue(dataTable.get("firstName")).into(PhpTravelsVisaPage.TXT_FIRSTNAME),
				Enter.theValue(dataTable.get("lastName")).into(PhpTravelsVisaPage.TXT_LASTNAME),
				Enter.theValue(dataTable.get("email")).into(PhpTravelsVisaPage.TXT_EMAIL),
				Enter.theValue(dataTable.get("phone")).into(PhpTravelsVisaPage.TXT_PHONE),
				Enter.theValue(dataTable.get("dates")).into(PhpTravelsVisaPage.TXT_DATE),
				Enter.theValue(dataTable.get("notes")).into(PhpTravelsVisaPage.TXT_NOTES),
				Hit.the(Keys.TAB).into(PhpTravelsVisaPage.TXT_NOTES),
				Hit.the(Keys.ENTER).into(PhpTravelsVisaPage.BTN_SUBMIT2));
				
				
				
				
			
			//	Scroll.to(PhpTravelsVisaPage.SCROLL).andAlignToTop(),
		//		Click.on(PhpTravelsVisaPage.BTN_SUBMIT2)
				
			//	);
		
	}
	public  String returnDay() {
		String fecha= dataTable.get("date");
		String dia = fecha.split("-")[1];
		return dia;
		
	}

	
	
	public static CompleteInfoVisa completeInfo (DataTable dataTable) {
		return Tasks.instrumented(CompleteInfoVisa.class, dataTable);

	}

}
