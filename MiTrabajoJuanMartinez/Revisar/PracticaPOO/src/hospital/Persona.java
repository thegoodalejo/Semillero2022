package hospital;

public class Persona {
	String nombre;
	int documento;
	int edad;
	String telefono;
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	public Persona(String nombre, int documento,int edad,String telefono) {
		this.nombre=nombre;
		this.documento=documento;
		this.edad=edad;
		this.telefono=telefono;
	}
	
}
