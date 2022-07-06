package fabrica;

import java.util.Scanner;

public class Etapa2 extends Fabricacion{
	
	private int Inventarionucleos;
	private int InventariomemoriaRam;
	private int InventariodiscoDuro;
	private int InventariomemoriaVideo;
	
	Scanner eleccion = new Scanner(System.in);

public Etapa2(int nucleos, int memoriaRam, int discoDuro, int memoriaVideo) {
		super();
		this.Inventarionucleos = nucleos;
		this.InventariomemoriaRam = memoriaRam;
		this.InventariodiscoDuro = discoDuro;
		this.InventariomemoriaVideo = memoriaVideo;
	}

public Portatil  iniciarEtapa2Portatil(Portatil portatil) {
		
		System.out.println("\nIniciando ETAPA 2...");
		int control=0,control1=0,control2=0,control4=0,opcionmenu=0;
		
		//Ciclo Menu 
		do {
		int opcion=0,opcion1=0,opcion2=0;
		System.out.println("\nElige los materiales para tu Portatil: ");
		System.out.println(" - Digita 1 Nucleos de Procesador");
		System.out.println(" - Digita 2 Memoria Ram");
		System.out.println(" - Digita 3 Unidad de estado sólido (ssd)");
		System.out.println(" - Digita 4 Tarjeta Grafica de Video (opcional)");
		System.out.println(" - Digita 5 Configuracion terminada");
		System.out.println("Ingresa tu eleccion: ");
		opcion1 = eleccion.nextInt();
        //Validando opciones correctas del menu
		if(opcion1>0 && opcion1<=5) {
		//Switch control de opciones de menu
			switch(opcion1) {
		    case 1:
		    	if(control==0) {	    	
		    	do {
				System.out.println("\nElige el numero de nucleos de procesamiento 1 a 8 nucleos: ");
				System.out.println("\nNucleos disponibles en Inventario: "+Inventarionucleos);
				System.out.println("Ingresa tu eleccion: ");
				opcion1 = eleccion.nextInt();
				//Validando numero correcto de nucleos
				if(opcion1>0 && opcion1<=8) {
					//Validando nucleos disponlibles 
					if (opcion1>this.Inventarionucleos) {
						//ciclo menu abastecer
						do {
						opcion2 = menuAbastecer();
						if(opcion2<0 || opcion2>2) {
							System.out.println("Eliga una opcion correcta");
						    }else if (opcion2==1){
						    	this.Inventarionucleos = this.Inventarionucleos +3;
						    	opcion2=1;
						    }else {
						    	opcion2=1;
						    }
						}while(opcion2!=1);
					}else {
				    //eleccion correcta de nucleos
					portatil.setNucleos(opcion1);
					//Adicionar Valor en dolares
					portatil.setValor(portatil.getValor()+(opcion1*75));
					System.out.println("Eligio : "+portatil.getNucleos()+" nucleos ");
					this.Inventarionucleos=this.Inventarionucleos-opcion1;
					System.out.println("Inventario Actualizado: "+this.Inventarionucleos+" nucleos disponibles ");
					control=1;
					opcion=1;
					}
				    }else {
				    	System.out.println("Eliga una opcion valida");
				    }
		    	  }while(opcion!=1);
		    	}else {
		    		System.out.println("opcion ya configurada");
		    	}
			break;
		    case 2:
		    	if(control1==0) {
		    	do {
					System.out.println("\nElige el numero de memorias Ram, cada memoria tiene 2GB de ram, entre 1 y 8 : ");
					System.out.println("\nMeoria Ram en Inventario: "+InventariomemoriaRam);
					System.out.println("Ingresa tu eleccion: ");
					opcion1 = eleccion.nextInt();
					//Validando numero correcto de memoria ram
					if(opcion1>0 && opcion1<=8) {
						//Validando ram disponlibles 
						if (opcion1>this.InventariomemoriaRam) {
							//ciclo menu abastecer
							do {
							opcion2 = menuAbastecer();
							if(opcion2<0 || opcion2>2) {
								System.out.println("Eliga una opcion correcta");
							    }else if (opcion2==1){
							    	this.InventariomemoriaRam = this.InventariomemoriaRam +3;
							    	opcion2=1;
							    }else {
							    	opcion2=1;
							    }

							}while(opcion2!=1);
							
						}else {
						//eleccion correcta de memoria ram
						portatil.setMemoriaRam(opcion1);
						//Adicionar Valor en dolares
						portatil.setValor(portatil.getValor()+(opcion1*40));
						System.out.println("Eligio : "+portatil.getMemoriaRam()+" memorias ");
						this.InventariomemoriaRam=this.InventariomemoriaRam-opcion1;
						System.out.println("Inventario Actualizado: "+InventariomemoriaRam+" memorias Ram disponibles");
						opcion=1;
						control1=1;
						}
					    }else {
					    	System.out.println("Eliga una opcion valida");
					    }
			    	  }while(opcion!=1);
		    	}else {
		    		System.out.println("opcion ya configurada");
		    	}
			break;
			
		    case 3:
		    	if(control2==0) {
		    	do {
					System.out.println("\nElige lacantidad de almacenamiento SSD, cada unidad tiene 200GB de almacenamiento, puede escoger entre 1 y 8 unidades : ");
					System.out.println("\nUnidades SSD en Inventario: "+InventariodiscoDuro);
					System.out.println("Ingresa tu eleccion: ");
					opcion1 = eleccion.nextInt();
					//Validando numero correcto de unidad SSD
					if(opcion1>0 && opcion1<=8) {
						//Validando unidades ssd disponlibles 
						if (opcion1>this.InventariodiscoDuro) {
							//ciclo menu abastecer
							do {
							opcion2 = menuAbastecer();
							if(opcion2<0 || opcion2>2) {
								System.out.println("Eliga una opcion correcta");
							    }else if (opcion2==1){
							    	this.InventariodiscoDuro = this.InventariodiscoDuro +3;
							    	opcion2=1;
							    }else {
							    	opcion2=1;
							    }

							}while(opcion2!=1);
							
						}else {
						//eleccion correcta de unidades SSD
						portatil.setDiscoDuro(opcion1);
						//Adicionar Valor en dolares
						portatil.setValor(portatil.getValor()+(opcion1*50));
						System.out.println("Eligio : "+portatil.getDiscoDuro()+" Unidades SSD ");
						this.InventariodiscoDuro=this.InventariodiscoDuro-opcion1;
						System.out.println("Inventario Actualizado: "+InventariodiscoDuro+" Unidades SSD disponibles ");
						opcion=1;
						control2=1;
						}
					    }else {
					    	System.out.println("Eliga una opcion valida");
					    }
			    	  }while(opcion!=1);
		    	}else {
		    		System.out.println("opcion ya configurada");
		    	}
			break;
			
		    case 4:
		    	if(control4==0) {
		    	do {
					System.out.println("\nElige la unidad de Video, solo puede elegir hasta 2 unidad : ");
					System.out.println("\nUnidades Video en Inventario: "+InventariomemoriaVideo);
					System.out.println("Ingresa tu eleccion: ");
					opcion1 = eleccion.nextInt();
					//Validando numero correcto de graficas
					if(opcion1>0 && opcion1<=2) {
						//Validando graficas disponlibles 
						if (opcion1>this.InventariomemoriaVideo) {
							//ciclo menu abastecer
							do {
							opcion2 = menuAbastecer();
							if(opcion2<0 || opcion2>2) {
								System.out.println("Eliga una opcion correcta");
							    }else if (opcion2==1){
							    	this.InventariomemoriaVideo = this.InventariomemoriaVideo +3;
							    	opcion2=1;
							    }else {
							    	opcion2=1;
							    }

							}while(opcion2!=1);
							
						}else {
						//eleccion correcta de Graficas de video
						portatil.setMemoriaVideo(opcion1);
						//Adicionar Valor en dolares
						portatil.setValor(portatil.getValor()+(opcion1*150));
						System.out.println("Eligio : "+portatil.getMemoriaVideo()+" Unidades de Video disponibles ");
						this.InventariomemoriaVideo=this.InventariomemoriaVideo-opcion1;
						System.out.println("Inventario Actualizado: "+InventariomemoriaVideo+" Undades de Video ");
						opcion=1;
						control4=1;
						}
					    }else {
					    	System.out.println("Eliga una opcion valida");
					    }
			    	  }while(opcion!=1);
		    	}else {
		    		System.out.println("opcion ya configurada");
		    	}
			break;
			
		    case 5:
		    	//Validando configuracion minima requerida
				if(control==1 && control1==1 && control2==1) { opcionmenu=1;
				   }else
				    { System.out.println("Eliga La configuracion MINIMA necesaria, Nucleos del procesador, Memoria Ram, Unidad SSD");}
			break;
		    default:}
				opcion=1;
				//Validando que la opcion del menu principal sea valida
			    }else {
			    	System.out.println("Eliga una opcion valida");
			    }
		   }while(opcionmenu!=1);
		   //Resuman Parcial
		      System.out.println(portatil.resumenParcialEtapa2());
		       return portatil;
}

   public int menuAbastecer() {   
		System.out.println("\nSin recursos Disponibles: ");
		System.out.println(" - Digita 1 para Abastecerse  ");
		System.out.println(" - Digita 2 Volver al menu");		
	return (eleccion.nextInt());
   }


	@Override
	public void etapaFinalizada() {
		System.out.println("\nFinalizando Etapa 2 ");
		try {
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
	
	public void construccion() {
		System.out.println("\nETAPA 2 EN CONSTRUCCION...");
		try {
			System.out.println("*********************************************** ");
			Thread.sleep(200);
			System.out.println("********************************** ");
			Thread.sleep(200);
			System.out.println("**************************** ");
			Thread.sleep(200);
			System.out.println("******************** ");
			Thread.sleep(200);
			System.out.println("*********");
			Thread.sleep(200);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("PRONTO...");
		System.out.println("Solo disponible la creacion de equipos portatiles");

	}
	

}
