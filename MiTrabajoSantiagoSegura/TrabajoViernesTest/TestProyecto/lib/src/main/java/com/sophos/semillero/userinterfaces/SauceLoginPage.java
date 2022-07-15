package com.sophos.semillero.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SauceLoginPage {

	public static Target TXT_USER_NAME = Target.the("Nombre de usuario").located(By.id("user-name"));
	public static Target TXT_PASSWORD = Target.the("Nombre de usuario").located(By.id("password"));
	public static Target BTN_LOGIN = Target.the("Nombre de usuario").locatedBy("//input[@name='login-button']");
    
	
	
}
