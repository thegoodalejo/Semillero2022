package com.sophos.semillero.userinterfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;

import net.serenitybdd.screenplay.targets.Target;

public class NewToursLoginPage {
	//Uno puede referenciar o por Xpath o por funciones de busqueda de clases, id,name, etc.
	public static final Target TXT_USER_NAME = Target.the("Nombre Usuario").locatedBy("//input[@name='userName']");
	public static final Target TXT_USER_NAME2 = Target.the("Nombre Usuario").located(By.name("userName"));
	public static final Target TXT_PASSWORD = Target.the("Contraseña").located(By.name("password"));
	public static final Target BTN_SUBMIT = Target.the("Boton Submit").located(By.name("submit"));
}
