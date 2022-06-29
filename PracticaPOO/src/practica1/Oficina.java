package practica1;

public class Oficina extends Salon{
	
	public Oficina(int piso, int numero) {
		super(piso, numero);
	}
	
	public  void ingresar(Persona persona) {
	contador++;
	System.out.println("Ingreso:  " + persona.nombre + " --- Total Personas: " + contador);
	lstPersonas.add(persona);
	}

}
