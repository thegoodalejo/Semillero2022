package Amstrong;

import java.util.Scanner;

public class NumeroAmstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		int numA = sc.nextInt();
		System.out.println("Ingrese el primer numero: ");
		int numB = sc.nextInt();
		
		if(numA > 0 && numB > 0) {
			if(numA < numB) {
				for(int i=numA; i<numB;i++) {
					int numAms=0;
					int digito =0;
					int sumaDig = 0;
					numAms = i;
					while(numAms != 0) {
						digito = numAms % 10;
						sumaDig = sumaDig + digito*digito+digito;
						numAms /= 10;
					}
					if(sumaDig == i) {
						System.out.println(i);
					}
				}
				
			}
		}
		

	}

}
