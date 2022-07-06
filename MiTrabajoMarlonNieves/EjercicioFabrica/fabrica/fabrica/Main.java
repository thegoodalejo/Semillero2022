package fabrica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opcion1;
		int opcion = 0;
		int tamano;
		int tamanoArepa;
		boolean continuar = false;
		Scanner eleccion = new Scanner(System.in);

		
		Etapa1 etapa1 = new Etapa1();
		Etapa2 etapa2 = new Etapa2();
		Etapa3 etapa3 = new Etapa3();

		do {
			System.out.println("\nElige el tamaño de  tu Arepa: ");
			System.out.println(" - Digita 1 para  Pequeña");
			System.out.println(" - Digita 2 para Grande");
			System.out.println("Ingresa tu eleccion: ");
			tamano = eleccion.nextInt();

			if (tamano >1 && tamano <= 2) {
				opcion = 1;
			} else {
				System.out.println("Eliga un tamaño entre pequeño o grande");
			}
		} while (opcion != 1);

		
		Arepa Arepa1 = new Arepa();

		
		opcion1 = etapa1.iniciarEtapaTipo(arepa1);

		switch (opcion1) {
		case 1:
			mixta1.settipoArepa("Mixta");
			arepa1 = etapa2.iniciarEtapaMixta(mixta1);
			arepa1 = etapa3.iniciarEtapaDetalles(arepa1);

			// Resumen
			System.out.println(arepa1.toString());

			break;
		case 2:
			especial1.settipoArepa("Especial");
			arepa1 = etapa2.iniciarEtapaEspecial(especial1);
			arepa1 = etapa3.iniciarEtapaDetalles(especial1);
			System.out.println(especial1.toString());
			break;
		default:
		}

	}

}
