package fabricaFritos;

public class Empaque implements Abastecer {
    
	String mateiral;
	int cantidad;
	public Empaque(String material, int cantidad) {
		this.mateiral=material;
		this.cantidad=cantidad;
	}
	@Override
	public void abastecer() {
		
		System.out.println("abastecer");
		this.cantidad=5;
		
	}
	
	
	
}
