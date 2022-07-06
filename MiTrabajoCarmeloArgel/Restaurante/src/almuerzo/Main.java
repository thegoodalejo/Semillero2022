package almuerzo;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Etapa1 menu1 = new Etapa1();
		Etapa2 menu2 = new Etapa2();
		Etapa3 menu3 = new Etapa3();
		Inventario inventario = new Inventario();
				
		//Metodos Etapa1
		menu1.eleccionMenu1();
		menu1.eleccionCarbohidrato();
		//Metodos Etapa1
		menu2.eleccionMenu2();
		menu2.eleccionProteina();
		//Metodos Etapa1
		menu3.eleccionMenu3();
		menu3.eleccionEnsalada();
		//Muestro el resumen del almuerzo
		menu1.resumenAlmuerzo();
		menu2.resumenAlmuerzo();
		menu3.resumenAlmuerzo();
//		System.out.println("inventario de carne: "+inventario.getCantidadCarne());
//		System.out.println("inventario de carne: "+inventario.getCantidadCerdo());
//		System.out.println("inventario de carne: "+inventario.getCantidadPollo());
		
	}
}
