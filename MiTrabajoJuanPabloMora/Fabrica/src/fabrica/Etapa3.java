package fabrica;

import java.util.Scanner;

public class Etapa3 extends Fabricacion{
	
	//Atributos
	//------------------------------------------------------------------------------------------------------------------------------------	
	private int InventarioPadMouse;
	private int InventarioMorral;
	private int InventarioBaseRefrigerante;
	private int Inventariopantalla;
	private int InventariokitMouseTeclado;
	private int InventariowebCam;
	
	Scanner eleccion = new Scanner(System.in);
	
	//Constructores
	//------------------------------------------------------------------------------------------------------------------------------------

	//Metodos 
	//------------------------------------------------------------------------------------------------------------------------------------	
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
			System.out.println("Eliga una opcion valida");
		}
	  }while(opcion!=1);
	return portatil;
	}
	public Etapa3(int inventarioPadMouse, int inventarioMorral, int inventarioBaseRefrigerante, int inventariopantalla,
			int inventariokitMouseTeclado, int inventariowebCam) {
		super();
		InventarioPadMouse = inventarioPadMouse;
		InventarioMorral = inventarioMorral;
		InventarioBaseRefrigerante = inventarioBaseRefrigerante;
		Inventariopantalla = inventariopantalla;
		InventariokitMouseTeclado = inventariokitMouseTeclado;
		InventariowebCam = inventariowebCam;
	}
	//------------------------------------------------------------------------------------------------------------------------------------		
	public ComputadorMesa iniciarEtapa3PC(ComputadorMesa pcMesa) {
		
		int opcioninmenu;
		int opcion=0;
		//Ciclo Menu 
		do {
		System.out.println("\nElige un Accesorio:");
		System.out.println(" - Digita 1 para Agregar una Pantalla ");
		System.out.println(" - Digita 2 para Agregar un Kit Mouse y Teclado");
		System.out.println(" - Digita 3 para Agregar una Web Cam");
		System.out.println("Ingresa tu eleccion: ");
		opcioninmenu = eleccion.nextInt();
		//Validando opciones correctas del menu
		if(opcioninmenu>0 && opcioninmenu<4) {
			int opcion2;
			//Switch control de opciones de menu
			switch(opcioninmenu) {
		    case 1:
		    	if (this.Inventariopantalla<=0) {
					do {
					opcion2 = menuAbastecer();
					if(opcion2<0 || opcion2>2) {
						//Validando opcion correcta
						System.out.println("Eliga una opcion correcta");
					    }else if (opcion2==1){
					    	this.Inventariopantalla = this.Inventariopantalla +3;
					    	System.out.println("\nUnidades de Pantalla en Inventario: "+this.Inventariopantalla);
							opcion2=1;
					    }else {
					    	opcion2=1;
					    }

					}while(opcion2!=1);
					
				}else {
				//eleccion correcta 
				pcMesa.setPantalla(1);
				//Adicionar Valor en dolares
				pcMesa.setValor(pcMesa.getValor()+(250));
				System.out.println("Eligio : "+pcMesa.getPantalla()+" Pantalla ");
				this.Inventariopantalla=this.Inventariopantalla-1;
				System.out.println("Inventario Actualizado: "+this.Inventariopantalla+" Pantalla ");
				opcion=1;
				}
			break;
		    case 2:
		    	//Validando abastecimiento de inventario
		    	if (this.InventariokitMouseTeclado<=0) {
					do {
					opcion2 = menuAbastecer();
					//Validando opcion correcta
					if(opcion2<0 || opcion2>2) {
						System.out.println("Eliga una opcion correcta");
					    }else if (opcion2==1){
					    	this.InventariokitMouseTeclado = this.InventariokitMouseTeclado +3;
					    	System.out.println("\nUnidades Kit Mouse y Teclado en Inventario: "+this.InventariokitMouseTeclado);
							opcion2=1;
					    }else {
					    	opcion2=1;
					    }

					}while(opcion2!=1);
					
				}else {
			    //eleccion correcta 
				pcMesa.setKitMouseTeclado(1);
				//Adicionar Valor en dolares
				pcMesa.setValor(pcMesa.getValor()+(60));
				System.out.println("Eligio : "+pcMesa.getKitMouseTeclado()+" Kit Mouse y Teclado ");
				this.InventariokitMouseTeclado=this.InventariokitMouseTeclado-1;
				System.out.println("Inventario Actualizado: "+this.InventariokitMouseTeclado+" Kit Mouse y Teclado ");
				opcion=1;
				}
			break;
		    case 3:
		    	//Validando abastecimiento de inventario
		    	if (this.InventariowebCam<=0) {
					do {
					opcion2 = menuAbastecer();
					//Validando opcion correcta
					if(opcion2<0 || opcion2>2) {
						System.out.println("Eliga una opcion correcta");
					    }else if (opcion2==1){
					    	this.InventariowebCam = this.InventariowebCam +3;
					    	System.out.println("\nUnidades de Web Cam en Inventario: "+this.InventariowebCam);
							opcion2=1;
					    }else {
					    	opcion2=1;
					    }

					}while(opcion2!=1);
					
				}else {
				//eleccion correcta 	
				pcMesa.setWebCam(1);
				//Adicionar Valor en dolares
				pcMesa.setValor(pcMesa.getValor()+(85));
				System.out.println("Eligio : "+pcMesa.getWebCam()+" Web Cam ");
				this.InventariowebCam=this.InventariowebCam-1;
				System.out.println("Inventario Actualizado: "+this.InventariowebCam+" Web Cam ");
				opcion=1;
				}
			break;	    
			default:
		}
	   }else {
			System.out.println("Eliga una opcion valida");
		}
	  }while(opcion!=1);
	return pcMesa;
	}
	//------------------------------------------------------------------------------------------------------------------------------------		
	public int menuAbastecer() {   
			System.out.println("\nSin recursos Disponibles: ");
			System.out.println(" - Digita 1 para Abastecerse  ");
			System.out.println(" - Digita 2 Volver al menu");		
		return (eleccion.nextInt());
	   }
	//------------------------------------------------------------------------------------------------------------------------------------	
	public void resumenPortatil(Portatil portatil) {
		
		System.out.println("\nRESUMEN FINAL PORTATIL");
		System.out.println("************************************************");
		System.out.println(portatil.toString());
		System.out.println("************************************************");
	}
	//------------------------------------------------------------------------------------------------------------------------------------		
	public void resumenPC(ComputadorMesa pcMesa) {
		
		System.out.println("\nRESUMEN FINAL PORTATIL");
		System.out.println("************************************************");
		System.out.println(pcMesa.toString());
		System.out.println("************************************************");
	}
	//------------------------------------------------------------------------------------------------------------------------------------	
	@Override
	public void etapaFinalizada() {
		System.out.println("\nFinalizando Etapa 3... ");
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
