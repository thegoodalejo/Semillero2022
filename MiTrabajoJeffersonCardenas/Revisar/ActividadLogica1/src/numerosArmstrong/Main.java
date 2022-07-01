package numerosArmstrong;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;

		
		System.out.println("Ingrese el primer valor: ");
		a = (int)tc.nextInt();
		
		System.out.println("Ingrese el segundo valor: ");
		b = (int)tc.nextInt();
		
		if(a <= 0 || b <= 0 ) {
			
			System.out.println("Lo numeros no deben ser negativos");
			
		}else {
			
			if(a < b) {
				
				imprimirNumerosArmstrong(a, b);
				
			}else {
				System.out.println("El primer numero debe ser mayor al segundo");
			}
		}
		
	}
	
	public static void imprimirNumerosArmstrong(int inicio, int fin) {
		
		System.out.println("Los numeros Armstrong que hay entre " + inicio + " y " + fin + " son: ");
		
		for(int i = inicio; i <= fin; i++) {
			
			if(esNumeroArmstrong(i)) {
				System.out.println(i);
			}
		}
		
		System.out.println("***************************************");
	}
	
	public static boolean esNumeroArmstrong(Integer numero) {
		
		String[] numeroSplit = numero.toString().split("");
		int numeroTemp = 0;
		boolean esArmstrong = false;
		
		for(String digito : numeroSplit) {
			numeroTemp += ((int)(Math.pow(Integer.parseInt(digito), numeroSplit.length)));
		}
		
		if(numero == numeroTemp) {
			esArmstrong = true;
		}
		
		return esArmstrong;
	}

}




