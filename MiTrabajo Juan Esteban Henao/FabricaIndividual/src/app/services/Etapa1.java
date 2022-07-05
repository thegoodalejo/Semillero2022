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
	public void realizarProceso(Consumible consumible) {
		Nevera.sacarAlimento(consumible);
		
	}

	@Override
	public void consutarDisponibilidad(Consumible consumible) {
		if(Nevera.consultarDispobilidad(consumible)) {
			realizarProceso(consumible);
		}else {
			Nevera.abastecer(consumible);
		}
		
	}

}
