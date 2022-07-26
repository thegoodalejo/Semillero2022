package com.sophos.semillero.runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue= {"com.sophos.semillero.stepdefinitions","com.sophos.semillero.hooks"},
		features = {"src/test/resources/com/sophos/semillero/features/frankfurter_post_convert_euros_to_another_divisa_value.feature"},
		snippets = SnippetType.CAMELCASE
		)

public class FrankfurterPostConvertEurosToAnotherDivisaValueTest {

}
