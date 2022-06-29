package fabrica;

public class Consola extends Equipo {
	
	int numeroJuegos;

	public Consola(String nombre, String modelo, int serie, int numeroJuegos) {
		super(nombre, modelo, serie);
		this.numeroJuegos=numeroJuegos;
	}


	public void verCaracteristicas() {
		System.out.println("Consola:  [ nombre=" + nombre + ", modelo=" + modelo + ", serie="
				+ serie + ", Numero de Juegos=" + numeroJuegos+"]");
	}


}
