package com.sophos.banistmo.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue= {"com.sophos.banistmo.stepdefinitions"},
        features= {"src/test/resources/com/sophos/banistmo/features/validatepdfbanistmo.feature"}
        , snippets = SnippetType.CAMELCASE)
public class BanistmoTest {

}
