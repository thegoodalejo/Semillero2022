package fabrica;

import java.util.Scanner;

public class Etapa3 extends Fabricacion {

	public Calzado iniciarEtapaDetalles(Calzado calzado3) {
		Scanner eleccion = new Scanner(System.in);
		int color;
		int opcion=0;

		do {
		System.out.println("\nElige tu color preferido:");
		System.out.println(" - Digita 1 para Beige");
		System.out.println(" - Digita 2 para Cafe");
		System.out.println(" - Digita 3 para Negro");
		System.out.println(" - Digita 4 para Gris");
		System.out.println(" - Digita 5 para Blanco");
		System.out.println(" - Digita 6 para Azul");
		System.out.println("Ingresa tu eleccion: ");
		color = eleccion.nextInt();
		
		if(color>0 && color<7) {
			opcion=1;
			switch(color) {
		    case 1:
			     calzado3.setColorBase("Beige");
			break;
		    case 2:
			     calzado3.setColorBase("Cafe");
			break;
		    case 3:
			     calzado3.setColorBase("Negro");
			break;
		    case 4:
			     calzado3.setColorBase("Gris");
			break;
		    case 5:
			     calzado3.setColorBase("Blanco");
			break;
		    case 6:
			     calzado3.setColorBase("Azul");
			break;
			default:
		}

	   }else {
			System.out.println("Eliga una opcioin valida");
		}

	  }while(opcion!=1);
		
	return calzado3;
	}

	@Override
	public void iniciarEtapa() {
//		System.out.println("Iniciando Etapa 3 ");
//		try {
//			System.out.println("**************************** ");
//			Thread.sleep(500);
//			System.out.println("******************** ");
//			Thread.sleep(200);
//			System.out.println("*********");
//			Thread.sleep(200);
//			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	}


	

}
