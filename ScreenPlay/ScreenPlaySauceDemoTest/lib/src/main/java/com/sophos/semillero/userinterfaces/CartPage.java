package com.sophos.semillero.userinterfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.targets.Target;


public class CartPage {
	
	//public static final By ITEMS = By.xpath("//div[@class = 'cart_item']");
	
	public static final By ITEMS = By.xpath("//div[@class = 'cart_item']//div[@class = 'inventory_item_price']");
	
	public static final Target BTN_CHECKOUT = Target.the("boton de checkout").locatedBy("//button[@name = 'checkout']");

}
