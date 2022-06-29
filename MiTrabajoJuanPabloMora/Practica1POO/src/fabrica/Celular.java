package fabrica;

public class Celular extends Equipo{
	
	int tamanoPantalla;

	public Celular(String nombre, String modelo, int serie, int tamanoPantalla) {
		super(nombre, modelo, serie);
		this.tamanoPantalla = tamanoPantalla;
	}
	
	public void verCaracteristicas() {
		System.out.println("Consola:  [ nombre=" + nombre + ", modelo=" + modelo + ", serie="
				+ serie + ", Tamaño de Pantalla=" + tamanoPantalla+" Pixeles "+"]");
	}
	

}
