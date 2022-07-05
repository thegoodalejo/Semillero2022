package practica1;

public class Maestro extends Persona implements IEvacuable {
	
	public Maestro(String nombre, int edad){
		super(nombre, edad);
	}
	

	public void nombreMaestro() {
		System.out.println("El Maestro es: "+nombre);
	}


	@Override
	public void evacuarIncendio() {
		
		System.out.println("Mantiene la calma");
		System.out.println("Coordina plan de evacuacion");
		System.out.println("Inicia evacuacion...");
		
	}


	@Override
	public void evacuarTerremoto() {
		
		System.out.println("Mantiene la calma");
		System.out.println("Indica lugares seguros para resguardarse");
		System.out.println("Coordina plan de evacuacion");
		System.out.println("Inicia evacuacion...");
		
	}
}
