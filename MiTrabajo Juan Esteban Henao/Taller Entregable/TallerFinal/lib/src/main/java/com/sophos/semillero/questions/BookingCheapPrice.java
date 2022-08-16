package com.sophos.semillero.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.sophos.semillero.userinterfaces.BookingPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;

public class BookingCheapPrice implements Question<String> {
	

	@Override
	public String answeredBy(Actor actor) {
		ArrayList<Integer> precios = new ArrayList<Integer>();
		ArrayList<String> preciosNum = new ArrayList<String>();
		List<WebElementFacade> listaSitios = BookingPage.PRICES.resolveAllFor(actor);
		for (WebElementFacade sitio : listaSitios) {
				preciosNum.add(sitio.getText().replace(".", ""));
		}
		for (String precio : preciosNum) {
			precios.add(Integer.parseInt(precio.replace("COP ", "")));
		}
		for (Integer precio : precios) {
			System.out.println(precio);
		}
		Collections.sort(precios);
		System.out.println("El precio menor es: "+precios.get(0));
		return precios.get(0)+"";
	}
	
	public static BookingCheapPrice cheapPrice() {
		return new BookingCheapPrice();

	}

}
