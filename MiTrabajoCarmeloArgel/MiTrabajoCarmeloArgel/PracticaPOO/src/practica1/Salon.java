package practica1;

import java.util.ArrayList;

public class Salon {
	
	int piso;
	int numero;
	int contador;
	ArrayList<Persona> lstPersonas = new ArrayList<Persona>();
	
	public Salon(int piso, int numero) {
		this.piso = piso;
		this.numero = numero;
		this.contador = 0;
	}
	
	public void ingresar(Persona persona) {
		contador++;
		System.out.println("Ingreso:  "+persona.nombre+" --- Total Personas: "+contador);
		lstPersonas.add(persona);
	}
	
	public void resumen() {
		System.out.println("Las personas en el salon son: ");		
		for(Persona persona : lstPersonas) {
			System.out.println(persona.nombre);
		}
	}

}
