package com.sophos.semillero.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BookFlightPage {
	
	
	public static final Target BTN_FLIGHTS = Target.the("Flights").locatedBy("//button[@aria-controls='flights']");
	public static final Target TXT_FROM = Target.the("From").locatedBy("//*[@id='autocomplete']");
	public static final Target BTN_FIRSTOPTION= Target.the("FirstOption").locatedBy("//div[@data-index ='0']");
	public static final Target TXT_TO = Target.the("To").locatedBy("//*[@id='autocomplete2']");
	public static final Target TXT_DEPARTURE_DATE = Target.the("Departure Date").locatedBy("(//input[@name='depart'])[1]");
	public static final Target BTN_PASSENGERS = Target.the("Passengers").locatedBy("//a[@class='dropdown-toggle dropdown-btn waves-effect']");
	public static final Target TXT_ADULTS = Target.the("Adults").locatedBy("//input[@id='fadults']");
	public static final Target TXT_CHILDS = Target.the("Childs").locatedBy("#fchilds");
	public static final Target TXT_INFANTS = Target.the("Infants").locatedBy("#finfant");
	public static final Target BTN_SEARCHFLIGHTS = Target.the("SearchFlights").locatedBy("//button[@id='flights-search']/span[@class='ladda-label']");
	public static final Target TXT_FLIGHTPRICES = Target.the("FlightPrcies").locatedBy("[type='submit'] > strong");
	
	
}
