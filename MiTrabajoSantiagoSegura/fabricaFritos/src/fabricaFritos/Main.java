package fabricaFritos;

import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		
		Scanner entrada= new Scanner(System.in);
		int opcion;
		
		
		do {
		
			Etapa1 etapa1 = new Etapa1();
			Etapa2 etapa2= new Etapa2();
			Etapa3 etapa3= new Etapa3();
			etapa1.producir();
			etapa2.fritar();
			etapa3.empacar();
			System.out.println("si desea hacer un producto marque 1, y si quieres salir marca otro numero");
			opcion=entrada.nextInt();
		} while (opcion!=1);
		
		
		
	}
	
	
	
}
