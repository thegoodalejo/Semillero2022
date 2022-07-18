package com.sophos.semillero.interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sophos.semillero.userinterfaces.SaucedemoAddProductsPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class InteractionTest implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {
		SaucedemoAddProductsPage.CONTAINER_ITEMS.resolveFor(actor)
.findBy("");
		actor.attemptsTo(Click.on(SaucedemoAddProductsPage.CONTAINER_ITEMS.of("el 1 de los 8")));
		List<WebElement> listaElementos = SaucedemoAddProductsPage.CONTAINER_ITEMS.resolveFor(actor).findElements(By.xpath(null));
		for (WebElement webElement:listaElementos) {
			webElement.click();
		}
		List<WebElementFacade> listaElementos2 = SaucedemoAddProductsPage.MULTIPLE_ITEMS.resolveAllFor(actor);
		for (WebElementFacade webElement:listaElementos2) {
			webElement.click();
		}
	}
	
	public static InteractionTest number() {
		return Tasks.instrumented(InteractionTest.class);
	}

}
