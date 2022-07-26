package com.falabella.loyalty.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = { "com.falabella.loyalty.stepdefinitions" }, 
		features = {"src/test/resources/com/falabella/loyalty/features/ldr_get_customer_by_key.feature" }, 
		snippets = SnippetType.CAMELCASE
		)
public class LdrGetCustomerByKey {

}
