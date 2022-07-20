package com.sophos.semillero.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue= {"com.sophos.semillero.stepdefinitions"},
        features= {"src/test/resources/com/sophos/semillero/features/search_tours_php_travels.feature"},
        snippets = SnippetType.CAMELCASE )

public class SearchToursTest {

}
