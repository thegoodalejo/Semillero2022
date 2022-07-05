package practica1;

import java.util.ArrayList;

public abstract class Salon implements IEvacuable, IMessage {

	int piso;
	int numeroSalon;
	int contador;
	String formatoAula;
	ArrayList<Persona> lstPersonas = new ArrayList<Persona>();
	ArrayList<Estudiante> lstEstudiantes = new ArrayList<Estudiante>();

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

	public  void ingresar(Maestro maestro) {
		contador++;
		System.out.println("Ingreso:  " + maestro.nombre + " --- Total Personas: " + contador);
		lstPersonas.add(maestro);
	}
	
	public  void ingresar(Estudiante estudiante) {
		contador++;
		System.out.println("Ingreso:  " + estudiante.nombre + " --- Total Personas: " + contador);
		lstEstudiantes.add(estudiante);
		lstPersonas.add(estudiante);
	}

	public void resumen() {
		System.out.println("Las personas en el salon:  " + formatoAula + " son:");
		for (Persona persona : lstPersonas) {
			System.out.println(persona.nombre);
		}
	}
}
