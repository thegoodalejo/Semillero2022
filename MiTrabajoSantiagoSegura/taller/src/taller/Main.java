package taller;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	 int[] numeros= {5,7,2,4,1};
	int contador=0;

	for(int i=0;i<4;i++) {
		
		for(int j=0;j<4;j++) {
			if(numeros[i]>numeros[j]) {
				contador= numeros[i];
				numeros[j]=contador;
				
			}
		}
		
	}
	
	for(int i=0;i<4;i++) {
		System.out.print(numeros[i]);
	}

	for(int i=0;i<4;i++) {
		
		for(int j=0;j<4;j++) {
			if(numeros[i]<numeros[j]) {
				contador= numeros[i];
				numeros[j]=contador;
				
			}
		}
		
	}
	
	for(int i=0;i<4;i++) {
		System.out.print("\n"+numeros[i]);
	}
	
	
	
	//pumto 2
	int n=0;
	Scanner leer = new Scanner(System.in);
	Hanoi h= new Hanoi();
	System.out.println("ingrese el numero de arcos");
	h.Hanoi(n, 1, 2, 3);

}

}
