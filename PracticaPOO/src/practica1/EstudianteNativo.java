package practica1;

public class EstudianteNativo extends Estudiante {



	public EstudianteNativo(String nombre, int edad, String idioma) {
		super(nombre, edad,idioma);

	}
	
	public  void recibirClase() {
		System.out.println("Estudiante : "+nombre+" recibe la clase sin diadema");
	}
	

}
