package com.sophos.semillero.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PhpTravelsSearchToursPage {
	
	public static final Target BTN_TOURS = Target.the("Boton Tours").located(By.id("tours-tab"));
	public static final Target TXT_SEARCH_CITY = Target.the("Busqueda por ciudad").located(By.id("select2-tours_city-container"));
	public static final Target TXT_CITY = Target.the("City").located(By.className("select2-search__field"));
	public static final Target TXT_DATE = Target.the("Date").locatedBy("(//input[@id='date'])[1]");
	public static final Target BTN_DAY_DATE = Target.the("Boton dayDate").locatedBy("//div[@class='datepicker dropdown-menu' and @style]//td[text()='{0}']");
	public static final Target BTN_TRAVELLERS = Target.the("Boton travellers").locatedBy("(//div[@class='dropdown dropdown-contain'])[3]");
	public static final Target INPUT_QTY_ADULT = Target.the("Boton cantidad adultos").located(By.id("tours_adults"));
	public static final Target INPUT_QTY_CHILD = Target.the("Boton cantidad niños").located(By.id("tours_child"));
	public static final Target BTN_SEARCH_TOURS = Target.the("Boton Search").locatedBy("(//button[@id='submit'])[2]");

}
