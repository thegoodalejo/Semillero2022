package proyecto.modelo;

public class ComidaRapida {
	private String nombre;
	private double precio;
	
	public ComidaRapida(double precio, String nombre) {
		this.nombre=nombre;
		this.precio=precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
