package com.sophos.semillero.hooks;

import java.util.Map;

import com.sophos.semillero.models.Customer;

import io.cucumber.java.DataTableType;

public class CustomerConfig {
	
	@DataTableType
	public Customer transformTo(Map<String, String> entry) {
		return new Customer(entry.get("firstName"), entry.get("lastName"), entry.get("zipCode"));
	}

}
