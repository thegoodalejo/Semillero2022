package fabrica;

import java.util.ArrayList;

public class Fragancia {
	public String nombre;
	public Genero genero;
	public static ArrayList<Fragancia> lstFragancias = new ArrayList<Fragancia>();
	
	public Fragancia(String nombre) {
		this.nombre = nombre;
		this.genero = null;
		lstFragancias.add(this);
	}
	
	public Fragancia(String nombre,Genero genero) {
		this.nombre = nombre;
		this.genero = genero;
		lstFragancias.add(this);
	}

}
