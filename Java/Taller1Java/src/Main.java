import java.util.*;

/*Cree un Array de enteros con los números 5,7,2,4,1 (en ese orden)
Usando condicionales y ciclos organice de mayor a menor (mostrar por consola), Usando condicionales y ciclos organice de menor a mayor (mostrar por consola)
Investigue las Torres de Hanoi, cree un algoritmo que pueda resolverlo (mostrar el paso a paso por consola) si estuviéramos jugando con 4 discos*/

public class Main {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		
		int[] numbers = { 5, 7, 2, 4, 1 };
		int opcion = 0;

		do {

			System.out.println("***MENU PRINCIPAL***");
			System.out.println("1. Ordenar de menor a mayor");
			System.out.println("2. Ordenar de mayor a menor");
			System.out.println("3. Torres de Hanoi");
			System.out.println("0. Salir");

			System.out.print("Ingrese una opcion: ");
			opcion = tc.nextInt();

			switch (opcion) {
			case 1:
				sortArrayAsc(numbers);
				break;

			case 2:
				sortArrayDesc(numbers);
				break;
			case 3:
				// TODO
				break;
			case 0:
				System.out.print("Saliendo...!");
				break;
			}
		} while (opcion != 0);

	}

	/* Metodo para ordenar el arreglo de menor a mayor */
	static void sortArrayAsc(int[] numbers) {

		int band = 0;
		// Se imprime el arreglo desordenado
		System.out.println("Arreglo Desordenado");
		for (int x : numbers) {
			System.out.print("[" + x + "]");
		}
		System.out.println("");
		System.out.println("****************************");

		// se ordena el arreglo de menor a mayor
		for (int a = 0; a < numbers.length - 1; a++) {
			for (int b = 0; b < numbers.length - 1; b++) {
				if (numbers[b] > numbers[b + 1]) {

					band = numbers[b];
					numbers[b] = numbers[b + 1];
					numbers[b + 1] = band;
				}
			}
		}

		System.out.println("Arreglo Ordenado ASC");
		for (int x : numbers) {
			System.out.print("[" + x + "]");
		}
		System.out.println("");
		System.out.println("****************************");
	}

	/* Metodo para ordenar el arreglo de mayor a menor */
	static void sortArrayDesc(int[] numbers) {
		int band = 0;
		// Se imprime el arreglo desordenado
		System.out.println("Arreglo Desordenado");
		for (int x : numbers) {
			System.out.print("[" + x + "]");
		}
		System.out.println("");
		System.out.println("****************************");

		for (int a = 0; a < numbers.length - 1; a++) {
			for (int b = numbers.length - 1; b > 0; b--) {
				if (numbers[b] > numbers[b - 1]) {

					band = numbers[b];
					numbers[b] = numbers[b - 1];
					numbers[b - 1] = band;
				}
			}
		}

		System.out.println("Arreglo Ordenado DESC");
		for (int x : numbers) {
			System.out.print("[" + x + "]");
		}
		System.out.println("");
		System.out.println("****************************");

	}
}
