package fabrica;

import java.util.Scanner;

public class Etapa3 extends Fabricacion {

	public Calzado iniciarEtapaDetalles(Calzado calzado3) {
		Scanner eleccion = new Scanner(System.in);

		System.out.println("\nElige tu color preferido:");
		System.out.println(" - Digita 1 para Beige");
		System.out.println(" - Digita 2 para Cafe");
		System.out.println(" - Digita 3 para Negro");
		System.out.println(" - Digita 4 para Gris");
		System.out.println(" - Digita 5 para Blanco");
		System.out.println(" - Digita 6 para Azul");
		System.out.println("Ingresa tu eleccion: ");
		int color = eleccion.nextInt();
		
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
		return calzado3;

	}

	@Override
	public int iniciarEtapa(Calzado calzado1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
