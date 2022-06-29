package practica1;

import java.util.ArrayList;

public class Aula extends Salon{
	
	ArrayList<Estudiante> lstEstudiantes = new ArrayList<Estudiante>();
	
	public Aula(int piso, int numero) {
		super(piso, numero);
	}
	
	public void ingresar(Estudiante estudiante) {
		contador++;
		System.out.println("Ingreso:  " + estudiante.nombre + " --- Total Estudiantes: " + contador);
		lstEstudiantes.add(estudiante);
		lstPersonas.add(estudiante);
	}
	
	public void iniciarClase() {
		for (Estudiante estudiante : lstEstudiantes) {
			estudiante.recibirClase();
		}
	}

	
}
