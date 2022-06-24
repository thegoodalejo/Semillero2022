package EstantePackage;

import java.util.ArrayList;

public class ObjetosEstante {

	public static void main(String[] args) {
		Dvd dvd1 = new Dvd("Al filo del mañana",120,"Tom Cruise protagoniza este thriller de suspenso donde vive cada dia como si fuera el último");
		Cassete cassete1 = new Cassete(100,"Album Metallica One");
		Libro libro1 = new Libro("Cien años de soledad","Gabriel Garcia Marquez","Libro que narra los hechos que le suceden a la familia Buendia");

		ArrayList<EstanteNoReproducible> listaEstantes = new ArrayList<EstanteNoReproducible>();
		listaEstantes.add(libro1);

		
		ArrayList<EstanteReproducible> listaReproducibles = new ArrayList<EstanteReproducible>();
		listaReproducibles.add(cassete1);
		listaReproducibles.add(dvd1);
		
		for (Estante objeto:listaEstantes) {
			objeto.mostrarDescripcion();
		}
		
		for (EstanteReproducible reproducible:listaReproducibles) {
			reproducible.reproducir();
		}
		
		Estante.mostrarResumen();
		
		
	}

}
