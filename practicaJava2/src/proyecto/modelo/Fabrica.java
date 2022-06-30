package proyecto.modelo;

import java.util.ArrayList;
import java.util.Scanner;

import proyecto.services.IProteinas;

public class Fabrica {
	Scanner scanner = new Scanner(System.in);
	ArrayList<ComidaRapida> listaComida = new ArrayList<ComidaRapida>();
	
	public void nuevoPedido() {
		System.out.println("Seleccione el alimento que desea: \n"
				+ "1: Hamburguesa \n"
				+ "2: Salchipapa\n"
				+ "3: Ensalada\n");
		
	 crearAlimento(scanner.nextInt());
	}


	private void crearAlimento(int alimento) {
		switch (alimento) {
		case 1:
			Hamburguesa hamburguesa = new Hamburguesa(25000, "Basica");
			
			break;
		default:
			
		}
		
	}

}
