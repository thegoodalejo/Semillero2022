package com.sophos.semillero.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewToursLoginPage {
	
	public static final Target TXT_USER_NAME = Target.the("Nombre Usuario").located(By.name("userName"));
	public static final Target TXT_PASSWORD = Target.the("Password").located(By.name("password"));
	public static final Target BTN_SUBMIT = Target.the("Enviar").locatedBy("//input[@name ='submit']");
	
	//input[@name ="userName"]

	//input[@name ="password"]

	//input[@name ="submit"]

}
