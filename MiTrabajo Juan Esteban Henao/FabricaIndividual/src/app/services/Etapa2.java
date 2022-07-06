package app.services;

import app.model.Nevera;
import app.model.Pedido;

public class Etapa2 extends Etapa {

	public Etapa2(Pedido pedido, Consumible fuerte) {
		super(pedido, fuerte);
		consutarDisponibilidad(fuerte);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pedido realizarProceso(Consumible consumible) {
		Nevera.sacarAlimento(consumible);
		System.out.println("Iniciando la preparación del plato fuerte " + consumible.getClass().getSimpleName());
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
