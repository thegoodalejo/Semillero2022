package com.sophos.semillero.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BookingPage {
	
	public static final Target TXT_INPUT_CITY = Target.the("Input para la ciudad origen").locatedBy("//input[@id='ss']");
	public static final Target BTN_FIRST_OPTION_CITY = Target.the("Seleccion de la primera ciudad").locatedBy("(//li[@class='c-autocomplete__item sb-autocomplete__item sb-autocomplete__item-with_photo sb-autocomplete__item__item--elipsis sb-autocomplete__item--icon_revamp sb-autocomplete__item--city '])[1]");
	public static final Target BTN_SELECT_DATE = Target.the("Boton para seleccionar la fecha").locatedBy("//span[@aria-label = '{0}']");
	public static final Target BTN_NEXT_MONTH = Target.the("Boton para cambiar de mes").locatedBy("//div[@class= 'bui-calendar__control bui-calendar__control--next']");
	public static final Target BTN_PERSONS_AND_HABITATIONS = Target.the("Boton desplegar las configuraciones de personas y habitaciones").locatedBy("//label[@class= 'xp__input']");
	public static final Target BTN_ADD_ADULTS = Target.the("Boton para aniadir un adulto").locatedBy("//button[@aria-label= 'Aumenta el número de Adultos']");
	public static final Target BTN_ADD_HABITATIONS = Target.the("Boton para aniadir una habitacion").locatedBy("//button[@aria-label= 'Aumenta el número de Habitaciones']");
	public static final Target BTN_SEARCH = Target.the("Boton para buscar").locatedBy("//button[@class= 'sb-searchbox__button ']");
	
	//#######
	
	public static final Target POINTS = Target.the("Puntajes de cada sitio mayor o igual a 9").locatedBy("//div[@class='b5cd09854e d10a6220b4' and contains(text(),'9,')]");
	public static final Target PRICES = Target.the("Puntajes de cada sitio mayor o igual a 9").locatedBy("//span[@class='fcab3ed991 bd73d13072']");
	public static final Target BTN_FILTRO_PLAYA = Target.the("Boton del filtro de la playa").locatedBy("(//label[@class='efeda70352']//div[@data-testid='filters-group-label-content' and contains(text(), 'Primera línea de playa')])[1]");
	public static final Target BTN_FILTRO_1KM = Target.the("Boton del filtro de menos de un km").locatedBy("(//label[@class='efeda70352']//div[@data-testid='filters-group-label-content' and contains(text(), 'Menos de 1 km')])[1]");
	public static final Target BTN_FILTRO_9POINTS = Target.the("Boton del filtro de mas de 9 puntos").locatedBy("(//label[@class='efeda70352']//div[@data-testid='filters-group-label-content' and contains(text(), 'Fantástico')])[1]");

}
//span[@class='fcab3ed991 bd73d13072']
//div[@class='b5cd09854e d10a6220b4' and contains(text(),'9,')]//ancestor::div[@class='b978843432']//span[@class='acb0d5ead1' and (contains(text(),'') or contains(text(),'m')) ]