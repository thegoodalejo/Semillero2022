package fibonacci;

import java.util.Iterator;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int num = tc.nextInt();
		int num1 = 1;
		int num2 = 1;
		System.out.print(" "+num1);
		for(int i = 2; i <= num; i++) {
			System.out.print(" "+num2);
			num2 = num1 + num2;
			num1 = num2 - num1;
			}
		}
	}







//	
//}