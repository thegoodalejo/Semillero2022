package com.personal.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue= {"com.personal.stepdefinitions"},
		features = {"src/test/resources/com/personal/features/login.feature"},
		snippets = SnippetType.CAMELCASE
		)
public class LoginTest {

}
