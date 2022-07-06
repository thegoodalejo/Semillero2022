package almuerzo;

import java.util.Scanner;

public class Etapa1 extends Preparacion {

	int menu1;
	int cantidadProteina;
	String proteina;
	String opcion;
	Inventario inventario1 = new Inventario();
	ControlInventario controlInventario = new ControlInventario();
	
	public void eleccionMenu1() {

		Scanner eleccion = new Scanner(System.in);
			System.out.println("Bienvenido\n Diseña el almuerzo a tu gusto:");
			System.out.println("\nElige la proteina que desees:");
			System.out.println(" - Digita [1] para elegir porcion de Carne asada");
			System.out.println(" - Digita [2] para elegir porcion de Cerdo asado");
			System.out.println(" - Digita [3] para elegir porcion de Pechuga de pollo");
			System.out.println("Ingresa tu eleccion: ");
			menu1 = eleccion.nextInt();
			System.out.println("Cuantas porciones deseas (maximo 5) unidades: ");
			cantidadProteina = eleccion.nextInt();
			
	}
	
	public void eleccionCarbohidrato() {
			
			switch (menu1) {
			case 1:
				inventario1.setCarne("porcion de carne asada");
				break;
			case 2:
				inventario1.setCerdo("porcion de cerdo asado");
				break;
			case 3:
				inventario1.setPollo("porcion de pechuga de pollo");
				break;
			default:
				System.out.println("Opción no valida");
		}
			
	}

	@Override
	public void resumenAlmuerzo() {
		
		System.out.println("Su almuerzo se preparo con: ");
		
		switch (menu1) {
		case 1:
			opcion = inventario1.getCarne();
			System.out.println("- "+ cantidadProteina+" "+inventario1.getCarne());
			break;
		case 2:
			opcion = inventario1.getCerdo();
			System.out.println("- "+ cantidadProteina+" "+inventario1.getCerdo());
			break;
		case 3:
			opcion = inventario1.getPollo();
			System.out.println("- "+ cantidadProteina+" "+inventario1.getPollo());
			break;
		default:
			System.out.println("Opción no valida");
	}	
//		controlInventario.controlInventario(opcion, cantidadProteina);
	}
}
