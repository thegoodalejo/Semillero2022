package fibonacci;

import java.util.Scanner;

public class testFibonacci {
	
	static Scanner scanner = new Scanner(System. in);
	static int a;
	public static void main(String[] args) {
		System.out.println("Cual es el numero de la serie a obtener?");
		a = scanner.nextInt();
		
		obtenerSerie(a);
	}
	private static void obtenerSerie(int a) {
		int contador=0;
		int anterior=0;
		if(a==0) {
			System.out.println("El numero N de la serie es: "+contador);
		}
		if(a==1) {
			System.out.println("El numero N de la serie es: "+(contador+1));
		}

		for (int i = 0;  i<=a-2 ; i++) {
			if(i==0 || i==1) {
				anterior=contador;
				contador=contador+1;
				
			}else {
				
				contador=contador+anterior;
				anterior=contador-anterior;
			}
			
			if(i==(a-2)) {
				System.out.println("El numero N de la serie es: "+contador);
			}

		}
	}

}
