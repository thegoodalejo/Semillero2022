package app.services;

import app.model.Pedido;

public abstract class Etapa {
	Pedido pedido;
	Consumible consumible;
	
	public Etapa (Pedido pedido, Consumible consumible) {
		this.consumible = consumible;
		this.pedido = pedido;
	}
	
	public abstract void consutarDisponibilidad(Consumible consumible);
	public abstract Pedido  realizarProceso(Consumible consumible);

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}



}
