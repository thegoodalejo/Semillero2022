package fabrica;

import java.util.Scanner;

public class Etapa2 extends Fabricacion{
	
	private int Inventarionucleos;
	private int InventariomemoriaRam;
	private int InventariodiscoDuro;
	private int InventariomemoriaVideo;
	
	

public Etapa2(int nucleos, int memoriaRam, int discoDuro, int memoriaVideo) {
		super();
		this.Inventarionucleos = nucleos;
		this.InventariomemoriaRam = memoriaRam;
		this.InventariodiscoDuro = discoDuro;
		this.InventariomemoriaVideo = memoriaVideo;
	}

public Portatil  iniciarEtapa2Portatil(Portatil portatil) {
		
		System.out.println("\nIniciando Etapa 2");
		Scanner eleccion = new Scanner(System.in);
		int control=0,control1=0,control2=0,control4=0;
		
		int opcionmenu=0;
		
		do {
		int opcion=0,opcion1=0,opcion2=0;
		System.out.println("\nElige los materiales para tu Portatil: ");
		System.out.println(" - Digita 1 Nucleos de Procesador");
		System.out.println(" - Digita 2 Memoria Ram");
		System.out.println(" - Digita 3 Unidad de estado sólido ");
		System.out.println(" - Digita 4 Tarjeta Video (opcional)");
		System.out.println(" - Digita 5 Configuracion terminada");
		System.out.println("Ingresa tu eleccion: ");
		opcion1 = eleccion.nextInt();
		
		//validacion tipo de calzado
		if(opcion1>0 && opcion1<=5) {
			
			switch(opcion1) {
		    case 1:
		    	if(control==0) {
		    	
		    	do {
				System.out.println("\nElige el numero de nucleos 1 a 8 nucleos: ");
				System.out.println("\nNucleos en Inventario: "+Inventarionucleos);
				System.out.println("Ingresa tu eleccion: ");
				opcion1 = eleccion.nextInt();
				if(opcion1>0 && opcion1<=8) {
					if (opcion1>this.Inventarionucleos) {
						do {
						System.out.println("\nSin recursos Disponibles: ");
						System.out.println(" - Digita 1 abastecerse  ");
						System.out.println(" - Digita 2 Volver al menu");
						opcion2 = eleccion.nextInt();
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
					portatil.setNucleos(opcion1);
					System.out.println("Eligio : "+portatil.getNucleos()+" nucleos ");
					this.Inventarionucleos=this.Inventarionucleos-opcion1;
					System.out.println("Inventario Actualizado: "+Inventarionucleos+" nucleos ");
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
					if(opcion1>0 && opcion1<=8) {
						if (opcion1>this.InventariomemoriaRam) {
							do {
							System.out.println("\nSin recursos Disponibles: ");
							System.out.println(" - Digita 1 abastecerse  ");
							System.out.println(" - Digita 2 Volver al menu");
							opcion2 = eleccion.nextInt();
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
						portatil.setMemoriaRam(opcion1);
						System.out.println("Eligio : "+portatil.getMemoriaRam()+" memorias ");
						this.InventariomemoriaRam=this.InventariomemoriaRam-opcion1;
						System.out.println("Inventario Actualizado: "+InventariomemoriaRam+" memorias ");
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
					if(opcion1>0 && opcion1<=8) {
						if (opcion1>this.InventariodiscoDuro) {
							do {
							System.out.println("\nSin recursos Disponibles: ");
							System.out.println(" - Digita 1 abastecerse  ");
							System.out.println(" - Digita 2 Volver al menu");
							opcion2 = eleccion.nextInt();
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
						portatil.setDiscoDuro(opcion1);
						System.out.println("Eligio : "+portatil.getDiscoDuro()+" Unidades SSD ");
						this.InventariodiscoDuro=this.InventariodiscoDuro-opcion1;
						System.out.println("Inventario Actualizado: "+InventariodiscoDuro+" Undades SSD ");
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
					if(opcion1>0 && opcion1<=2) {
						if (opcion1>this.InventariomemoriaVideo) {
							do {
							System.out.println("\nSin recursos Disponibles: ");
							System.out.println(" - Digita 1 abastecerse  ");
							System.out.println(" - Digita 2 Volver al menu");
							opcion2 = eleccion.nextInt();
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
						portatil.setMemoriaVideo(opcion1);
						System.out.println("Eligio : "+portatil.getMemoriaVideo()+" Unidades de Video ");
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
				if(control==1 && control1==1 && control2==1) {
					opcionmenu=1;
				}else
				{
					System.out.println("Eliga La configuracin minima necesaria, nucleos, memoria, unidad ssd");
				}
		    	
			break;
		   
		    default:
		}
	
			opcion=1;
		    }else {
		    	System.out.println("Eliga una opcion valida");
		    }
		
		}while(opcionmenu!=1);
		System.out.println(portatil.toString());
		return portatil;
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
