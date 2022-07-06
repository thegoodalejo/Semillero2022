package almuerzo;

import java.util.Scanner;

public class Etapa2 extends Preparacion {

	int menu2;
	String carbohidrato;
	
	public void eleccionMenu2() {

		Scanner eleccion = new Scanner(System.in);
			System.out.println("\nElige el acompañante preferido:");
			System.out.println(" - Digita [1] para acompañar con porcion de Patacones");
			System.out.println(" - Digita [2] para acompañar con porcion Papas a la francesa");
			System.out.println(" - Digita [3] para acompañar con porcion de Papa cocida");
			System.out.println("Ingresa tu eleccion: ");
			menu2 = eleccion.nextInt();
	}
	
	public void eleccionProteina() {
			
			switch (menu2) {
			case 1:
				carbohidrato = "porcion de patacones";
				break;
			case 2:
				carbohidrato = "porcion de papas a la francesa";
				break;
			case 3:
				carbohidrato = "porcion de papa cocida";
				break;
			default:
				System.out.println("Opción no valida");
			
		}
	}

	@Override
	public void resumenAlmuerzo() {
		System.out.println("- "+carbohidrato+", como acompañante");
		
	}
}
