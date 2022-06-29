package POO;

public abstract class Persona{
	
	String nombre;
	int edad;
	
	Persona(){
		
	}
	
	Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public abstract void caminar();

}
