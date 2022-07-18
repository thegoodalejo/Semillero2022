package com.sophos.semillero.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoLogInpage {
	public static final Target TXT_USER_NAME = Target.the("Campo nombre de usuario").located(By.name("user-name")); 
	public static final Target TXT_PASSWORD = Target.the("Campo contrasenia de usuario").locatedBy("//input[@name='{0}']"); 
	public static final Target BUTTON_SUBMIT = Target.the("Boton de iniciar Sesion").locatedBy("//input[@name='login-button']"); 
}
