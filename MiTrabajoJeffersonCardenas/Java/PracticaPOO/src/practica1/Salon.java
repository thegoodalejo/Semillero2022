package practica1;
import java.util.*;

public class Salon {
	
	int piso;
	int numero;
	int contador;
	List<Persona> personas = new ArrayList();
	
	public Salon(int piso, int numero) {
		this.piso = piso;
		this.numero = numero;
	}
	
	public void ingresar(Persona persona) {
		contador++;
	}
	
	public void resumen() {
		System.out.println("En el Salon " + numero + " hay " + contador + " personas");
		System.out.println("***Lista de las Personas");
		for(Persona persona : personas) {
			System.out.println(persona.nombre);
		}
	}

}
