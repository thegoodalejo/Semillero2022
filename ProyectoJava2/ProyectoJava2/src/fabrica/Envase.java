package fabrica;

import java.util.ArrayList;

public class Envase {
	public String nombre;
	public int tamanio;
	public static ArrayList<Envase> lstEnvases = new ArrayList<Envase>();
	
	
	public Envase(String nombre, int tamanio) {
		this.nombre = nombre;
		this.tamanio = tamanio;
		lstEnvases.add(this);
		
	}
}
