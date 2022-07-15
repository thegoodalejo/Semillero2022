package com.sophos.semillero.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class NewToursLogInPage {

	public static final Target TXT_USER_NAME = Target.the("Campo nombre de usuario").located(By.name("userName")); 
	public static final Target TXT_PASSWORD = Target.the("Campo contrasenia de usuario").locatedBy("//input[@name='password']"); 
	public static final Target BUTTON_SUBMIT = Target.the("Campo contrasenia de usuario").locatedBy("//input[@type='submit']"); 
}
