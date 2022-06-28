package practica1;

public class Oficina extends Salon{
	
	
	public Oficina(int piso, int numero) {
		super(piso, numero);
	}
	

	public void ingresar(Persona persona) {
		contador++;
		personas.add(persona);
		System.out.println("Profesor: " + persona.nombre);
	}

}
