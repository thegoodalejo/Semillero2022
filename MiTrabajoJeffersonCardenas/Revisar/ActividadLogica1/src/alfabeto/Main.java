package alfabeto;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// La letra menor es la A -> 65
		// La letra mayor es la z -> 122

		Scanner tc = new Scanner(System.in);
		String cadena = "";
		String cadenaTest = "akjlBbdffhafsAfAbfaaaff";

//		System.out.print("Ingrese la cadena de caracteres: ");
//		cadena = tc.next();
		
		/*SET DE PRUEBAS*/
		System.out.println(encontrarLetraMenor(cadenaTest));
		System.out.println(encontrarLetraMayor(cadenaTest));

		ordenarLetrasAsc(cadenaTest);
		
		sumarLetras(encontrarLetraMenor(cadenaTest), encontrarLetraMayor(cadenaTest));
		contarLetras(cadenaTest);
		/******************************************/
	}

	/* Metodo para encontrar la letra con el codigo ASCII menor */
	public static char encontrarLetraMenor(String cadena) {

		char[] letras = cadena.toCharArray();
		int MIN = 999999999;
		char letraMenor = ' ';

		for (char letra : letras) {

			if ((int) letra < MIN) {

				MIN = (int) letra;
				letraMenor = (char) MIN;

			}
		}

		return letraMenor;
	}

	/* Metodo para encontrar la letra con el codigo ASCII mayor */
	public static char encontrarLetraMayor(String cadena) {

		char[] letras = cadena.toCharArray();
		int MAX = -999999999;
		char letraMayor = ' ';

		for (char letra : letras) {

			if ((int) letra > MAX) {

				MAX = (int) letra;
				letraMayor = (char) MAX;

			}
		}

		return letraMayor;
	}

	/*Metodo para ordenar las letras en orden alfabetico*/
	public static void ordenarLetrasAsc(String cadena) {

		char[] letras = cadena.toCharArray();
		int band = 0;

		for (int a = 0; a < letras.length - 1; a++) {
			for (int b = 0; b < letras.length - 1; b++) {
				
				if (letras[b] > letras[b + 1]) {
					
					band = letras[b];
					letras[b] = letras[b + 1];
					letras[b + 1] = (char)band;
				}
			}
		}
		
		for(char letra : letras) {
			
			System.out.print(letra);
		}

		System.out.println("");
	}

	/*Metodo para sumar el codigo ASCII de la letra menor con el de la letra mayor*/
	public static void sumarLetras(char letraMenor, char letraMayor) {
		
		int sumaLetras = (int)letraMenor + (int)letraMayor;
		
		System.out.println("El caracter resultante de la suma de " + letraMenor + " + " + letraMayor + " es:");
		System.out.println((char) sumaLetras + " --> Codigo ASCII: " + sumaLetras);
		
	}
	
	/*Metodo para contar las veces que aparece cada letra en el string*/
	public static void contarLetras(String cadena) {
		
		String[] letras = cadena.split("");
		
		for(int a = 0; a < letras.length; a++) {
			
			int cantidad = 0;
			
			for(int b = 0; b < letras.length; b++) {
				
				if(letras[a].equals(letras[b])) {
					cantidad++;
				}
			}
			
			System.out.println(letras[a] + ": " + cantidad);
		}
		
	}
	
}








