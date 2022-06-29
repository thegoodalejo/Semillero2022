package com.operaciones;

import java.util.*;

public class Operaciones {

	static double n1,n2;
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("************Operaciones Basicas************");
		leerNumeros();
		limpiarPantalla();
		menu();

	}

	public static void menu() {
		int opcion;
		do {
		System.out.println("************Menu de Opciones************");
		System.out.println("************1. Sumar Numeros************");
		System.out.println("************2. Restar Numeros************");
		System.out.println("************3. Multiplicar Numeros************");
		System.out.println("************4. Dividir Numeros************");
		System.out.println("************5. Leer Numeros************");
		System.out.println("************6. Salir************");

		System.out.println("\n"+"Ingrese una opcion: ");
		opcion = leer.nextInt();
			switch (opcion) {
			case 1: 
				System.out.println("La suma es: "+sumar(n1,n2));
				new java.util.Scanner(System.in).nextLine();
				break;
			case 2: 
				System.out.println("La resta es: "+restar(n1,n2));
				new java.util.Scanner(System.in).nextLine();
				break;
			case 3: 
				System.out.println("La multiplicacion es: "+multiplicar(n1,n2));
				new java.util.Scanner(System.in).nextLine();
				break;
			case 4: 
				if (n2!=0) {
					System.out.println("La division es: "+dividir(n1,n2));
				}else {
					System.out.println("No se puede dividir entre cero (0)...");
				}
				new java.util.Scanner(System.in).nextLine();
				break;
			case 5:
				leerNumeros();
				new java.util.Scanner(System.in).nextLine();
				break;
			case 6: 
				System.out.println("Hasta pronto!");
				new java.util.Scanner(System.in).nextLine();
				break;
			default:System.out.println("Opcion no valida");
			new java.util.Scanner(System.in).nextLine();
			break;
			}
		}while(opcion!=6);

	}

	public static void leerNumeros() {
		System.out.println("Ingrese Numero 1: ");
		n1 = leer.nextDouble();
		System.out.println("Ingrese Numero 2: ");
		n2 = leer.nextDouble();

	}
	public static double sumar(double n1, double n2) {
		return n1+n2;
	}

	public static double restar(double n1, double n2) {
		return n1-n2;
	}

	public static double multiplicar(double n1, double n2) {
		return n1*n2;
	}

	public static double dividir(double n1, double n2) {
		return n1/n2;
	}

	public static void limpiarPantalla(){
		try {
			String sistemaOperativo = System.getProperty("os.name");
			ArrayList<String> comando= new ArrayList<>();
			if(sistemaOperativo.contains("Windows")){        
				comando.add("cmd");
				comando.add("/C");
				comando.add("cls");

			} else {
				comando.add("clear");
			} 

			ProcessBuilder pb = new ProcessBuilder(comando);
			Process iniciarProceso = pb.inheritIO().start();
			iniciarProceso.waitFor();

		} catch (Exception e) {
			System.out.println("Error al limpiar la pantalla"+e.getMessage());
		}
	}


}
