package fabrica;

import java.util.Scanner;

public class Etapa1 extends Fabricacion {

	String tipo;
	

	//Etapa 1 elegir tipo de calzado para elaborar 
	public int iniciarEtapaTipo(Calzado calzado1) {
		Scanner eleccion = new Scanner(System.in);
		int tipoZapato;
		int opcion=0;
		
		do {
		System.out.println("\nElige tu tipo de Calzado preferido:");
		System.out.println(" - Digita 1 para Calzado Clasico");
		System.out.println(" - Digita 2 para Calzado Deportivo");
		System.out.println("Ingresa tu eleccion: ");
		tipoZapato = eleccion.nextInt();
		
		//validacion tipo de calzado
		if(tipoZapato>0 && tipoZapato<=Fabricacion.MAX_TIPOS) {
			opcion=1;
		    }else {
		    	System.out.println("Eliga una opcioin valida");
		    }
		
		}while(opcion!=1);
		
		return tipoZapato;	

	}


	@Override
	public void iniciarEtapa() {
//		System.out.println("Iniciando Etapa 1 ");
//		try {
//			System.out.println("*********************************************** ");
//			Thread.sleep(300);
//			System.out.println("********************************** ");
//			Thread.sleep(300);
//			System.out.println("**************************** ");
//			Thread.sleep(300);
//			System.out.println("******************** ");
//			Thread.sleep(300);
//			System.out.println("*********");
//			Thread.sleep(300);
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	}




}
