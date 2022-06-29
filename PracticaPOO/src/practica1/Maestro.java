package practica1;

public class Maestro extends Persona{
	
	public Maestro(String nombre, int edad){
		super(nombre, edad);
	}
	
	public Maestro(String nombre, int edad, String nacionalidad){
		super(nombre, edad, nacionalidad);
	}
	
	public void nombreMaestro() {
		System.out.println("El Maestro es: "+nombre);
	}
}
