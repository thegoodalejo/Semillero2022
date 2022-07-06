package app.services;

import app.model.Nevera;
import app.model.Pedido;

public class Etapa1 extends Etapa {
	
	

	public Etapa1(Pedido pedido, Consumible entrada) {
		super(pedido, entrada);
		consutarDisponibilidad(entrada);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Pedido realizarProceso(Consumible consumible) {
		Nevera.sacarAlimento(consumible);
		System.out.println("Iniciando la preparación de la entrada " + consumible.getClass().getSimpleName());
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
