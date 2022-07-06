package fabrica;

public class Equipo {

	private String nombre;
	private String modelo;
	private int valor;
	private int consumoEnergia;
	
	
	

	public Equipo() {
	}

	public Equipo(String nombre, String modelo, int valor, int consumoEnergia) {
		super();
		this.nombre = nombre;
		this.modelo = modelo;
		this.valor = valor;
		this.consumoEnergia = consumoEnergia;
	}
	
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
	public int getConsumoEnergia() {
		return consumoEnergia;
	}
	public void setConsumoEnergia(int consumoEnergia) {
		this.consumoEnergia = consumoEnergia;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", modelo=" + modelo + ", valor=" + valor + ", consumoEnergia="
				+ consumoEnergia + "]";
	}
	
	
	

	
}
