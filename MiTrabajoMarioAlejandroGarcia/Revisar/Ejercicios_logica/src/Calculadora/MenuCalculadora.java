package Calculadora;

import java.util.Scanner;

public class MenuCalculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println("----------------------");
			System.out.println("  MENU CALCULADORA ");
			System.out.println("1.Sumar");
			System.out.println("2.Restar");
			System.out.println("3.Multiplicar");
			System.out.println("4.Dividir");
			System.out.println("5.Salir");
			System.out.println("----------------------");
			
			System.out.println("Seleccione la opcion de la operacion que desea realizar: ");
			opcion = sc.nextInt();
			
			
			System.out.println("Ingrese el primer numero: ");
			int num1 = sc.nextInt();
			System.out.println("Ingrese el segundo numero: ");
			int num2 = sc.nextInt();
			Calculadora calculadora1 = new Calculadora(num1, num2);
			
			switch(opcion) {
				case 1:
					calculadora1.sumarNumeros();
					break;
				case 2:
					calculadora1.restarNumeros();
					break;
				case 3:
					calculadora1.multiplicarNumeros();
					break;
				case 4:
					if(num2 != 0) {
						calculadora1.dividirNumeros();
					}
					System.out.println("No es posible realizar la division por 0");
					break;
			}
		}while(opcion!=5);
		System.out.println("Ingreso una opcion invalida");

	  }
}

