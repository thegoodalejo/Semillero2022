package practica1;

public class Estudiante extends Persona{
	
	
	public Estudiante(String nombre, int edad){
		super(nombre, edad);
	}
	
	public void nombreEstudiante() {
		System.out.println("El estudiante es: "+nombre);
	}
}