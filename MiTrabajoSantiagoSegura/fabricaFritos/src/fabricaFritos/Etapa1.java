package fabricaFritos;

import java.util.ArrayList;
import java.util.Scanner;

public class Etapa1 {

	
	Scanner entrada= new Scanner(System.in);
	Frito frito;
	public static int cantidadGastada;
	ArrayList<Frito> listaFritos;
	public Frito producir() {
		System.out.println("ingrese el alimento");
		
		String alimento= entrada.next();
		
		
		switch (alimento) {
		case "papa": {
			
		
		
		
		
			System.out.println("Ingrese la cantidad de papas");
			int cantidad=entrada.nextInt();
			
			
			
			Papa papa=new Papa( cantidad,"PAPA");
			 papa.tajar();
			 
			papa.cantidad=5-cantidad;
			
			do {
				
				System.out.println("no se puede agregar mas de tres unidades, intente de nuevo");
				cantidad=entrada.nextInt();
				
				
			} while (cantidad>3);
			cantidad=cantidadGastada;
			
			 papa.tajar();
			
			
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
			
			Platano platano=new Platano( cantidad,"PLATANO");
			
			platano.cantidad=5-cantidad;
do {
				
				System.out.println("no se puede agregar mas de tres unidades, intente de nuevo");
				cantidad=entrada.nextInt();
				
				
			} while (cantidad>3);
cantidad=cantidadGastada;
platano.tajar();
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
	
	

