package EstantePackage;

public abstract class Estante {
	String descripcion;
	static int objetos = 0;
	
	public Estante(String descripcion) {
		this.descripcion = descripcion;
		objetos++;
	}
	
	public abstract void mostrarDescripcion();
	public static void mostrarResumen() {
		System.out.println("Cantidad de Libros: "+Libro.contador);
		System.out.println("Cantidad de DVDs: "+Dvd.contador);
		System.out.println("Cantidad de Objetos en el estante: "+Estante.objetos);

	}

}
