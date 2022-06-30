package practica1;

public class EstudianteNativo extends Estudiante {



	public EstudianteNativo(String nombre, int edad, String idioma) {
		super(nombre, edad,idioma);

	}
	
	public  void recibirClase() {
		System.out.println("Estudiante: "+nombre+" recibe la clase sin diadema");
	}

	@Override
	public void evacuarIncendio() {
		System.out.println("Se asusta");
		System.out.println("Espera indicaciones");
		System.out.println("Inicia evacuacion...");
		
	}

	@Override
	public void evacuarTerremoto() {
		System.out.println("Se asusta");
		System.out.println("Espera indicaciones");
		System.out.println("Buscar un lugar seguro");
		System.out.println("Inicia evacuacion...");
		
	}
	
	
}
