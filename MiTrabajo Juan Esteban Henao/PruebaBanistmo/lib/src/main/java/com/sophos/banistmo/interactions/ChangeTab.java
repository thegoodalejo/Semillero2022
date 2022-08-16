package com.sophos.banistmo.interactions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;


public class ChangeTab implements Interaction {
	WebDriver driver;
	
	
	public ChangeTab() {
		//change();
	}
	private void change() {
		driver.get("https://www.banistmo.com/wps/portal/banistmo/personas/aprender-es-facil/legales/fatca/");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		driver.get("https://www.banistmo.com/wps/portal/banistmo/personas/aprender-es-facil/legales/fatca/");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		
	}
	
	public static ChangeTab changeTab() {
		return Tasks.instrumented(ChangeTab.class);
	}

}
