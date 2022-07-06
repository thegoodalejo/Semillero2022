package fabrica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcion1;
		int opcion=0;
		int nuevoProducto;
		Scanner eleccion = new Scanner(System.in);

		//Objetos Etapas
		Etapa1 etapa1 = new Etapa1();
		Etapa2 etapa2 = new Etapa2(5,5,5,5);
		Etapa3 etapa3 = new Etapa3(5,5,5);
		
		do {

		
		//Objetos 
        Equipo equipo = new Equipo();
        Portatil portatil = new Portatil();
        ComputadorMesa pcMesa = new ComputadorMesa();
		
        //Inicia etapa 1
		opcion1 = etapa1.iniciarEtapaEquipo(equipo);
		etapa1.etapaFinalizada();
		switch(opcion1) {
	    case 1:

			//Inicia etapa 2
	    	portatil=etapa2.iniciarEtapa2Portatil(portatil);
	    	etapa2.etapaFinalizada();
			//Inicia etapa 3
	    	portatil=etapa3.iniciarEtapa3Portatil(portatil);
	    	etapa3.etapaFinalizada();
	    	//Resumen
	    	etapa3.resumen(portatil);
			//Inicia etapa 4

		break;
	    case 2:
	    	
	    	etapa2.construccion();
	    	
			//Inicia etapa 2

			//Inicia etapa 3

	
		break;
	   
	    default:
	}
		
		System.out.println("\n¿Desea construir un nuevo producto?");
		System.out.println(" - Digita 1 SI");
		System.out.println(" - Digita 2 NO");
		System.out.println("Ingresa tu eleccion: ");
		//validacion construir de nuevo
		nuevoProducto = eleccion.nextInt();
		if(nuevoProducto<0 || nuevoProducto>2) {
			System.out.println("Eliga una opcion correcta");
		    }else if (nuevoProducto==2){
		    	opcion=1;
		    System.out.println("Finalizado, Que tengas un gran dia");
		    }
		}while(opcion!=1);
		
		

	}

}
