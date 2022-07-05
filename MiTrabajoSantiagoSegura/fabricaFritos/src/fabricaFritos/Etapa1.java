package fabricaFritos;

import java.util.Scanner;

public class Etapa1 {

	
	Scanner entrada= new Scanner(System.in);
	Frito frito;
	
	public Frito producir() {
		System.out.println("ingrese el alimento");
		
		String alimento= entrada.next();
		
		
		switch (alimento) {
		case "papa": {
			
		
		
		
		
			System.out.println("Ingrese la cantidad de papas");
			int cantidad=entrada.nextInt();
			
			
			
			Papa papa=new Papa( cantidad);
			 papa.tajar();
			papa.cantidad=5-cantidad;
			if(cantidad<5) {
				System.out.println("se abastecera con "+cantidad+" papas");
				papa.abastecer();
				
			}
			frito=papa;
			return frito;
			
		}
        case "platano": {
        	
			
		
			System.out.println("Ingrese la cantidad de platanos");
			int cantidad=entrada.nextInt();
			
			Platano platano=new Platano( cantidad);
			platano.tajar();
			platano.cantidad=5-cantidad;
			if(cantidad<5) {
				System.out.println("se abastecera con "+cantidad+" papas");
				platano.abastecer();
				
			}
			frito=platano;
			return frito;
			
		}
		default:
		  
			return null;
		}
		
		
		
	}
	
	
	


}
	
	

