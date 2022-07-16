package com.sophos.semillero.userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class SaucedemoAddProductsPage {

	public static final Target BTN_PRODUCT1 = Target.the("Sauce Labs Backpack").locatedBy("//button[@id='add-to-cart-sauce-labs-backpack']");
	public static final Target BTN_PRODUCT2 = Target.the("Sauce Labs Fleece Jacket").locatedBy("//button[@id='remove-sauce-labs-fleece-jacket']");
	public static final Target BTN_SHOPPING_CART = Target.the("Submit").locatedBy("//a[@class='shopping_cart_link']");
		
	
}
