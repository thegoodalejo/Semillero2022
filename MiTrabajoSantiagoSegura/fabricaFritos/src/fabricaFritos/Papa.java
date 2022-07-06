package fabricaFritos;

public class Papa extends Frito  implements Tajar,Abastecer {


	public Papa(int cantidad, String nombre ) {
		
		this.cantidad=cantidad;
	     this.nombre=nombre;
		
}

	@Override
	public void tajar() {
	
		System.out.println("tajar papa en  rodajas delgadas");
	
		
	}
	
	@Override
	public void abastecer() {
	
		System.out.println("abastecer");
		this.cantidad=5;
	
		
	}
	
}
