package com.sophos.semillero.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class SauceDemoAddProductsPage {
	
	public static final Target BTN_PRODUCT1 = Target.the("Boton del primer producto").locatedBy("[data-test='add-to-cart-sauce-labs-backpack']"); 
	public static final Target BTN_PRODUCT2 = Target.the("Boton del segundo producto").locatedBy("[data-test='add-to-cart-sauce-labs-bolt-t-shirt']"); 
	public static final Target BTN_CAR = Target.the("Boton del carrito").located(By.id("shopping_cart_container")); 

}
