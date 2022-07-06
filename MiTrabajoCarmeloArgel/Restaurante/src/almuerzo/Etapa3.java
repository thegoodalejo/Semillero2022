package almuerzo;

import java.util.Scanner;

public class Etapa3 extends Preparacion {

	int menu3;
	String ensalada;
	
	public void eleccionMenu3() {

		Scanner eleccion = new Scanner(System.in);
			System.out.println("\nElige la ensalada que deseas:");
			System.out.println(" - Digita [1] para ensalada de Atun con aguacate");
			System.out.println(" - Digita [2] para ensalada de Lechuga, Tomate y cebolla");
			System.out.println("Ingresa tu eleccion: ");
			menu3 = eleccion.nextInt();
	}
	
	public void eleccionEnsalada() {
			
			switch (menu3) {
			case 1:
				ensalada = "Atun con Aguacate";
				break;
			case 2:
				ensalada = "Lechuga, Tomate y cebolla";
				break;
			default:
				System.out.println("Opción no valida");
		}
	}

	@Override
	public void resumenAlmuerzo() {
		System.out.println("- "+ensalada+", como ensalada");
	}
}
