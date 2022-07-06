package fabricaFritos;

public class Platano extends Frito implements Tajar,Abastecer {

	
	public Platano(int cantidad, String nombre) {
	
	
		this.cantidad=cantidad;
		this.nombre=nombre;
	}

	@Override
	public void tajar() {
	
		System.out.println("tajar platano en  chips delgadas");
		
		
	}

	@Override
	public void abastecer() {
		System.out.println("abastecer");
		this.cantidad=5;		
	}
	
	
	


}
