package com.sophos.semillero.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutOnePage {

	public static final Target TXT_FIRST_NAME = Target.the("Campo de texto del primer nombre").locatedBy("//input[@name = 'firstName']");
	public static final Target TXT_LAST_NAME = Target.the("Campo de texto del apellido").locatedBy("//input[@name = 'lastName']");
	public static final Target TXT_ZIP_CODE = Target.the("Campo de texto del apellido").locatedBy("//input[@name = 'postalCode']");
	
	public static final Target BTN_CONTINUE = Target.the("Boton de Continue").locatedBy("//input[@name = 'continue']");
	
}
