package fabrica;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		int opcion1;
		
		Scanner eleccion = new Scanner(System.in);
		System.out.println("Ingrese la talla del calzado: ");
		int talla = eleccion.nextInt();
		
		Calzado calzado1 = new Calzado(talla);
		Clasico clasico1 = new Clasico();
		Deportivo deportivo1 = new Deportivo();
		
		Etapa1 etapa1 = new Etapa1();
		Etapa2 etapa2 = new Etapa2();
		Etapa3 etapa3 = new Etapa3();
		
		opcion1 = etapa1.iniciarEtapa(calzado1);
		if (opcion1 == 1) {
			etapa2.iniciarEtapa(clasico1);
		} else {
			etapa2.iniciarEtapa(deportivo1);
		}
		System.out.println("dfgdfhd: "+clasico1.getTalla());
		
		
		
		//etapa2.iniciarEtapa(deportivo);
	
		
		//etapa3.iniciarEtapa(deportivo);

		

	}

}
