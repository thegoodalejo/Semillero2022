package Fibonacci;

import java.util.Scanner;

public class SecuenciaFibonacci {

	public static void main(String[] args) {

		Scanner tamano = new Scanner(System.in);

		System.out.println("Ingrese el tamano de la secuencia: ");

		int n = tamano.nextInt();
		int n1 = 1;
		int n2 = 0;

		for (int i = 1; i <= n; i++) {

			n2 = n1 + n2;
			n1 = n2 - n1;
			System.out.print("[" + n2 + "] ");
		}

	}

}
