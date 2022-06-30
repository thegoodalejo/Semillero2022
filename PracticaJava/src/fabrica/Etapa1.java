package fabrica;

import java.util.Scanner;

public class Etapa1 extends Fabricacion {

	
	
	@Override
	public int iniciarEtapa(Calzado calzado1) {
		
		Scanner eleccion = new Scanner(System.in);

		System.out.println("\nElige tu tipo de Calzado preferido:");
		System.out.println(" - Digita 1 para Calzado Clasico");
		System.out.println(" - Digita 2 para Calzado Deportivo");
		System.out.println("Ingresa tu eleccion: ");
		int tipoZapato = eleccion.nextInt();
		return tipoZapato;
		
	}

	

}
