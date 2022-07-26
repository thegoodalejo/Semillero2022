package com.sophos.semillero.hooks;

import java.util.Map;

import com.sophos.semillero.models.ConvertValues;

import io.cucumber.java.DataTableType;

public class ConvertValuesConfig {
	
	@DataTableType
	public ConvertValues transformTo(Map<String,String> entry) {
		return new ConvertValues(entry.get("divisa"),String.valueOf(entry.get("quantity")));
	}

}
