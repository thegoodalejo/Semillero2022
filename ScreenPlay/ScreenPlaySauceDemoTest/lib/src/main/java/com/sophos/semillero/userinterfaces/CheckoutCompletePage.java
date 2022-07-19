package com.sophos.semillero.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class CheckoutCompletePage{
	
//	public static final Target LBL_THANK = Target.the("Mensaje de agradecimiento por compra")
//			.locatedBy("//h2[@class = 'complete-header']");
	
	public static final By LBL_THANK = By.xpath("//h2[@class = 'complete-header']");

}
