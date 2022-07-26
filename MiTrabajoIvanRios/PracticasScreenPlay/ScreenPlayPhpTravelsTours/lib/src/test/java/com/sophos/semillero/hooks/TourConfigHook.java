package com.sophos.semillero.hooks;

import java.util.Map;

import com.sophos.semillero.models.TourInformation;

import io.cucumber.java.DataTableType;

public class TourConfigHook {

	@DataTableType
	public TourInformation transformTo(Map<String,String> entry) {
		return new TourInformation(entry.get("destination"),entry.get("date"),entry.get("adults"),entry.get("child"));
	}
	
}
