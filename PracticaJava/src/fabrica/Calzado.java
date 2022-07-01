package fabrica;

public class Calzado extends Main {
	
	private String marca;
	private String material;
	private static int talla;
	private String colorBase;
	private String tipoCalzado;
	private String tipoTacon;
	
	public Calzado() {
		
	}
	
	public Calzado(int talla) {
		this.talla = talla;
	}

	public Calzado(String marca) {
		this.marca = marca;
	}

	public Calzado(String marca, String material, String colorBase, String tipoCalzado,String tipoTacon) {
		super();
		this.marca = marca;
		this.material = material;
		this.colorBase = colorBase;
		this.tipoCalzado = tipoCalzado;
		this.tipoTacon = tipoTacon;
	}

	public String getMarca() {
		return marca;
	}
	

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public String getColorBase() {
		return colorBase;
	}

	public void setColorBase(String colorBase) {
		this.colorBase = colorBase;
	}


	public String gettipoCalzado() {
		return tipoCalzado;
	}
	
	public void settipoCalzado(String tipoCalzado){
		this.tipoCalzado = tipoCalzado;
		
		
	}
	public String gettipoTacon() {
		return tipoTacon;
	}
	

	public void settipoTacon(String tipoTacon) {
		this.tipoTacon = tipoTacon;
	}

	@Override
	public String toString() {
		return "Resumen elaboracion Zapato"+"\nTalla=" + talla +"\ntipoCalzado=" + tipoCalzado + ",\nMaterial=" + material + ",\nColorBase=" + colorBase + ",\nMarca="
				+ marca +"\ntipo Tacon=" + tipoTacon;
	}
	
	
	
	

}
