package com.sophos.semillero.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ToursSectionPage {
	
	public static final Target TAB_TOURS = Target.the("Pestaña Tours").locatedBy("//button[@id='tours-tab']");
	public static final Target COMBO_DESTINATION = Target.the("Destino").locatedBy("(//span[@class='selection'])[2]/span");
	public static final Target TXT_DESTINATION = Target.the("Destino").locatedBy("//input[@class='select2-search__field']");
	public static final Target LST_DESTINATIONS = Target.the("Posibles Destinos").locatedBy("//li[@class='select2-results__option select2-results__option--highlighted']");
	public static final Target DATE_CHECKIN = Target.the("Fecha de Ingreso").locatedBy("(//input[@id='date'])[1]");
	public static final Target COMBO_TRAVELERS = Target.the("Pasajeros").locatedBy("(//a[@class='dropdown-toggle dropdown-btn travellers waves-effect'])[2]");
	public static final Target TXT_ADULTS = Target.the("Adults Quantity").locatedBy("//input[@id='tours_adults']");
	public static final Target TXT_CHILD = Target.the("Children Quantity").locatedBy("//input[@id='tours_child']");
	public static final Target BTN_SEARCH = Target.the("Search Button").locatedBy("(//button[@id='submit'])[2]");
	public static final Target DAY_DATE = Target.the("Days").locatedBy("//div[@class='datepicker dropdown-menu' and contains(@style,'display: block;')]//td[@class='day ' and text()='{0}']");
	


}
