package Fibonacci;

import java.util.Scanner;

public class SerieFibonacci {

	public static void main(String[] args) {
		
		//Solicitamos al usuario que ingrese un numero por teclado para realizar el calculo de la serie de Fibonacci
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero para el cual desea calcular la serie de Fibonacci: ");
		int numSerie = sc.nextInt();
		
		//Numeros iniciales de la serie de Fibonacci
		int vlrActual = 0;
		int vlrSiguiente = 1;
		int vlrTemporal;
		
		//Implementamos un bucle for para generar la serie de Fibonacci hasta el numSerie
		System.out.println("La serie de Fibonacci hasta el numero "+numSerie+ " es: ");
		for(int i = 1; i<=numSerie;i++) {
			vlrTemporal = vlrActual;
			vlrActual = vlrSiguiente+vlrActual;
			vlrSiguiente = vlrTemporal;
			System.out.println(vlrTemporal);
		}
	}

}
