package app.services;

import app.model.Nevera;
import app.model.Pedido;

public class Etapa3 extends Etapa {

	public Etapa3(Pedido pedido, Consumible consumible) {
		super(pedido, consumible);
		consutarDisponibilidad(consumible);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pedido realizarProceso(Consumible consumible) {
		Nevera.sacarAlimento(consumible);
		System.out.println("Iniciando la preparación de la bebida " + consumible.getClass().getSimpleName());
		pedido.agregarConsumible(consumible);
		return pedido;
	}

	@Override
	public void consutarDisponibilidad(Consumible consumible) {
		if(Nevera.consultarDispobilidad(consumible)) {
			realizarProceso(consumible);
		}else {
			System.out.println("No se cuenta con mas productos disponibles, se procede a abastecer");
			Nevera.abastecer(consumible);
		}
	}

}
