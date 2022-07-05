package app.services;

public abstract class Consumible {
	private int precio, cantidad;
	
	public Consumible (int precio) {
		this.precio = precio;	
		this.cantidad = 5;
	}
	
	public void disminuirCantidad() {
		cantidad--;
	}
	
	public void aumentarCantidad() {
		cantidad++;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}




	
	
	
	

}
