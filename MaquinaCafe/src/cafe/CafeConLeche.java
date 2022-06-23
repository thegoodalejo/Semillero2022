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


	public void cuenta(CafeConLeche obj) {
		
		System.out.println("Gracias por tu compra, vuelve pronto:");
		System.out.println("*************************************");
		System.out.println("Tu Cafe Con Leche:");
		System.out.println("Tamaño de Vaso:"+obj.getTamanoVaso());
		if(obj.getAzucar()==1) {
			System.out.println("Azucar:SI");
		}else {
			System.out.println("Azucar:NO");
		}
		if(obj.getPalito()==1) {
			System.out.println("Pitillo:SI");
		}else {
			System.out.println("Pitillo:NO");
		}
		if(obj.getServir()==1) {
			System.out.println("Para llevar:SI");
		}else {
			System.out.println("Para llevar:NO");
		}
		System.out.println("Porcentaje de Agua:"+obj.getAgua());
		System.out.println("Porcentaje de Leche:"+obj.getLeche());
		System.out.println("Porcentaje de Cafe:"+obj.getCafe());
		System.out.println("El total de tu compra es:"+obj.getPrecio()+" pesos");
		System.out.println("*************************************");
		
	}
	

	
	

}
