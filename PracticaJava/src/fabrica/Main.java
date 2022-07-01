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
			clasico1.settipoCalzado("Clasico");
			calzado1=etapa2.iniciarEtapaClasico(clasico1);
			calzado1=etapa3.iniciarEtapaDetalles(calzado1);

			System.out.println("Resumen elaboracion Zapato");
			System.out.println("Talla: "+calzado1.getTalla());
			System.out.println("tipo de Calzado: "+calzado1.gettipoCalzado());
			System.out.println("material: "+calzado1.getMaterial());
			System.out.println("Color: "+calzado1.getColorBase());
			
		} else {
			deportivo1.settipoCalzado("Deportivo");
			calzado1=etapa2.iniciarEtapaDeportivo(deportivo1);
			calzado1=etapa3.iniciarEtapaDetalles(deportivo1);

			System.out.println("Resumen elaboracion Zapato");
			System.out.println("Talla: "+deportivo1.getTalla());
			System.out.println("tipo de Calzado: "+deportivo1.gettipoCalzado());
			System.out.println("material: "+deportivo1.getMaterial());
			System.out.println("Color: "+deportivo1.getColorBase());
		}
	
	}

}
