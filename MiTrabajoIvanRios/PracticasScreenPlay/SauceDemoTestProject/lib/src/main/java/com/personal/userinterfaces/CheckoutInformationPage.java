package com.personal.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutInformationPage {
	public static final Target TXT_NAME = Target.the("Nombre").locatedBy("//input[@id='first-name']");
	public static final Target TXT_LAST_NAME = Target.the("Apellido").locatedBy("//input[@id='last-name']");
	public static final Target TXT_ZIP_CODE = Target.the("Apellido").locatedBy("//input[@id='postal-code']");
	public static final Target BTN_CONTINUE = Target.the("Boton Continuar").locatedBy("//input[@id='continue']");
	

}
