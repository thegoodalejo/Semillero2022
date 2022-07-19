package com.sophos.semillero.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NewProductListSauceDemoPage {

	
	public static final Target BTN_ITEM1 = Target.the("agregar1").locatedBy("//button[@id='add-to-cart-sauce-labs-backpack']");
	public static final Target BTN_ITEM2 = Target.the("agregar2").locatedBy("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
	public static final Target BTN_CART = Target.the("carrito").locatedBy("//*[@id='shopping_cart_container']");
	
}


//button[@id='add-to-cart-sauce-labs-backpack']

//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']

//*[@id="shopping_cart_container"]