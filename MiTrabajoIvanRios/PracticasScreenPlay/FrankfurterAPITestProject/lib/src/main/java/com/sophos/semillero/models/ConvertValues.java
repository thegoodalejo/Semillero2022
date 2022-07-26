package com.sophos.semillero.models;

public class ConvertValues {
	private String quantity;
	private String divisa;
	
	public ConvertValues(String divisa, String quantity) {
		this.quantity = quantity;
		this.divisa = divisa;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getDivisa() {
		return divisa;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}
	
	
	
}
