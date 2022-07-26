package com.personal.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
	public static final By ITEMS = By.xpath("//div[@class = 'cart_item']");
	public static final Target BTN_CHECKOUT = Target.the("Boton Checkout").locatedBy("//button[@id='checkout']");
}
