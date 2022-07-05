package estantePackage;

import java.util.ArrayList;

public class ObjetosEstante {

	public static void main(String[] args) {
		Libro libro1 = new Libro("Cien anios de soledad", "Gabriel Garcia Marquez","Libro que narra los hechos que le suceden a la familia Buendia");
		Dvd dvd1 = new Dvd("Al filo del maniana",120,"Tom Cruise protagoniza este thriller de suspenso donde vive cada dia como si fuera el ultimo");
		
		
		ArrayList<Estante> objetosEnElEstante = new ArrayList<Estante>();
		objetosEnElEstante.add(libro1);
		objetosEnElEstante.add(dvd1);		
		
		
		for(Estante objeto : objetosEnElEstante) {
			objeto.mostrarDescripcion();
		}
		
		Estante.mostrarResumen();
		
	}

}
