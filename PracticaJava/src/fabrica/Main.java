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
		Calzado calzado3 = new Calzado();
		Deportivo deportivo1 = new Deportivo();
		
		Etapa1 etapa1 = new Etapa1();
		Etapa2 etapa2 = new Etapa2();
		Etapa3 etapa3 = new Etapa3();
		
		opcion1 = etapa1.iniciarEtapa(calzado1);
		if (opcion1 == 1) {
			etapa2.iniciarEtapaClasico(clasico1);
		} else {
			etapa2.iniciarEtapaDeportivo(deportivo1);
		}
		etapa3.iniciarEtapa(calzado3);
		
		System.out.println("dfgdfhd: "+calzado1.getMaterial());
		
		
		
		
		
	

		

	}
	public void resumen() {
		System.out.println("Resuemen labooracion Zapato");
		System.out.println("Talla");
		System.out.println("Etapa1");
		System.out.println("tipo de Calzado");
		System.out.println("Etapa 2");
		System.out.println("material");
		System.out.println("Etapa 3");
		System.out.println("Talla");
		System.out.println("Color");
		
	}

}
