package fabrica;

import java.util.Scanner;

public class Etapa3 extends Fabricacion {

	public int iniciarEtapa(Calzado calzado3) {
		Scanner eleccion = new Scanner(System.in);

		System.out.println("\nElige tu color preferido:");
		System.out.println(" - Digita 1 para Beige");
		System.out.println(" - Digita 2 para Cafe");
		System.out.println(" - Digita 3 para Negro");
		System.out.println(" - Digita 4 para Gris");
		System.out.println(" - Digita 5 para Blanco");
		System.out.println(" - Digita 6 para Azul");
		System.out.println(" - Digita 7 para Verde");
		System.out.println(" - Digita 8 para Amarillo");
		System.out.println(" - Digita 9 para Rojo");
		System.out.println("Ingresa tu eleccion: ");
		int color = eleccion.nextInt();
		return color;
	}
	
	

}
