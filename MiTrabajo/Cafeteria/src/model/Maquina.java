package model;

public class Maquina {
	
	
	
	public static void hacerCafe(Cafe cafe){
		System.out.println("Preparando caf�...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Empezando a servir...");
		servirCafe();
		
	}

	private static void servirCafe() {
		System.out.println("Caf� listo en ... \n3");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("2");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void construirCafe(String tipo, int cantidad, int tipoGrano) {
		String tipoDeGrano = "";
		switch (tipoGrano) {
		case 1:
			tipoDeGrano= "Caf� ar�bica";
			break;
		case 2:
			tipoDeGrano = "Caf� lib�rica";
		default:
			break;
		}
		
		Cafe cafe = new Cafe(tipo, cantidad, tipoDeGrano);
		hacerCafe(cafe);
		System.out.println("Retire su caf� "+tipo+" \nGracias por usar, vuelva pronto");
	}
}
