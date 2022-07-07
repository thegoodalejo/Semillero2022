package fabrica;

public class Equipo {
	
	//Atributos
	//------------------------------------------------------------------------------------------------------------------------------------
	private String nombre;
	private String modelo;
	private static int valor;

	//Constructores
	//------------------------------------------------------------------------------------------------------------------------------------
	public Equipo() {
	}

	public Equipo(String nombre, String modelo, int valor, int consumoEnergia) {
		super();
		this.nombre = nombre;
		this.modelo = modelo;
		this.valor = valor;
	}
	
	public Equipo(String nombre, String modelo) {
		super();
		this.nombre = nombre;
		this.modelo = modelo;
	}
	
	//Metodos 
	//------------------------------------------------------------------------------------------------------------------------------------	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	//------------------------------------------------------------------------------------------------------------------------------------	
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", modelo=" + modelo + ", valor=" + valor + "]";
	}

	
}
