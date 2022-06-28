package EstantePackage;

public class Dvd extends EstanteReproducible {
	String nombre;
	int duracion;
	static int contador = 0;

	public Dvd(String nombre,int duracion,String descripcion) {
		super(descripcion);
		this.nombre = nombre;
		this.duracion = duracion;
		contador ++;
		
	}

	@Override
	public void mostrarDescripcion() {
		System.out.println("DVD: "+nombre+"Duracion: "+duracion+"Descripcion:"+descripcion);
		
	}
	@Override
	public void reproducir() {
		// TODO Auto-generated method stub
		System.out.println("Reproduciendo DVD con duracion: "+duracion);
	}
	



}
