package cafe;

public class Cafe {
	
	private String TamanoVaso;
	private int palito;
	private int azucar;
	private int servir;
	private int precio;
	private int agua;
	private int cafe;
	

	public Cafe(String tamanoVaso, int palito, int azucar, int servir, int precio, int agua, int cafe) {
		super();
		TamanoVaso = tamanoVaso;
		this.palito = palito;
		this.azucar = azucar;
		this.servir = servir;
		this.precio = precio;
		this.agua = agua;
		this.cafe = cafe;
	}
	
	public int getCafe() {
		return cafe;
	}
	public void setCafe(int cafe) {
		this.cafe = cafe;
	}
	public int getAgua() {
		return agua;
	}
	public void setAgua(int agua) {
		this.agua = agua;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getTamanoVaso() {
		return TamanoVaso;
	}
	public void setTamanoVaso(String tamanoVaso) {
		TamanoVaso = tamanoVaso;
	}
	public int getPalito() {
		return palito;
	}
	public void setPalito(int palito) {
		this.palito = palito;
	}
	public int getAzucar() {
		return azucar;
	}
	public void setAzucar(int azucar) {
		this.azucar = azucar;
	}
	public int getServir() {
		return servir;
	}
	public void setServir(int servir) {
		this.servir = servir;
	}
	
	

}
