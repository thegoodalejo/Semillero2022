package com.cadenas;

import java.util.Scanner;

public class Cadenas {

	static String contado = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese Cadena: ");
		String cadena = leer.next();
		String[] arregloString = convertirAVector(cadena);
		String[] arregloOrdenado = new String[cadena.length()];
		arregloOrdenado = ordenarArreglo(arregloString);
		char menor = arregloOrdenado[0].charAt(0);
		char mayor = arregloOrdenado[arregloOrdenado.length - 1].charAt(0);
		System.out.println("Caracter menor: " + menor);
		System.out.println("Caracter mayor: " + mayor);
		System.out.println("Arreglo Ordenado: ");
		for (String s : arregloOrdenado) {
			System.out.print(s + "\s");
		}
		System.out.println("");
		int suma = (int) menor + (int) mayor;
		System.out.println("Codigo ASCII de la suma: " + suma + "--> Caracter Resultante: " + (char) suma);
		for (String caracter : arregloOrdenado) {
			int numeroVeces = caracterRepetido(caracter, arregloOrdenado);
			if (numeroVeces > 1) {
				System.out.println("Caracter " + caracter + " aparece " + numeroVeces + " veces en la cadena");
			}
		}

	}

	public static String[] convertirAVector(String s) {
		String[] arreglo = new String[s.length()];
		for (int i = 0; i < s.length(); i++) {
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
		if (contado.contains(caracter)) {
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
