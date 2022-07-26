
package com.falabella.loyalty.restinteractions;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import com.falabella.loyalty.models.BodyGetCustomerKey;
import com.falabella.loyalty.models.Document;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

public class RestInteraction {

	private static String baseUrl;

	public static void setBaseUrl(String baseUrl) {

		RestInteraction.baseUrl = baseUrl;
	}

	public static void excecutePost(Map<String, String> infoUsuario) {
		String bodyRequest = "{\r\n"
				+ "    \"document\": {\r\n"
				+ "        \"issuingCountry\": \"PAIS\",\r\n"
				+ "        \"documentType\": \"TIPODOCUMENTO\",\r\n"
				+ "        \"documentNumber\": \"DOCUMENTO\"\r\n"
				+ "    }\r\n"
				+ "}";

		BodyGetCustomerKey data = new BodyGetCustomerKey();
		Document document = new Document();

		document.setIssuingCountry(infoUsuario.get("issuingCountry"));
		document.setDocumentType(infoUsuario.get("documentType"));
		document.setDocumentNumber(infoUsuario.get("documentNumber"));
		data.setDocument(document);

		bodyRequest = bodyRequest.replace("PAIS", infoUsuario.get("issuingCountry")).replace("TIPODOCUMENTO", infoUsuario.get("documentType"))
				.replace("DOCUMENTO", infoUsuario.get("documentNumber"));

		System.out.println("body String: " + bodyRequest);
		
		System.out.println("body clase : " + data);
		
		//serializado con String Replace
		//SerenityRest.given().contentType(ContentType.JSON).when().body(bodyRequest).post(baseUrl);
		
		//serializado con clases
		SerenityRest.given().contentType(ContentType.JSON).when().body(data).post(baseUrl);
		
		SerenityRest.lastResponse().prettyPeek();
	}
	public static void validateResponse(String status, String pathStatus) {
		String responseStatus = SerenityRest.lastResponse().jsonPath().getString(pathStatus);
		System.out.println("El status del response es ----->"+responseStatus);
		assertEquals(status, responseStatus);
	}

}
