package app.services;

import java.util.ArrayList;

public abstract class Bebida extends Consumible{
	private String cantidadAzucar;
	
	public Bebida (String cantidadAazucar, int precio) {
		super(precio);
		this.cantidadAzucar= cantidadAazucar;
		
	}

	public String getCantidadAzucar() {
		return cantidadAzucar;
	}

	public void setCantidadAzucar(String cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}



}
