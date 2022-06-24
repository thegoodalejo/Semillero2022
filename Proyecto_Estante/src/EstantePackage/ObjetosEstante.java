package EstantePackage;

import java.util.ArrayList;

public class ObjetosEstante {

	public static void main(String[] args) {
		Libro libro1 = new Libro("Cien años de soledad","Gabriel Garcia Marquez","Libro que narra los hechos que le suceden a la familia Buendia");
		Dvd dvd1 = new Dvd("Al filo del mañana",120,"Tom Cruise protagoniza este thriller de suspenso donde vive cada dia como si fuera el último");
		
		ArrayList<Estante> listaEstantes = new ArrayList<Estante>();
		listaEstantes.add(libro1);
		listaEstantes.add(dvd1);
		
		for (Estante objeto:listaEstantes) {
			objeto.mostrarDescripcion();
		}
		Estante.mostrarResumen();
	}

}
