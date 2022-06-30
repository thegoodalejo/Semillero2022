package proyecto.modelo;

public class Hamburguesa extends ComidaRapida{
	private String proteina, base, vegetales;
	
	public Hamburguesa(double precio, String nombre) {
		super(precio, nombre);
	
	}

	public String getProteina() {
		return proteina;
	}

	public void setProteina(String proteina) {
		this.proteina = proteina;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getVegetales() {
		return vegetales;
	}

	public void setVegetales(String vegetales) {
		this.vegetales = vegetales;
	}

}
