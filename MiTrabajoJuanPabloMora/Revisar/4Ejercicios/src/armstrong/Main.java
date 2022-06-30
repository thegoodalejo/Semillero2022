package armstrong;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int numA=0;
		int numB=0;
		int opcion =0;
		Scanner leer=new Scanner(System.in);
		System.out.println("Digite los numeros A y B tenga en cuenta las siguientes restricciones  ");
		System.out.println("· A debe ser menor que B  ");
		System.out.println("· A y B deben de ser enteros  ");
		System.out.println("· A y B no pueden ser números negativos  ");
		
        do {
        	System.out.println("Digite el numero A: ");
        	numA=leer.nextInt();
        	if(numA<0) {
        		System.out.println("Error el numero no puede ser NEGATIVO, por favor lea las restricciones");
        	}else {
        		opcion=1;
        	}
        	
        } while (opcion!=1);
        opcion=0;
        do {
        	System.out.println("Digite el numero B: ");
        	numB=leer.nextInt();
        	if(numB<0) {
        		System.out.println("Error el numero B no puede ser NEGATIVO, por favor lea las restricciones");
        	}else if(numB<numA){
        		System.out.println("Error el numero B no puede ser menor que A, por favor lea las restricciones");
        	}else {
        		opcion=1;
        	}
        } while (opcion!=1);
        
        
        for( int i = numA+1; i<numB; i++) {
        	System.out.println(i);
        }


	}

}
