package fibonacci;

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]) {
		int num1, num2;
		Scanner tc = new Scanner(System.in);
		System.out.println("Ingrese un numero entero  positivo: ");
		num1 = tc.nextInt();
		System.out.println("Ingrese un numero entero positivo: ");
		num2 = tc.nextInt();

		for (int i = num1 + 1; i <= num2; i++) {
			int numero;
			int ultimoNumero;
			int totalSuma = 0;
			numero = i;
			while (numero != 0) {
				ultimoNumero = numero % 10;
				totalSuma = totalSuma + ultimoNumero * ultimoNumero * ultimoNumero;
				numero = numero / 10;
			}
			totalSuma = totalSuma + (numero * numero * numero);

			if (totalSuma == i) {
				System.out.println("" + i + " es Armstrong.");
			}
		}
	}
}
