package practica1;

public class EstudianteExtranjero extends Estudiante{



	public EstudianteExtranjero(String nombre, int edad,String idioma) {
		super(nombre, edad, idioma);
	}
	
	public  void recibirClase() {
		System.out.println("Estudiante: "+nombre+" recibe la clase con diadema, traducido al idioma: "+this.idioma);
	}

	@Override
	public void evacuarIncendio() {
		
		System.out.println("Se asusta");
		System.out.println("Espera indicaciones en su idioma: "+this.idioma);
		System.out.println("Inicia evacuacion...");
	}

	@Override
	public void evacuarTerremoto() {
		
		System.out.println("Se asusta");
		System.out.println("Espera indicaciones en su idioma: "+this.idioma);
		System.out.println("Busca un lugar seguro");
		System.out.println("Inicia evacuacion...");
	}
	
	

}
