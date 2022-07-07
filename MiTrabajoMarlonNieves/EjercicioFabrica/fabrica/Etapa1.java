package fabrica;

import java.util.Scanner;

public class Etapa1 extends Preparacion {
	
	@Override
	public void iniciarEtapa() {

	}

	public static String iniciarEtapaTipo() {
		System.out.println("\nIniciando Etapa 1");
		Scanner tc = new Scanner(System.in);
		String tipo = "";
		int tipoArepa;
		boolean continuar = false;
		do {
			System.out.println("\nElige tu tipo de arepa preferido: ");
			System.out.println(" - Digita 1 para Arepa  Mixta");
			System.out.println(" - Digita 2 para Arepa Especial");
			System.out.println("Ingresa tu eleccion: ");
			tipoArepa = tc.nextInt();

			continuar = false;
			switch (tipoArepa) {
			case 1:
				tipo = "Mixta";
				break;
			case 2:
				tipo = "Especial";
				break;
			default:
				continuar = true;
				System.out.println("Eliga una opcion valida");
				break;
			}
		} while (continuar);

		return tipo;

	}
}
