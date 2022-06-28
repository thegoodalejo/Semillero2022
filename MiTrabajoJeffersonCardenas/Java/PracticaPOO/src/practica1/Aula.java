package practica1;

public class Aula extends Salon{
	
	public Aula(int piso, int numero) {
		super(piso, numero);
	}

	public void ingresar(Persona persona) {
		contador++;
		personas.add(persona);
		System.out.println("Estudiante: " + persona.nombre);
	}
}
