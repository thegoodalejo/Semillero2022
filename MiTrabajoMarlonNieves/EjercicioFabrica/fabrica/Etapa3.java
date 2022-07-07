package fabrica;

import java.util.Scanner;

public class Etapa3 extends Preparacion {
	@Override
	public void iniciarEtapa() {

	}

	public static int iniciarEtapaDetalles(Arepa arepa) {
		System.out.println("\nIniciando Etapa 3");
		Scanner eleccion = new Scanner(System.in);
		int temperatura;
		int opcion = 0;
		boolean continuar = false;
		
		Arepa arepa3 = new Arepa();

		do {
			System.out.println("\nElige tu temperatura:");
			System.out.println(" - Digita 1 para Tibio");
			System.out.println(" - Digita 2 para Caliente");
			System.out.println("Ingresa tu eleccion: ");
			temperatura = eleccion.nextInt();

			continuar = false;
			switch (temperatura) { 
			case 1:
				seleccionTemperaturaArepa(temperatura, arepa3);
				break;
			case 2:
				seleccionTemperaturaArepa(temperatura, arepa3);
				break;
			default:
				continuar = true;
				System.out.println("ELija una opcion valida");
				break;
			}

		} while (continuar);

		return temperatura;
	}
	public static void seleccionTemperaturaArepa(int temperatura, Arepa arepa3) {
//		arepa3.setTemperatura(temperatura);
		Etapa3.iniciarEtapaDetalles(arepa3);
		
	}
	
}
