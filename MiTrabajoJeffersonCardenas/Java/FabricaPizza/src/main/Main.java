package main;

import java.util.*;
import controller.Factory;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		int opcion = 0;
		
		do {
			
			System.out.println("FACTORY´S PIZZA");
			System.out.println("1. Pizza");
			System.out.println("0. Exit");
			System.out.print("Select an option: ");
			opcion = (int)tc.nextInt();
			
			switch (opcion) {
			case 1:
				Factory.createPizza();
				break;

			case 0:
				System.out.println("Good Bye..!");
				break;
				
			default:
				System.out.println("Invalid option");
				break;
			}
		}while(opcion != 0);
		
	}

}
