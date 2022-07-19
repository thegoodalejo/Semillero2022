package com.sophos.semillero.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutSecondPage {
	
	public static final By ITEMS_IN_SUMMARY = By.xpath("//div[@class = 'cart_item']"); 
	
	public static final Target BTN_FINISH = Target.the("Boton de Finalizar compra").locatedBy("//button[@name = 'finish']");
	

}
