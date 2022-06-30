package proyecto.modelo;

import java.util.ArrayList;
import java.util.Scanner;

import proyecto.services.IProteinas;

public class Fabrica {
	Scanner scanner = new Scanner(System.in);
	
	
	public void nuevoPedido() {
		int opcion=0;
		do {
			System.out.println("Seleccione el alimento que desea: \n"
					+ "1: Hamburguesa \n"
					+ "2: Salchipapa\n"
					+ "3: Ensalada\n"
					+ "0: Salir");
			opcion=scanner.nextInt();
			crearAlimento(opcion);
		}while(opcion!=0);

	}


	private void crearAlimento(int alimento) {
		switch (alimento) {
		case 0:
			System.out.println("Saliendo");
			break;
		case 1:
			Hamburguesa hamburguesa = new Hamburguesa(25000, "Basica");			
			break;
		case 2: 
			Salchipapa salchipapa = new Salchipapa(20000, "Costeña");
			break;
		case 3: 
			Ensalada ensalada = new Ensalada(12000, "Ensalada");
		default:
			
		}
		
	}

}
