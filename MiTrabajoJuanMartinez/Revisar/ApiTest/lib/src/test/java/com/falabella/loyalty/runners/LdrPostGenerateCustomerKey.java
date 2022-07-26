package com.falabella.loyalty.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue = { "com.falabella.loyalty.stepdefinitions" }, 
		features = {"src/test/resources/com/falabella/loyalty/features/ldr_post_generate_customer_key.feature" }, 
		snippets = SnippetType.CAMELCASE
		)
public class LdrPostGenerateCustomerKey {
	
}
