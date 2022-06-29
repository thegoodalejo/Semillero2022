package practica1;

import java.util.ArrayList;

public class Salon {

	int piso;
	int numeroSalon;
	int contador;
	String formatoAula;
	ArrayList<Persona> lstPersonas = new ArrayList<Persona>();

	public Salon(int piso, int numeroSalon) {
		if (numeroSalon <= 0) {
			this.numeroSalon = 0;
		} else if(numeroSalon>99) {
			this.numeroSalon = 99;
		}else {
			this.numeroSalon=numeroSalon;
		}
		this.piso = piso;
		this.contador = 0;
		this.formatoAula = "";

		if (this.numeroSalon > 0 && this.numeroSalon < 10) {
			formatoAula = String.valueOf(this.piso) + "0" + String.valueOf(this.numeroSalon);
		} else {
			formatoAula = String.valueOf(this.piso) + String.valueOf(this.numeroSalon);
		}
	}

	public void ingresar(Persona persona) {
		contador++;
		System.out.println("Ingreso:  " + persona.nombre + " --- Total Personas: " + contador);
		lstPersonas.add(persona);
	}

	public void resumen() {
		System.out.println("Las personas en el salon:  " + formatoAula + " son:");
		for (Persona persona : lstPersonas) {
			System.out.println(persona.nombre+" "+persona.nacionalidad);
		}
	}
}
