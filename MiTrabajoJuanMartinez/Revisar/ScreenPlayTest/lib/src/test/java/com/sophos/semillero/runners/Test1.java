package com.sophos.semillero.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		glue= {"com.sophos.semillero.stepdefinitions"},
		features= {"src/test/resources/com/sophos/semillero/features/test1.feature"})
public class Test1 {

}
