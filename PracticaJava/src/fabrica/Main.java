package fabrica;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int opcion1;
		int opcion=0;
		int talla;
		Scanner eleccion = new Scanner(System.in);

		//Objetos Etapas
		Etapa1 etapa1 = new Etapa1();
		Etapa2 etapa2 = new Etapa2();
		Etapa3 etapa3 = new Etapa3();
		
		do {
		System.out.println("Ingrese la talla del calzado: ");
		talla = eleccion.nextInt();
		
		//validacion tipo de talla
		if(talla>32 && talla<=43) {
			opcion=1;
		    }else {
		    	System.out.println("Eliga una talla Correcta entre 33 y 43");
		    }
		}while(opcion!=1);
		
		//Objetos Calzado
		Calzado calzado1 = new Calzado(talla);
		Clasico clasico1 = new Clasico("Arturo Calle");
		Deportivo deportivo1 = new Deportivo("Adidas");
		
        //Inicia etapa 1
		//etapa1.iniciarEtapa();
		opcion1 = etapa1.iniciarEtapaTipo(calzado1);
		
		switch(opcion1) {
	    case 1:
			clasico1.settipoCalzado("Clasico");
			//Inicia etapa 2
			//etapa2.iniciarEtapa();
			calzado1=etapa2.iniciarEtapaClasico(clasico1);
			//Inicia etapa 3
			//etapa3.iniciarEtapa();
			calzado1=etapa3.iniciarEtapaDetalles(calzado1);
			//Resumen
			System.out.println(calzado1.toString());
			
		break;
	    case 2:
	    	deportivo1.settipoCalzado("Deportivo");
			//Inicia etapa 2
	    	//etapa2.iniciarEtapa();
			calzado1=etapa2.iniciarEtapaDeportivo(deportivo1);
			//Inicia etapa 3
			//etapa3.iniciarEtapa();
			calzado1=etapa3.iniciarEtapaDetalles(deportivo1);
			//Resumen
			System.out.println(deportivo1.toString());
		break;
	   
		default:
	}
		
	
	
	}

}
