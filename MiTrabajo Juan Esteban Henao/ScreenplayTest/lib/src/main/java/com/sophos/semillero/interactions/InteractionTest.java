package com.sophos.semillero.interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sophos.semillero.task.SauceDemoLogin;
import com.sophos.semillero.userinterfaces.SauceDemoBuyPage;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnElement;

public class InteractionTest implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		/*//Forma 1
		SauceDemoBuyPage.CONTAINER_ITEMS.resolveFor(actor).findBy("");
		//Forma 2
		actor.attemptsTo(Click.on(SauceDemoBuyPage.CONTAINER_ITEMS.of("El 1 de los 8")));
		//Forma 3
		List<WebElement> listaElementos = SauceDemoBuyPage.CONTAINER_ITEMS.resolveFor(actor).findElements(By.name(""));
		for (WebElement webElement : listaElementos) {
			webElement.click();
		}
		//Forma 4
		List<WebElementFacade> listaElementos2 = SauceDemoBuyPage.MULTIPLE_ITEMS.resolveAllFor(actor);
		for (WebElement webElement : listaElementos2) {
			webElement.click();
		}
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}*/
		
	}
	
	public static InteractionTest completeInfo () {
		
		return Tasks.instrumented(InteractionTest.class);

	}
	

}
