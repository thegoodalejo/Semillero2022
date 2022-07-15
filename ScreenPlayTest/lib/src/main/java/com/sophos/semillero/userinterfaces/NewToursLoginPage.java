package com.sophos.semillero.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class NewToursLoginPage {

	public static final Target TXT_USER_NAME = Target.the("Nombre Usuario").locatedBy("//input[@name='userName']");
	public static final Target TXT_PASSWORD = Target.the("Password").locatedBy("//input[@name='password']");
	public static final Target BTN_SUBMIT = Target.the("Submit").locatedBy("//input[@name='submit']");
		
	
}
