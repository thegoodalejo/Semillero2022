package app.model;

import java.util.ArrayList;

import app.services.Consumible;

public class Pedido {

	private ArrayList<Consumible> comida;
	
	public Pedido() {
		comida = new ArrayList<Consumible>();
	}

	public void agregarConsumible(Consumible consumible) {
		comida.add(consumible);
		
	}

	public ArrayList<Consumible> getComida() {
		return comida;
	}

	public void setComida(ArrayList<Consumible> comida) {
		this.comida = comida;
	}
}
