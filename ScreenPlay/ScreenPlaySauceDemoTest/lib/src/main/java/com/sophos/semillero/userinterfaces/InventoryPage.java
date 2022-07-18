package com.sophos.semillero.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class InventoryPage {
	
	public static final By LBL_TITLE = By.xpath("//span[@class = 'title']");
	
	public static final Target CARD_PRODUCT = Target.the("Producto").locatedBy("//a/div[text() = '{0}']//ancestor-or-self::div[@class = 'inventory_item']//button");
	
	public static final Target BTN_CART = Target.the("Boton de carrito de compra").locatedBy("//a[@class = 'shopping_cart_link']");

}
