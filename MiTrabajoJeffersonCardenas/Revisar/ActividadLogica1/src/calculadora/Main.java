package calculadora;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		int opcion = 0;
		int numero1 = 0;
		int numero2 = 0;

		do {
			System.out.println("***CALCULADORA***");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("0. Salir");
			System.out.print("Seleccione: ");
			opcion = (int) tc.nextInt();

			if (opcion != 0) {
				System.out.print("Ingrese el numero 1: ");
				numero1 = (int) tc.nextInt();

				System.out.print("Ingrese el numero 2: ");
				numero2 = (int) tc.nextInt();

				System.out.println("***************************");
				System.out.println("Resultado: " + calcular(numero1, numero2, opcion));
				System.out.println("***************************");
			}

		} while (opcion != 0);

	}

	public static double calcular(int numero1, int numero2, int opcion) {

		double resultado = 0;

		switch (opcion) {
		case 1:
			resultado = numero1 + numero2;
			break;

		case 2:
			resultado = numero1 - numero2;
			break;

		case 3:
			resultado = numero1 * numero2;
			break;

		case 4:
			if (numero2 != 0) {
				resultado = numero1 / numero2;
			} else {
				System.out.println("No se puede dividir por 0...!");
			}
			break;
		}

		return resultado;
	}

}
