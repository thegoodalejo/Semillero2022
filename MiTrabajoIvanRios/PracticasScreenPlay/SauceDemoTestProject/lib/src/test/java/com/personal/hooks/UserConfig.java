package com.personal.hooks;

import java.util.Map;

import com.personal.models.UserInformation;

import io.cucumber.java.DataTableType;

public class UserConfig {
	
	@DataTableType
	public UserInformation transformTo(Map<String,String> entry) {
		return new UserInformation(entry.get("name"),entry.get("lastname"),entry.get("zipcode"));
	}

}
