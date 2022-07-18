package com.sophos.semillero.userinterfaces;
import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SaucedemoAddProductsPage {

	public static final Target BTN_PRODUCT1 = Target.the("Sauce Labs Backpack").located(By.id("add-to-cart-sauce-labs-backpack"));
	public static final Target BTN_PRODUCT2 = Target.the("Sauce Labs Fleece Jacket").located(By.id("add-to-cart-sauce-labs-fleece-jacket"));
	public static final Target BTN_SHOPPING_CART = Target.the("Submit").locatedBy("//a[@class='shopping_cart_link']");
	public static final Target CONTAINER_ITEMS = Target.the("Boton para checkout").locatedBy(null);
	public static final Target MULTIPLE_ITEMS = Target.the("Boton para checkout").locatedBy(null);
	
}
