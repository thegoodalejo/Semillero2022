package Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner numero1 = new Scanner(System.in);

		System.out.println("Elija el tipo de operacion que desea realizar:");
		System.out.println(
				"Digite:" + "\n1 ----> Suma" + "\n2 ----> Resta" + "\n3 ----> Multiplicacion" + "\n4 ----> Division");
		String op = numero1.nextLine();
		System.out.print("\nIngrese un numero: ");
		String a = numero1.nextLine();
		System.out.print("\nIngrese otro numero: ");
		String b = numero1.nextLine();

		switch (op) {
		case "1":
			int suma = Integer.parseInt(a) + Integer.parseInt(b);
			System.out.println("\nLa suma es: " + suma);
			break;

		case "2":
			int resta = Integer.parseInt(a) - Integer.parseInt(b);
			System.out.println("\nLa resta es: " + resta);
			break;

		case "3":
			int mult = Integer.parseInt(a) * Integer.parseInt(b);
			System.out.println("\nEl producto es: " + mult);
			break;

		case "4":
			double div = Double.parseDouble(a) / Double.parseDouble(b);
			System.out.println("\nLa division es: " + div);
			break;

		default:
			System.out.println("Error: No existe una operacion asignada al numero ingresado");
		}

	}
}
