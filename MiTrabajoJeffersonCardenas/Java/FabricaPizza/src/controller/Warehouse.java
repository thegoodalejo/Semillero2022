package controller;

import entity.*;
import java.util.*;

public class Warehouse {

	public static List<Food> foods = new ArrayList();
	public static int supplyAmount = 0;
	public static int productAmount = 0;
	static Scanner tc = new Scanner(System.in);

	public static void initWarehouse() {
		Food pepperoni = new Food("Pepperoni");
		Food pineaple = new Food("Pineapple");
		Food doughSmall = new Food("Dough Small");
		Food doughBig = new Food("Dough Big");
		Food thyme = new Food("Thyme");
		Food parsley = new Food("Parsley");
	}

	public static void reduceAmount(String name, int cantidad) {
		for (Food item : foods) {

			if (item.getName().equals(name)) {

				if (item.getStock() > 0 && cantidad < item.getStock()) {

					item.setStock(item.getStock() - cantidad);

				} else {
					supply(name);
					reduceAmount(name, cantidad);
				}

			}
		}
	}

	public static void supply(String name) {

		supplyAmount++;

		for (Food item : foods) {

			if (item.getName().equals(name)) {

				System.out.println("Abasteciendo " + name + "...!");
				item.setStock(item.getStock() + 3);
			}
		}
	}

	public static int selectQuantity() {
		int quantity = 0;
		
		do {
			
			System.out.print("Select the quantity between 1 - 5: ");
			quantity = (int)tc.nextInt();
			
			if(quantity > 0 && quantity <= 5) {
				break;
			}
			
		}while(quantity < 0 && quantity > 5);
		
		return quantity;
	}

	public static void resumen() {
		System.out.println("RESUMEN");
		for (Food item : foods) {
			System.out.println(item.getName() + " -- " + item.getStock());
		}
		System.out.println("");
		System.out.println("Number of supply: " + supplyAmount);
		System.out.println("Number of Products created: " + productAmount);
		System.out.println("*******************************");
	}
}
