package fabricaFritos;

public class Aceite implements Abastecer {

	public static int litros;
	public  String tipoAceite;
	

	public void Aceite(int litros,String tipoAceite) {
		this.litros=litros;
		this.tipoAceite=tipoAceite;
		
	}


	@Override
	public void abastecer() {
	
		litros=5;
		
	}
	

	
}
