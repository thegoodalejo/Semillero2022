package practica1;

public class EstudianteExtranjero extends Estudiante{



	public EstudianteExtranjero(String nombre, int edad,String idioma) {
		super(nombre, edad, idioma);
	}
	
	public  void recibirClase() {
		System.out.println("Estudiante: "+nombre+" recibe la clase con diadema, traducido al idioma: "+this.idioma);
	}
	
	

}
