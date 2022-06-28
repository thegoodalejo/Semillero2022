package model;

import java.util.Scanner;

public class Tienda {
	static Scanner consola = new Scanner(System.in);

	public static void main(String[] args) {


		int opcion =0;
		
			System.out.println("BUEN DIA, \n  "
					+ "¿Que tipo de café desea? \n"
					+ "1. Expreso  \n"
					+ "2. Americano \n"
					+ "3. Cappuccino");
			opcion= consola.nextInt();
			
		if(opcion <4 && opcion >0){
			marcarOpciones(opcion);
		}else{
			System.out.println("Opción no valida");
		}
			
		
	}

	private static void marcarOpciones(int opcion) {
		String tipo= "";
		int cantidad=0;
		int tipoGrano=0;
		switch (opcion) {
		case 1:
			tipo = "Expreso";
			
				System.out.println("¿Qué cantidad desea? \n"
						+ "1. 150 ml \n"
						+ "2. 500 ml \n"
						+ "3. 750 ml \n");
				cantidad = consola.nextInt();
				System.out.println("¿Qué tipo de grano desea? \n"
						+ "1. Café arábica \n"
						+ "2. Café libérica \n");
				tipoGrano = consola.nextInt();
			

			break;
		case 2:
			tipo = "Americano";
			
				System.out.println("¿Qué cantidad desea? \n"
						+ "1. 150 ml \n"
						+ "2. 300 ml \n"
						+ "3. 550 ml \n");
				cantidad = consola.nextInt();
				System.out.println("¿Qué tipo de grano desea? \n"
						+ "1. Café arábica \n"
						+ "2. Café libérica \n");
				tipoGrano = consola.nextInt();
			break;
		case 3:
			tipo = "Cappuccino";
			
				System.out.println("¿Qué cantidad desea? \n"
						+ "1. 300 ml \n"
						+ "2. 550 ml \n"
						+ "3. 750 ml \n");
				cantidad = consola.nextInt();
				System.out.println("¿Qué tipo de grano desea? \n"
						+ "1. Café arábica \n"
						+ "2. Café libérica \n");
				tipoGrano = consola.nextInt();
			
			break;

		default:
			break;
		}
		if(cantidad < 4 && cantidad > 0 && tipoGrano < 3 && tipoGrano > 0 ){
			Maquina.construirCafe(tipo, cantidad, tipoGrano);
		}else{
			System.out.println("Opciónes no valida");
		}
		
		
	}


		

}
