package fabrica;

import java.util.Scanner;

public class Etapa1 extends Preparacion {

	String tipo;

	public int iniciarEtapaTipo(Arepa arepa1) {
		Scanner eleccion = new Scanner(System.in);
		int tipoArepa;
		int opcion = 0;

		do {
			System.out.println("\nElige tu tipo de arepa preferido:");
			System.out.println(" - Digita 1 para  Mixta");
			System.out.println(" - Digita 2 para Especial");
			System.out.println("Ingresa tu eleccion: ");
			tipoArepa = eleccion.nextInt();

			if (tipoArepa > 0 && tipoArepa <= Preparacion.MAX_TIPOS) {
				opcion = 1;
			} else {
				System.out.println("Eliga una opcion valida");
			}

		} while (opcion != 1);

		return tipoArepa;

	}

	@Override
	public void iniciarEtapa() {

	}

}
