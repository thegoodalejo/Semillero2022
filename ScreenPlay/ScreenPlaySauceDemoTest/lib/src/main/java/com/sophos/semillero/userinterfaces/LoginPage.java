package com.sophos.semillero.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
	
	public static final Target TXT_USERNAME = Target.the("Campo nombre de Usuario").locatedBy("//input[@name = 'user-name']");
	public static final Target TXT_PASSWORD = Target.the("Campo de contraseña").locatedBy("//input[@name = 'password']");
	public static final Target BTN_LOGIN = Target.the("boton de Sign-in").locatedBy("//input[@name = 'login-button']");

}
