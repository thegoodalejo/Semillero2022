package fabrica;

import java.util.Scanner;

public class Etapa2 extends Preparacion {

	public static Arepa iniciarEtapaMixta(Arepa mixta) {

		System.out.println("\nIniciando Etapa 2");
		Scanner eleccion = new Scanner(System.in);
		Arepa arepa;
		int ingredientes = 0;
		int opcion = 0;

		do {
			System.out.println("\nElige los ingredintes para tu Arepa: ");
			System.out.println(" - Digita 1 para  Carne");
			System.out.println(" - Digita 2 para Pollo");
			System.out.println("Ingresa tu eleccion: ");
			ingredientes = eleccion.nextInt();

			// Arepa Mixta
			if (ingredientes > 0 && ingredientes <= 2) {
				opcion = 1;
			} else {
				System.out.println("Eliga una opcioin valida");
			}

			if (ingredientes == 1) {
				mixta.setIngredientes("carne");
			} else {
				mixta.setIngredientes("Pollo");
			}

		} while (opcion != 1);

		return mixta;
	}

	// Arepa especial
	public static Arepa iniciarEtapaEspecial(Arepa especial) {

		System.out.println("\nIniciando Etapa 2");
		Scanner eleccion = new Scanner(System.in);
		int ingredientes = 0;
		int opcion = 0;

		do {
			System.out.println("\nElige los ingredintes para tu Arepa: ");
			System.out.println(" - Digita 1 para Pollo");
			System.out.println(" - Digita 2 para Carne");
			System.out.println(" - Digita 3 para Chicharron");
			System.out.println("Ingresa tu eleccion: ");
			ingredientes = eleccion.nextInt();

			if (ingredientes > 0 && ingredientes < 4) {
				opcion = 1;
				if (ingredientes == 1) {
					especial.setIngredientes("Pollo");
				} else if (ingredientes == 2) {
					especial.setIngredientes("Carne");
				} else {
					especial.setIngredientes("chicharron");
				}
			} else {
				System.out.println("Eliga una opcioin valida");
			}
		} while (opcion != 1);

		return especial;
	}

	@Override
	public void iniciarEtapa() {

	}
	

}
