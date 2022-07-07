package fabrica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner eleccion = new Scanner(System.in);
		int opcion = 0;
		int tamano;
		boolean continuar = false;

		Arepa arepa1 = new Arepa();
		Arepa arepa3 = new Arepa();
		do {
			System.out.println("\nElige el tamano que quieras para tu arepa: ");
			System.out.println(" - Digita 1 para arepa mediana");
			System.out.println(" - Digita 2 para arepa grande");
			tamano = eleccion.nextInt();
			continuar = false;
			switch (tamano) {
			case 1:
				seleccionTamanoArepa(tamano, arepa1);
				break;
			case 2:
				seleccionTamanoArepa(tamano, arepa1);
				break;
			default:
				continuar = true;
				System.out.println("Eliga una opcioin valida");
			}
		} while (opcion != 1);

	}

	public static void seleccionTamanoArepa(int tamano, Arepa arepa1) {
		arepa1.setTamano(tamano);
		Etapa1.iniciarEtapaTipo(arepa1);
		Etapa3.seleccionTemperaturaArepa(tamano, arepa1);
	}
	


}
