package fabrica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcion1,nuevoProducto;
		int opcion=0;
		Scanner eleccion = new Scanner(System.in);
		
		//Objetos Etapas
		Etapa1 etapa1 = new Etapa1();
		Etapa2 etapa2 = new Etapa2(5,5,5,5,20,15,15,15);
		Etapa3 etapa3 = new Etapa3(5,5,5,5,5,5);
		
		//Objetos 
        Equipo equipo = new Equipo();
        Portatil portatil = new Portatil("ACER Aspire","2020");
        ComputadorMesa pcMesa = new ComputadorMesa("DELL ALIENWARE","2022");
		do {

        //Inicia etapa 1
		opcion1 = etapa1.iniciarEtapaEquipo(equipo);
		switch(opcion1) {
	    case 1:
			//Inicia etapa 2
	    	portatil=etapa2.iniciarEtapa2Portatil(portatil);
	    	etapa2.etapaFinalizada();
			//Inicia etapa 3
	    	portatil=etapa3.iniciarEtapa3Portatil(portatil);
	    	etapa3.etapaFinalizada();
	    	//Resumen
	    	etapa3.resumenPortatil(portatil);
		break;
	    case 2:	    	
			//Inicia etapa 2
	    	pcMesa=etapa2.iniciarEtapa2PC(pcMesa);
	    	etapa2.etapaFinalizada();
			//Inicia etapa 3	
	    	pcMesa=etapa3.iniciarEtapa3PC(pcMesa);
	    	etapa3.etapaFinalizada();
	    	//Resumen
	    	etapa3.resumenPC(pcMesa);
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
