package numerosArmstrong;

import java.util.ArrayList;
import java.util.Scanner;

public class testArmstrong {
	
	static Scanner scanner = new Scanner(System. in);
	static int a, b;

	public static void main(String[] args) {
		try {
			System.out.println("Ingrese el número A: ");
			a= scanner.nextInt();
			System.out.println("Ingrese el número B: ");
			b= scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Solo se pueden ingresar enteros");
		}

			
			if (a<b && a>0) {
				mostrarNumeros(a,b);
			}else {
				System.out.println("A debe ser menor a B y mayor a 0");
			}

	}

	private static void mostrarNumeros(int a, int b) {
		int numeroCalculado=0;
		System.out.println("Los numeros de Armstrong entre "+a+" y "+b+" son :");
		for (int i = a+1; i < b; i++) {
		numeroCalculado= comprobarSumaNumerosArreglo(convertirEnArreglo(i));
			if (numeroCalculado == i) {
				System.out.println(i);
			}
		}		
	}
	
	private static int comprobarSumaNumerosArreglo(ArrayList<Integer> arreglo) {
		int contador=0;
		int tamanio = arreglo.size();
		for (int i = 0; i < tamanio; i++) {
			contador+=Math.pow(arreglo.get(i), tamanio);
		}
		return contador;
	}

	public static ArrayList<Integer> convertirEnArreglo(int num) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		String numero = String.valueOf(num);
		for (int i = 0; i < numero.length(); i++) {
			numeros.add(Character.getNumericValue(numero.charAt(i)));	
		}

		return numeros;
	}
	

}
