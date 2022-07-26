package com.sophos.semillero.stepdefinitions;

import com.sophos.semillero.apis.FrankfurterApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FrankfurterPostConvertEurosToAnotherDivisaValueStepDefinition {
	
	@When("send the quantity and divisa value to convert and {string} endpoint")
	public void sendTheQuantityAndDivisaValueToConvert(String endPoint, DataTable dataTable) {
	    FrankfurterApi.executePostConvertEuros(dataTable, endPoint);
	    
	}

	@Then("can convert euros to another divisa value")
	public void canConvertEurosToAnotherDivisaValue() {
	   FrankfurterApi.printPostConvertEuros();
	}

}
