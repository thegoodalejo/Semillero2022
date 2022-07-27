package com.sophos.semillero.stepdefinitions;

import java.util.Map;

import com.sophos.semillero.apis.JPetStoreApi;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class JPetStoreGetCatalogStepDefinition {

	@When("we send application information {string}, por referencia {string}")
	public void weSendApplicationInformationPorReferencia(String endPoint, String referencia) {
		JPetStoreApi.executeGetNoToken(endPoint, referencia);
	}
//	@When("we send application information {string}, por referencia {string}")
//	public void weSendApplicationInformationPorReferencia(String endPoint, String referencia, DataTable info) {
//	//	JPetStoreApi.executeGetNoToken(endPoint, referencia);
//		Map<String, String>mapaInfo =info.asMap(String.class, String.class);
//		System.out.println(mapaInfo.get("category") +" "+ mapaInfo.get("color") +" "+ mapaInfo.get("category") );
//	}
//	@When("we send application information {string}, por referencia DOGS")
//	public void weSendApplicationInformationPorReferenciaDOGS(String endPoint) {
//		JPetStoreApi.executeGetNoToken(endPoint, "DOGS");
//	}
//
//	@When("we send application information {string}, por referencia FISH")
//	public void weSendApplicationInformationPorReferenciaFISH(String endPoint) {
//		JPetStoreApi.executeGetNoToken(endPoint, "FISH");
//	}
//
//	@When("we send application information {string}, por referencia CATS")
//	public void weSendApplicationInformationPorReferenciaCATS(String endPoint) {
//		JPetStoreApi.executeGetNoToken(endPoint, "CATS");
//	}
}
