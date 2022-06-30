package Armstrong;

import java.util.Scanner;

public class EjercicioArmstrong {

	static void numeroArmstrong(int a, int b) {

		for (int i = a; i <= b; ++i) {

			// Identifico el número de digítos
			int x = i;
			int n = 0;
			while (x != 0) {
				x /= 10;
				++n;
			}

			// Suma de la n-ésima potencia de sus dígitos
			int sum = 0;
			x = i;
			while (x != 0) {
				int digit = x % 10;
				sum += Math.pow(digit, n);
				x /= 10;
			}

			// Se valida que el numero i sea igual a la sumatoria de la potencia de sus
			// digítos
			
			if (sum == i)
				System.out.print("[" + i + "] ");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Ingrese el primer numero: ");
		int a = sc.nextInt();

		System.out.print("Ingrese el segundo numero: ");
		int b = sc.nextInt();

		if (a > b) {
			System.out.print("El primer numero debe ser menor que el segundo numero");
		}
		if (a < 0 || b < 0) {
			System.out.print("Los numeros no pueden ser negativos");
		} else {
			
			numeroArmstrong(a, b);
		}
	}
}
