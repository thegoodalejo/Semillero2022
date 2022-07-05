package controller;

import entity.Pizza;

public class Factory {
	
	public static void createPizza() {
		
		Pizza pizza = new Pizza();
		
		System.out.println("Entering phase 1...");
		pizza.setSize(pizza.selectSizeDough());
		
		System.out.println("Moving to phase 2...");
		pizza.setType(pizza.selectTypePizza());
		
		System.out.println("Moving to phase 3...");
		pizza.setVegetable(pizza.selectVegetable());
		
		Factory.resume(pizza);
		
	}
	
	public static void resume(Pizza pizza) {
		System.out.println("");
		System.out.println("***********************************************");
		System.out.println("The pizza was successfully created... :)");
		System.out.println("Ingredients:");
		System.out.println("Size: " + pizza.getSize());
		System.out.println("Type: " + pizza.getType());
		System.out.println("Vegetable: " + pizza.getVegetable());
		System.out.println("***********************************************");
		System.out.println("");
	}

}
