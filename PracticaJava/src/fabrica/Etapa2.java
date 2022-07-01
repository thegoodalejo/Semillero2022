package fabrica;

import java.util.Scanner;

public class Etapa2 extends Fabricacion{
	
	//Calzado clasico
	public Calzado  iniciarEtapaClasico(Calzado clasico) {
		
		System.out.println("\nIniciando Etapa 2");
		Scanner eleccion = new Scanner(System.in);
		int material=0;
		int opcion=0;
		
		do {
		System.out.println("\nElige los materiales para tu zapato: ");
		System.out.println(" - Digita 1 para Calzado Cuero");
		System.out.println(" - Digita 2 para Calzado Cuerina");
		System.out.println("Ingresa tu eleccion: ");
		material = eleccion.nextInt();
		
		//validacion tipo de calzado
		if(material>0 && material<=2) {
			opcion=1;
		    }else {
		    	System.out.println("Eliga una opcioin valida");
		    }
	
		if(material == 1) {
			clasico.setMaterial("Cuero");
		}else {
			clasico.setMaterial("Cuerina");	
		}
		
		}while(opcion!=1);
	
		return clasico;
		}
	
	//Calzado Deportivo
	public Calzado  iniciarEtapaDeportivo(Calzado deportivo) {
		
		
		System.out.println("\nIniciando Etapa 2");
		Scanner eleccion = new Scanner(System.in);
		int material=0;
		int opcion=0;
		
		do {
		System.out.println("\nElige los materiales para tu zapato: ");
		System.out.println(" - Digita 1 para Calzado Goma");
		System.out.println(" - Digita 2 para Calzado Tela");
		System.out.println(" - Digita 3 para Calzado Nailon");
		System.out.println("Ingresa tu eleccion: ");
		material = eleccion.nextInt();
		
		if(material>0 && material<4) {
			opcion=1;
			if(material == 1) {
				deportivo.setMaterial("Goma");
			}else if(material == 2){
				deportivo.setMaterial("Tela");	
			}else{
				deportivo.setMaterial("Nailon");	
			} 
	   }else {
		  System.out.println("Eliga una opcioin valida");
		    }
		}while(opcion!=1);

		return deportivo;
	}

	@Override
	public void iniciarEtapa() {
//		System.out.println("Iniciando Etapa 2 ");
//		try {
//			System.out.println("**************************** ");
//			Thread.sleep(500);
//			System.out.println("******************** ");
//			Thread.sleep(200);
//			System.out.println("*********");
//			Thread.sleep(200);
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	}

	

	
}
