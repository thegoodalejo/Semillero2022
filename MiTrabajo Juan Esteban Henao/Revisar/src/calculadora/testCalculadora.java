package calculadora;

import java.util.Scanner;

public class testCalculadora {
	
	static Scanner scanner = new Scanner(System. in);
	static int  c;
	static double a , b;

	public static void main(String[] args) {
		System.out.println("Bienvenido a la calculadora");
		System.out.println("Ingrese el numero A: ");
		a= scanner.nextDouble();
		System.out.println("Ingrese el numero B: ");
		b= scanner.nextDouble();
		
		System.out.println("¿Que operacion desea realizar? \n"
				+ "1. Suma \n"
				+ "2. Multiplicacion \n"
				+ "3. Division \n");
		c = scanner.nextInt();
		
		realizarOperacion(a,b,c);
	}

	private static void realizarOperacion(double a, double b, int c) {
		switch (c) {
		case 1: 
			 System.out.println("La suma es: "+ (a+b));
			break;
		
		case 2:
			System.out.println("La multiplicacion es: "+ (a*b));
			break;
			
		case 3: 
			System.out.println("La division es: "+ (a/b));
			break;
		default:
			System.out.println("Valor invalido en la operacion");
		}
		
	}

}
