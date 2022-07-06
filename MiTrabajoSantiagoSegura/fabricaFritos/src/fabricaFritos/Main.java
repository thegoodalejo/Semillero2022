package fabricaFritos;

import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		
		Scanner entrada= new Scanner(System.in);
		int opcion;
		Etapa1 etapa1 = new Etapa1();
		Etapa2 etapa2= new Etapa2();
		Etapa3 etapa3= new Etapa3();
		
		do {
		
			
			etapa1.producir();
			etapa2.fritar();
			etapa3.empacar();
			System.out.println("Hola si deseas hacer un producto marca un numero deiferente a 1");
			opcion=entrada.nextInt();
		} while (opcion!=1);
		
		System.out.println("____________Resumen ultimo producto______________");
		System.out.println("Nombre: "+etapa1.frito.nombre);
		System.out.println("Cantidad utilizada: "+etapa1.cantidadGastada);
		
		
		
		
		
		
	}
	
	
	
}
