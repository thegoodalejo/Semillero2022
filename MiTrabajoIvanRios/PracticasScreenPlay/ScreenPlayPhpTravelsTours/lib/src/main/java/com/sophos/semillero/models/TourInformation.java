package com.sophos.semillero.models;

public class TourInformation {
	
	private String destination;
	private String date;
	private String adultsQuantity;
	private String childrenQuantity;
	public TourInformation(String destination, String date, String adultsQuantity, String childrenQuantity) {
		this.destination = destination;
		this.date = date;
		this.adultsQuantity = adultsQuantity;
		this.childrenQuantity = childrenQuantity;
	}
	
	public String getDestination() {
		return destination;
	}
	public String getDate() {
		return date;
	}
	public String getAdultsQuantity() {
		return adultsQuantity;
	}
	public String getChildrenQuantity() {
		return childrenQuantity;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setAdultsQuantity(String adultsQuantity) {
		this.adultsQuantity = adultsQuantity;
	}
	public void setChildrenQuantity(String childrenQuantity) {
		this.childrenQuantity = childrenQuantity;
	}
	
	
	
	
	

}
