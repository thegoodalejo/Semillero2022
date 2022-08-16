package com.sophos.semillero.questions;

import static com.sophos.semillero.userinterfaces.BookingPage.PRICES;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class BookingCheapPrice implements Question<String> {
	ArrayList<Integer> precios = new ArrayList<Integer>();
	ArrayList<String> preciosNum = new ArrayList<String>();

	@Override
	public String answeredBy(Actor actor) {
		//Obtengo la lista de todos los precios de los hoteles validos
		List<WebElementFacade> listaSitios = PRICES.resolveAllFor(actor);
		
		//Se hace la conversion del formato de dinero para manejarlo como numero
		for (WebElementFacade sitio : listaSitios) {
				preciosNum.add(sitio.getText().replace(".", ""));
		}
		for (String precio : preciosNum) {
			precios.add(Integer.parseInt(precio.replace("COP ", "")));
		}
		
		//Ordenos los precios de menor a mayor
		Collections.sort(precios);
		
		//Imprimo y respondo con el precio menor
		System.out.println("El precio menor es: "+precios.get(0));
		return precios.get(0)+"";
	}
	
	public static BookingCheapPrice cheapPrice() {
		return new BookingCheapPrice();

	}

}
