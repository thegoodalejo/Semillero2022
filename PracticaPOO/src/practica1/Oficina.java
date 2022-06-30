package practica1;

public class Oficina extends Salon {
	
	public Oficina(int piso, int numero) {
		super(piso, numero);
	}
	
	public  void ingresar(Persona persona) {
	contador++;
	System.out.println("Ingreso:  " + persona.nombre + " --- Total Personas: " + contador);
	lstPersonas.add(persona);
	}

	@Override
	public void evacuarIncendio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void evacuarTerremoto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrarMensaje(String msg) {
		
		
		
	}

}
