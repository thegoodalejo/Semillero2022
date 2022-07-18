package com.sophos.semillero.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoBuyPage {
	
	public static final Target FIRSNAME = Target.the("Campo nombre de usuario").located(By.id("first-name")); 
	public static final Target LASTNAME = Target.the("Campo apellido de usuario").located(By.id("last-name")); 
	public static final Target POSTALCODE = Target.the("Campo codigo postal de usuario").located(By.id("postal-code"));
	public static final Target BTN_CONTINUE = Target.the("Boton para continuar ").located(By.id("continue"));
	public static final Target BTN_CHECKOUT = Target.the("Boton para checkout").located(By.id("checkout"));
	public static final Target CONTAINER_ITEMS = Target.the("Boton para checkout").located(By.id(""));
	public static final Target MULTIPLE_ITEMS = Target.the("Boton para checkout").located(By.id("valido"));
	


}
