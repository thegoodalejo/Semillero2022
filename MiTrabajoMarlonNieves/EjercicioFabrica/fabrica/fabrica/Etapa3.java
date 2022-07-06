package fabrica;

import java.util.Scanner;

public class Etapa3 extends Preparacion {

	public Arepa iniciarEtapaDetalles(Arepa arepa3) {
		Scanner eleccion = new Scanner(System.in);
		int color;
		int opcion=0;

		do {
		System.out.println("\nElige tu temperatura:");
		System.out.println(" - Digita 1 para Tibio");
		System.out.println(" - Digita 2 para Caliente");
		System.out.println("Ingresa tu eleccion: ");
		color = eleccion.nextInt();
		
		if(color>1 && color<2) {
			opcion=1;
			switch(color) {
		    case 1:
			     arepa3.setTemperatura("Tibio");
			break;
		    case 2:
			     arepa3.setTemperatura("Caliente");
			break;
			default:
		}

	   }else {
			System.out.println("Eliga una opcion valida");
		}

	  }while(opcion!=1);
		
	return arepa3;
	}

	@Override
	public void iniciarEtapa() {
		
	}

}
