package estantePackage;

public class Libro extends Estante {

	String titulo;
	String autor;
	static int contador = 0;
	
	public Libro(String titulo, String autor, String descripcion) {
		super(descripcion);
		this.titulo = titulo;
		this.autor = autor;
		contador++;
	}
	
	@Override
	public void mostrarDescripcion() {
		System.out.println("Libro: "+titulo+" Autor: "+autor+" Descripción: "+descripcion);
	}

}
