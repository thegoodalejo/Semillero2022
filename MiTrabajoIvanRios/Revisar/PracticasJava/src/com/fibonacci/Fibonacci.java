package com.fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Serie de Fibonacci");
		System.out.println("Ingrese cantidad de elementos a mostrar: ");
		int n = leer.nextInt();
		fibonacci(n);

	}
	
	public static void fibonacci(int n) {
		int primero = 0;
		int segundo = 1;
		if (n<=0) {
			System.out.println("Debe ingresar un número entero mayor que cero...");
		}else if (n==1){
			System.out.println(primero);
		}else if (n==2) {
			System.out.println(primero+"\n"+segundo);
		}else {
			System.out.println(primero+"\n"+segundo);
			int aux;
			for(int i=0;i<n-2;i++) {
				aux = segundo;
				segundo = segundo + primero;
				primero = aux;
				System.out.println(segundo);
			}
		}
			
	}

}
