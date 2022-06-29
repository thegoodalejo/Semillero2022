package com.armstrong;

import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner leer = new Scanner(System.in);
		System.out.println("Listado de numeros Armstrong");
		System.out.println("Ingrese valor inicial: ");
		a = leer.nextInt();
		System.out.println("Ingrese valor final: ");
		b = leer.nextInt();
		if (a < 0 || b < 0) {
			System.out.println("Los numeros deben ser enteros positivos mayores a cero (0)");
		} else {
			if (b <= a) {
				System.out.println("El valor final debe ser mayor al inicial");
			} else {
				System.out.println("Listado de numeros Armstrong");
				for (int numero = a;numero<=b;numero++) {
					int suma = 0;
					ArrayList<Integer> numeroSeparado = new ArrayList<Integer>();
					numeroSeparado = descomponerNumero(numero);
					for (int n : numeroSeparado) {
						suma = suma + calcularPotencia(n,numeroSeparado.size());
					}
	
					if (suma == numero) {
						System.out.println(numero);
					}
				}
			}

		}

	}

	public static ArrayList<Integer> descomponerNumero(int n) {
		ArrayList<Integer> numero = new ArrayList<Integer>();
		String numeroString = String.valueOf(n);
		for (int i = 0; i < numeroString.length(); i++) {
			numero.add(Integer.parseInt(String.valueOf(numeroString.charAt(i))));
		}
		return numero;
	}

	public static int calcularPotencia(int n, int exp) {
		return (int) Math.pow(n, exp);
	}

}
