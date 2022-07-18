package com.sophos.semillero.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class SaucedemoLoginPage {

	public static final Target TXT_USER_NAME = Target.the("Nombre Usuario").locatedBy("//input[@id='user-name']");
	public static final Target TXT_PASSWORD = Target.the("Password").locatedBy("//input[@id='{0}']");
	public static final Target BTN_SUBMIT = Target.the("Submit").locatedBy("//input[@id='login-button']");
		
	
}
