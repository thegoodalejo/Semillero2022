package fibonacci;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		// Variables
		int opcion;
		float num1;
		float num2;

		// Ingresar datos por pantalla
		Scanner tc = new Scanner(System.in);
		System.out.println("CALCULADORA");
		System.out.println("Menu de Opciones / Que opcion va a elegir?:");
		System.out.println("(1)Sumar");
		System.out.println("(2)Restar");
		System.out.println("(3)Multiplicar");
		System.out.println("(4)Dividir");
		System.out.println("(5)Salir");

		opcion = Integer.parseInt(tc.nextLine());

		while (opcion > 0 && opcion <= 5) {
			if (opcion == 1) {
				System.out.print("Ingrese el primer numero: ");
				num1 = Integer.parseInt(tc.next());
				;
				System.out.print("Ingrese el segundo numero: ");
				num2 = Integer.parseInt(tc.next());
				System.out.print("La suma es: " + (num1 + num2));
				System.out.print("\n\nElija una opcion: ");
				opcion = Integer.parseInt(tc.next());
			} else if (opcion == 2) {
				System.out.print("Ingrese el primer numero: ");
				num1 = Integer.parseInt(tc.next());
				System.out.print("Ingrese el segundo numero: ");
				num2 = Integer.parseInt(tc.next());
				System.out.print("La resta es: " + (num1 - num2));
				System.out.print("\n\nElija una opcion: ");
				opcion = Integer.parseInt(tc.next());
			} else if (opcion == 3) {
				System.out.print("Ingrese el primer numero: ");
				num1 = Integer.parseInt(tc.next());
				System.out.print("Ingrese el segundo numero: ");
				num2 = Integer.parseInt(tc.next());
				System.out.print("La multiplicacion es: " + (num1 * num2));
				System.out.print("\n\nElija una opcion: ");
				opcion = Integer.parseInt(tc.next());
			} else if (opcion == 4) {
				System.out.print("Ingrese el primer numero: ");
				num1 = Integer.parseInt(tc.next());
				System.out.print("Ingrese el segundo numero: ");
				num2 = Integer.parseInt(tc.next());
				System.out.print("La division es: " + (num1 / num2));
				System.out.print("\n\nElija una opcion: ");
				opcion = Integer.parseInt(tc.next());
			}

			else if (opcion == 5) {
				System.exit(0);
			}
		}
	}
}

