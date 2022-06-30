package fabrica;

public class Calzado extends Main {
	
	private String marca;
	private String material;
	private static int talla;
	private String tipoSuela;
	private String colorBase;
	private boolean cordon;
	private String genero;
	private String tipoCalzado;
	
	
	public Calzado() {
		
	}
	
	public Calzado(int talla) {
		this.talla = talla;
	}

	public Calzado(String marca, String material, int talla, String tipoSuela, String colorBase, boolean cordon,
			String genero, String tipoCalzado) {
		super();
		this.marca = marca;
		this.material = material;
		this.talla = talla;
		this.tipoSuela = tipoSuela;
		this.colorBase = colorBase;
		this.cordon = cordon;
		this.genero = genero;
		this.tipoCalzado = tipoCalzado;
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

	public String getTipoSuela() {
		return tipoSuela;
	}

	public void setTipoSuela(String tipoSuela) {
		this.tipoSuela = tipoSuela;
	}

	public String getColorBase() {
		return colorBase;
	}

	public void setColorBase(String colorBase) {
		this.colorBase = colorBase;
	}

	public boolean isCordon() {
		return cordon;
	}

	public void setCordon(boolean cordon) {
		this.cordon = cordon;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String gettipoCalzado() {
		return tipoCalzado;
	}
	public void settipoCalzado(String tipoCalzado){
		this.tipoCalzado = tipoCalzado;
		
		
	}
	

	

}
