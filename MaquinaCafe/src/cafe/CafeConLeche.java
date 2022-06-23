package cafe;

public class CafeConLeche extends Cafe {
	
	private int leche;

	public CafeConLeche(String tamanoVaso, int palito, int azucar, int servir, int precio, int agua, int cafe,
			int leche) {
		super(tamanoVaso, palito, azucar, servir, precio, agua, cafe);
		this.leche = leche;
	}

	public int getLeche() {
		return leche;
	}

	public void setLeche(int leche) {
		this.leche = leche;
	}
	
	

}
