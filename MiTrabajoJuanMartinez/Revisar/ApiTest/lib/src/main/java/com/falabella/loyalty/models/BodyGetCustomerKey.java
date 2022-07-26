package com.falabella.loyalty.models;

public class BodyGetCustomerKey {
	private Document document;

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	@Override
	public String toString() {
		String body;
		body=document.getIssuingCountry()+" "+document.getDocumentType()+" "+ document.getDocumentNumber();
		return body;
	}
	
	
}
