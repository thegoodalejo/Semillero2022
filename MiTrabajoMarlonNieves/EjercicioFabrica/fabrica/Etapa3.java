package fabrica;

import java.util.Scanner;

public class Etapa3 {

	public static String iniciarEtapaDetalles() {
		System.out.println("\nIniciando Etapa 3");
		Scanner eleccion = new Scanner(System.in);
		int opcion = 0;
		String temperatura = "";

		do {
			System.out.println("\nElige tu temperatura:");
			System.out.println(" - Digita 1 para Tibio");
			System.out.println(" - Digita 2 para Caliente");
			System.out.println("Ingresa tu eleccion: ");
			opcion = eleccion.nextInt();
			switch (opcion) {
			case 1:
				temperatura = "Tibio";
				break;
			case 2:
				temperatura = "Caliente";
				break;
			default:
			}
		} while (opcion < 0 && opcion > 2);

		return temperatura;
	}
	

//	public static void seleccionTemperaturaArepa(int temperatura, Arepa arepa3) {
////		arepa3.setTemperatura(temperatura);
//		switch (temperatura) {
//		case 1:
//			arepa3.setTemperatura("Tibio");
//			break;
//		case 2:
//			arepa3.setTemperatura("Caliente");
//			break;
//		default:
//			System.out.println("ELija una opcion valida");
//			break;
//		}

	}


