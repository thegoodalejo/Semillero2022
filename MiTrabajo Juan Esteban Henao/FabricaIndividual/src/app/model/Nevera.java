package app.model;

import java.util.ArrayList;
import java.util.Iterator;

import app.services.Consumible;

public class Nevera {

	static ArrayList<Consumible> listaConsumiblesTotales = new ArrayList<Consumible>();
	
	
	public static void sacarAlimento(Consumible consumible) {
		for (int i = 0; i < listaConsumiblesTotales.size(); i++) {
			if(listaConsumiblesTotales.get(i).getClass().getName().equals(consumible.getClass().getName())) {
				listaConsumiblesTotales.get(i).disminuirCantidad();
		}
		}
	}
	
	public static void abastecer(Consumible consumible) {
		
	}
	
	public static Boolean consultarDispobilidad(Consumible consumible) {
		for (int i = 0; i < listaConsumiblesTotales.size(); i++) {
			if(listaConsumiblesTotales.get(i).getClass().getName().equals(consumible.getClass().getName())
					 && listaConsumiblesTotales.get(i).getCantidad()>0) {
				return true;
				
			}else {
				return false;
			}
		}
		return false;
	}
	
	
	
}
