package com.sophos.semillero.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OmioPage {
	
	public static final Target BTN_ACCEPT_COOKIE = Target.the("Boton para aceptar cookies").locatedBy("//button[@type='button' and @class = 'button-115Qm8 primary-8QTBqz']");
	public static final Target TXT_INPUT_ORIGIN = Target.the("Input para la ciudad origen").locatedBy("//input[@data-e2e='departurePositionInput']");
	public static final Target TXT_INPUT_DESTINATION = Target.the("Input para la ciudad destino").locatedBy("//input[@data-e2e='arrivalPositionInput']");
	public static final Target DATEPICKER_CALENDAR = Target.the("Calendario para la fecha de salida").locatedBy("//div[@data-e2e='buttonDepartureDate']");
	public static final Target TXT_CALENDAR = Target.the("Calendario para la fecha de salida").locatedBy("//span[@data-e2e='buttonDepartureDateText']");
	public static final Target BTN_SEARCH = Target.the("Boton para buscar").locatedBy("//button[@data-e2e='buttonSearch']");
	public static final Target BTN_CLOSE_BOOKING = Target.the("Boton para buscar con booking").locatedBy("//div[@class='react-toggle react-toggle--checked']");
	public static final Target BTN_DAY_CALENDAR = Target.the("Boton para buscar el dia en el calendario").locatedBy("//li[@date='{0}']");
	public static final Target BTN_DAY_CALENDAR_REGRESO = Target.the("Boton para buscar el dia de regreso en el calendario").locatedBy("//div[@data-e2e='buttonReturnDate']");
	public static final Target COMBO_PASSENGER = Target.the("Boton desplegar el aniadir pasajeros").locatedBy("//button[@class='_aec2f']");
	public static final Target BTN_ADD_ADULTS = Target.the("Boton para aniadir adultos").locatedBy("//button[@data-e2e='addRemovePassengerButton_adult_plus']");
	public static final Target BTN_ADD_YOUNG = Target.the("Boton para aniadir jovenes").locatedBy("//button[@data-e2e='addRemovePassengerButton_youth_plus']");
	public static final Target BTN_ADD_SENIOR = Target.the("Boton para aniadir viejos").locatedBy("//button[@data-e2e='addRemovePassengerButton_senior_plus']");
	public static final Target BTN_COP = Target.the("Boton para seleccionar COP").locatedBy("//li[@class='CurrencySwitcherstyles__Currency-sc-jf7me1-1 hKPWlD'][20]");
	public static final Target BTN_MONEY = Target.the("Boton para seleccionar la moneda").locatedBy("//div[@class='_55a19']/button[@data-component='DropdownButton']");
	public static final Target COMBO_SELECT_AGE = Target.the("Combobox contenedor de las edades").locatedBy("(//select[@class='sc-dvxrdz-2 eILLpo'])[{0}]");
	public static final Target BTN_SELECT__AGE = Target.the("Boton para seleccionar las edades").locatedBy("(//select[@class='sc-dvxrdz-2 eILLpo'])[{0}]//option[@value='{1}']");
	public static final Target BTN_SELECT_Test = Target.the("test").locatedBy("//*[@id='app']//span");
	
	


}
