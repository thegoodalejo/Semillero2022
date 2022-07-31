package com.sophos.semillero.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FindAccommodationPage {
	
	public static final Target INPUT_NAME_PLACE = Target.the("Destino Turistico").locatedBy("//input[@type='search']");
	public static final Target CLICK_NAME_PLACE = Target.the("Destino").locatedBy("//*[@id='frm']/div[1]/div[1]/div[1]/div[1]/label");
	public static final Target CLICK_DATE_ENTRY = Target.the("fecha entrada").locatedBy("//td[@data-date='2022-08-31']");
	public static final Target CLICK_DATE_EXIT = Target.the("fecha salida").locatedBy("//td[@data-date='2022-09-04']");
	public static final Target CLICK_ROOM = Target.the("click numero de personas").locatedBy("//span[@class='xp__guests__count']");
	public static final Target CLICK_SEARCH = Target.the("Buscar").locatedBy("//button[@class='sb-searchbox__button ']");

}
