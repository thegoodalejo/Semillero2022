package practica1;

public abstract class Estudiante extends Persona{
	
	String idioma;
	
	public Estudiante(String nombre, int edad, String idioma){
		super(nombre, edad);
		this.idioma=idioma;
	}
	
	
	public void nombreEstudiante() {
		System.out.println("El estudiante es: "+nombre);
	}
	
	public abstract void recibirClase();
}