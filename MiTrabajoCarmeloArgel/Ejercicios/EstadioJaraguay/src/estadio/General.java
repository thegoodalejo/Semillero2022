package estadio;

public class General extends Aficionado {

	public General(String nombre, int edad, String sexo, String tipo) {
		super(nombre, edad, sexo, tipo);
	}
	
	public void nombreAficionadoGeneral() {
		
		System.out.println("El nombre del aficionado general es: "+nombre);
	}

	

}
