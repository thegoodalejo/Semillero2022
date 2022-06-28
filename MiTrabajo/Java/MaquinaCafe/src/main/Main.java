package main;

import Entity.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);

		int opcion = 0;
		int size = 0;
		int sugar = 0;
		int whisky = 0;
		int cream = 0;

		do {

			System.out.println("****COFFEE MACHINE****");
			System.out.println("1. Make a Black Coffee");
			System.out.println("2. Make an Irish Coffee");
			System.out.println("0. Salir");
			System.out.print("Seleccione una opcion: ");
			opcion = tc.nextInt();

			switch (opcion) {
				case 1:
	
					System.out.println("Select your preferred size: ");
					System.out.println("1. Small ");
					System.out.println("2. Medium ");
					System.out.println("3. Big ");
					System.out.print("Seleccione:  ");
					size = (int)tc.nextInt();
					
	
					System.out.println("Do you want sugar?: ");
					System.out.println("1. Yes ");
					System.out.println("2. No ");
					System.out.print("Seleccione:  ");
					sugar = (int)tc.nextInt();
	
					if(size > 0 && size <= 3 && sugar > 0 && sugar <= 2) {
						//We make the black coffee
						Coffee blackCoffee = CoffeeMachine.makeBlackCoffee(size, sugar);
						
						//show the ingredients
						blackCoffee.showIngredients();
						
					}else {
						System.out.println("Hay opciones no validas");
					}
					
					break;
					
				case 2:
					
					System.out.println("Select your preferred size: ");
					System.out.println("1. Small ");
					System.out.println("2. Medium ");
					System.out.println("3. Big ");
					System.out.print("Seleccione:  ");
					size = (int)tc.nextInt();
					
	
					System.out.println("Do you want sugar?: ");
					System.out.println("1. Yes ");
					System.out.println("2. No ");
					System.out.print("Seleccione:  ");
					sugar = (int)tc.nextInt();
					
					System.out.println("Do you want add whisky?: ");
					System.out.println("1. Yes ");
					System.out.println("2. No ");
					System.out.print("Seleccione:  ");
					whisky = (int)tc.nextInt();
					
					System.out.println("Do you want add cream?: ");
					System.out.println("1. Yes ");
					System.out.println("2. No ");
					System.out.print("Seleccione:  ");
					cream = (int)tc.nextInt();
	
					if(size > 0 && size <= 3 && sugar > 0 && sugar <= 2 &&
							whisky > 0 && whisky <= 2 && cream > 0 && cream <= 2) {
						
						//We make the Irish coffee
						Coffee irishCoffee = CoffeeMachine.makeIrishCoffee(size, sugar, whisky, cream);
						
						//show the ingredients
						irishCoffee.showIngredients();
						
					}else {
						System.out.println("Hay opciones no validas");
					}
					
					break;
				
				case 0:
					System.out.println("SALIENDO..!");
					break;
				
				default:
					System.out.println("Opcion no valida..!");
					break;
			}

		} while (opcion != 0);

	}
}
