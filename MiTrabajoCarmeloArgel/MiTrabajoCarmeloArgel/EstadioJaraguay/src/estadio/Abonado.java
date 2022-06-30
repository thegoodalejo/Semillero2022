package estadio;

public class Abonado extends Aficionado {


	public Abonado(String nombre, int edad, String sexo, String tipo) {
		super(nombre, edad, sexo, tipo);
	
	}
	
	public void nombreAbonado() {
		
		System.out.println("El nombre del aficionado abonado es: "+nombre);
	}
	


}
