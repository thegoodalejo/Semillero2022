package estantePackage;

public class Dvd extends Estante{
	
	String nombre;
	int duracion;
	static int contador = 0;

	public Dvd(String nombre, int duracion, String descripcion) {
		super(descripcion);
		this.nombre = nombre;
		this.duracion = duracion;
		contador++;
	}

	@Override
	public void mostrarDescripcion() {
		System.out.println("DVD: "+nombre+" Duración: "+duracion+" Descripción: "+descripcion);
	}
	
	

}
