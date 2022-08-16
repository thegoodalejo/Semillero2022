package com.sophos.banistmo.task;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import com.assertthat.selenium_shutterbug.utils.web.Browser;
import com.sophos.banistmo.interactions.ChangeTab;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.reports.WithTitle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebDriverQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.DriverOptions;

public class BanistmoValidatePDF implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		WebDriver driver = BrowseTheWeb.as(actor).getDriver();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		String url = driver.getCurrentUrl();
		if (url.contains("PJ+Autocertificacion+unificado-+Fatca+y+CRS.pdf")) {
			System.out.println("PDF es valido");
		}
	}

	public static BanistmoValidatePDF validatePDF() {
		return Tasks.instrumented(BanistmoValidatePDF.class);
	}

}
