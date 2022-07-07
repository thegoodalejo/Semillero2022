package controller;

import entity.Pizza;

public class Factory {
	
	public static void createPizza() {
		
		Pizza pizza = new Pizza();
		
		Factory.resume(pizza);
		
	}
	
	public static void resume(Pizza pizza) {
		System.out.println("");
		System.out.println("***********************************************");
		System.out.println("The pizza was successfully created... :)");
		System.out.println("Ingredients:");
		System.out.println("Size: " + pizza.getDoughSize());
		System.out.println("Type: " + pizza.getType());
		System.out.println("Vegetable: " + pizza.getVegetable());
		System.out.println("***********************************************");
		System.out.println("");
	}

}
