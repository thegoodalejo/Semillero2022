package fabrica;

import java.util.Scanner;

public class Etapa2 {

	public static String iniciarEtapaMixta() {

		System.out.println("\nIniciando Etapa 2");
		Scanner eleccion = new Scanner(System.in);

		int ingredientes = 0;
		String ingrediente = "";

		do {
			System.out.println("\nElige los ingredintes para tu Arepa: ");
			System.out.println(" - Digita 1 para  Carne");
			System.out.println(" - Digita 2 para Pollo");
			System.out.println("Ingresa tu eleccion: ");
			ingredientes = eleccion.nextInt();

			// Arepa Mixta
//			if (ingredientes > 0 && ingredientes <= 2) {
//				opcion = 1;
//			} else {
//				System.out.println("Eliga una opcioin valida");
//			}
//
//			if (ingredientes == 1) {
//				mixta.setIngredientes("carne");
//			} else {
//				mixta.setIngredientes("Pollo");
//			}

			switch (ingredientes) {
			case 1:
				ingrediente = "Carne";
				break;
			case 2:
				ingrediente = "Pollo";
				break;
			}

		} while (ingredientes < 0 && ingredientes > 2);

		return ingrediente;
	}

	// Arepa especial
	public static String iniciarEtapaVegetariana() {

		System.out.println("\nIniciando Etapa 2");
		Scanner eleccion = new Scanner(System.in);
		int ingredientes = 0;
		String ingrediente = "";

		do {
			System.out.println("\nElige los ingredintes para tu Arepa: ");
			System.out.println(" - Digita 1 para Tofu");
			System.out.println(" - Digita 2 para Carne de arbeja");
			System.out.println("Ingresa tu eleccion: ");
			ingredientes = eleccion.nextInt();

			switch (ingredientes) {
			case 1:
				ingrediente = "Tofu";
				break;
			case 2:
				ingrediente = "Carne de arbeja";
				break;
			}
		} while (ingredientes < 0 && ingredientes > 2);

		return ingrediente;
	}


}
