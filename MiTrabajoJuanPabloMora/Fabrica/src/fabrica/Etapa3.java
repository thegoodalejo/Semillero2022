package fabrica;

import java.util.Scanner;

public class Etapa3 extends Fabricacion{

	private int InventarioPadMouse;
	private int InventarioMorral;
	private int InventarioBaseRefrigerante;
	
	Scanner eleccion = new Scanner(System.in);
	
	public Etapa3(int inventarioPadMouse, int inventarioMorral, int inventarioBaseRefrigerante) {
		super();
		InventarioPadMouse = inventarioPadMouse;
		InventarioMorral = inventarioMorral;
		InventarioBaseRefrigerante = inventarioBaseRefrigerante;
	}

	public Portatil iniciarEtapa3Portatil(Portatil portatil) {
		
		int opcioninmenu;
		int opcion=0;
		//Ciclo Menu 
		do {
		System.out.println("\nElige un Accesorio:");
		System.out.println(" - Digita 1 para Agregar un Pad Mouse");
		System.out.println(" - Digita 2 para Agregar un Morral");
		System.out.println(" - Digita 3 para Agregar una Base Refrigerante");
		System.out.println("Ingresa tu eleccion: ");
		opcioninmenu = eleccion.nextInt();
		//Validando opciones correctas del menu
		if(opcioninmenu>0 && opcioninmenu<4) {
			int opcion2;
			//Switch control de opciones de menu
			switch(opcioninmenu) {
		    case 1:
		    	if (this.InventarioPadMouse<=0) {
					do {
					opcion2 = menuAbastecer();
					if(opcion2<0 || opcion2>2) {
						//Validando opcion correcta
						System.out.println("Eliga una opcion correcta");
					    }else if (opcion2==1){
					    	this.InventarioPadMouse = this.InventarioPadMouse +3;
					    	System.out.println("\nUnidades Pad Mouse en Inventario: "+this.InventarioPadMouse);
							opcion2=1;
					    }else {
					    	opcion2=1;
					    }

					}while(opcion2!=1);
					
				}else {
				//eleccion correcta 
				portatil.setPadMouse(1);
				//Adicionar Valor en dolares
				portatil.setValor(portatil.getValor()+(20));
				System.out.println("Eligio : "+portatil.getPadMouse()+" Pad Mouse ");
				this.InventarioPadMouse=this.InventarioPadMouse-1;
				System.out.println("Inventario Actualizado: "+this.InventarioPadMouse+" Pad Mouse ");
				opcion=1;
				}
			break;
		    case 2:
		    	//Validando abastecimiento de inventario
		    	if (this.InventarioMorral<=0) {
					do {
					opcion2 = menuAbastecer();
					//Validando opcion correcta
					if(opcion2<0 || opcion2>2) {
						System.out.println("Eliga una opcion correcta");
					    }else if (opcion2==1){
					    	this.InventarioMorral = this.InventarioMorral +3;
					    	System.out.println("\nUnidades Morral en Inventario: "+this.InventarioMorral);
							opcion2=1;
					    }else {
					    	opcion2=1;
					    }

					}while(opcion2!=1);
					
				}else {
			    //eleccion correcta 
				portatil.setMorral(1);
				//Adicionar Valor en dolares
				portatil.setValor(portatil.getValor()+(30));
				System.out.println("Eligio : "+portatil.getMorral()+" Morral ");
				this.InventarioMorral=this.InventarioMorral-1;
				System.out.println("Inventario Actualizado: "+this.InventarioMorral+" Morral ");
				opcion=1;
				}
			break;
		    case 3:
		    	//Validando abastecimiento de inventario
		    	if (this.InventarioBaseRefrigerante<=0) {
					do {
					opcion2 = menuAbastecer();
					//Validando opcion correcta
					if(opcion2<0 || opcion2>2) {
						System.out.println("Eliga una opcion correcta");
					    }else if (opcion2==1){
					    	this.InventarioBaseRefrigerante = this.InventarioBaseRefrigerante +3;
					    	System.out.println("\nUnidades de Bases Refrigerantes en Inventario: "+this.InventarioBaseRefrigerante);
							opcion2=1;
					    }else {
					    	opcion2=1;
					    }

					}while(opcion2!=1);
					
				}else {
				//eleccion correcta 	
				portatil.setPadMouse(1);
				//Adicionar Valor en dolares
				portatil.setValor(portatil.getValor()+(10));
				System.out.println("Eligio : "+portatil.getPadMouse()+" Base Refrigerante ");
				this.InventarioBaseRefrigerante=this.InventarioBaseRefrigerante-1;
				System.out.println("Inventario Actualizado: "+this.InventarioBaseRefrigerante+" Base Refrigerante ");
				opcion=1;
				}
			break;	    
			default:
		}
	   }else {
			System.out.println("Eliga una opcioin valida");
		}
	  }while(opcion!=1);
	return portatil;
	}
	
	public int menuAbastecer() {   
			System.out.println("\nSin recursos Disponibles: ");
			System.out.println(" - Digita 1 para Abastecerse  ");
			System.out.println(" - Digita 2 Volver al menu");		
		return (eleccion.nextInt());
	   }
	
	public void resumen(Portatil portatil) {
		
		System.out.println("\nRESUMEN FINAL PORTATIL");
		System.out.println("************************************************");
		System.out.println(portatil.toString());
		System.out.println("************************************************");
	}
	
	

	@Override
	public void etapaFinalizada() {
		System.out.println("\nFinalizando Etapa 3 ");
		try {
			System.out.println("**************************** ");
			Thread.sleep(100);
			System.out.println("******************** ");
			Thread.sleep(100);
			System.out.println("*********");
			Thread.sleep(100);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
