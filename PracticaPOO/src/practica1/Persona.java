package practica1;

public class Persona {
	String nacionalidad;
	String nombre;
	int edad;
	
	Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = "COLOMBIANO";
	}
	
	Persona(String nombre, int edad, String nacionalidad){
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad.toUpperCase();
	}
}
