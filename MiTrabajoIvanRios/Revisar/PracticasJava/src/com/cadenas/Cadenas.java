package com.cadenas;

import java.util.Scanner;

public class Cadenas {

	static String contado = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese Cadena: ");
		//Se ingresa la cadena a evaluar
		String cadena = leer.next();
		//Se convierte la cadena en un vector de Strings
		String[] arregloString = convertirAVector(cadena);
		
		String[] arregloOrdenado = new String[cadena.length()];
		//Se ordena la cadena
		arregloOrdenado = ordenarArreglo(arregloString);
		//Se extrae el menor y el mayor
		char menor = arregloOrdenado[0].charAt(0);
		char mayor = arregloOrdenado[arregloOrdenado.length - 1].charAt(0);
		
		System.out.println("Caracter menor: " + menor);
		System.out.println("Caracter mayor: " + mayor);
		System.out.println("Arreglo Ordenado: ");
		//Se imprime el vector ordenado
		for (String s : arregloOrdenado) {
			System.out.print(s + "\s");
		}
		System.out.println("");
		//Se suman los caracteres menor y mayor
		int suma = (int) menor + (int) mayor;
		System.out.println("Codigo ASCII de la suma: " + suma + "--> Caracter Resultante: " + (char) suma);
		//
		for (String caracter : arregloOrdenado) {
			int numeroVeces = caracterRepetido(caracter, arregloOrdenado);
			if (numeroVeces > 1) {
				System.out.println("Caracter " + caracter.toLowerCase() + " aparece " + numeroVeces + " veces en la cadena");
			}
		}

	}

	public static String[] convertirAVector(String s) {
		//Se crea el vector del tamaño de la cadena
		String[] arreglo = new String[s.length()];
		for (int i = 0; i < s.length(); i++) {
			//Se asigna cada valor del string al vector
			arreglo[i] = String.valueOf(s.charAt(i));
		}
		return arreglo;

	}

	public static String[] ordenarArreglo(String[] arr) {
		String aux;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
					aux = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = aux;
				}
			}
		}
		return arr;
	}

	public static int caracterRepetido(String caracter, String[] arr) {
		if (contado.contains(caracter.toLowerCase()) || contado.contains(caracter.toUpperCase())) {
			return 0;
		} else {
			int contador = 0;
			for (String s : arr) {
				if (s.compareToIgnoreCase(caracter) == 0) {
					contador++;
				}

			}
			contado += caracter;
			return contador;
		}
	}
}
