package fabrica;

import java.util.Scanner;

public class Etapa1 extends Fabricacion{
	


		//Etapa 1 elegir tipo de calzado para elaborar 
		public int iniciarEtapaEquipo(Equipo equipo) {
			Scanner eleccion = new Scanner(System.in);
			int tipoEquipo;
			int opcion=0;
			
			do {
			System.out.println("\nElige el tipo de Equipo a Construir:");
			System.out.println(" - Digita 1 para Portatil");
			System.out.println(" - Digita 2 para Computador de Mesa");
			System.out.println("Ingresa tu eleccion: ");
			tipoEquipo = eleccion.nextInt();
			
			//validacion tipo de calzado
			if(tipoEquipo>0 && tipoEquipo<=Fabricacion.MAX_TIPOS) {
				opcion=1;
			    }else {
			    	System.out.println("Eliga una opcioin valida");
			    }
			
			}while(opcion!=1);
			
			return tipoEquipo;	

		}
	

	@Override
	public void etapaFinalizada() {
		System.out.println("\nFinalizando Etapa 1 ");
		try {
			System.out.println("*********************************************** ");
			Thread.sleep(300);
			System.out.println("********************************** ");
			Thread.sleep(300);
			System.out.println("**************************** ");
			Thread.sleep(300);
			System.out.println("******************** ");
			Thread.sleep(300);
			System.out.println("*********");
			Thread.sleep(300);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
