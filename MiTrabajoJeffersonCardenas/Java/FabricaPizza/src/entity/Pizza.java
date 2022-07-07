package entity;

import java.util.*;

import controller.Warehouse;
import services.IDough;
import services.IType;
import services.IVegetable;
import supplements.*;

public class Pizza implements IDough, IType, IVegetable {
	
	private String doughSize;
	private String type;
	private String vegetable;
	
	private int opcion;
	Scanner tc = new Scanner(System.in);
	
	public Pizza() {
		
		System.out.println("");
		System.out.println("Entering phase 1...");
		
		System.out.println("");
		selectSizeDough();
		System.out.println("***********************");
		System.out.println("");
		
		System.out.println("Moving to phase 2...");
		System.out.println("");
		
		selectTypePizza();
		System.out.println("***********************");
		System.out.println("");
		
		System.out.println("Moving to phase 3...");
		System.out.println("");
		
		selectVegetable();
		System.out.println("***********************");
		System.out.println("");
		
		Warehouse.productAmount++;
		
	}

	/* Faces de creacion */

	@Override
	public void selectSizeDough() {

		System.out.println("SIZE DOUGH");
		System.out.println("1. Small");
		System.out.println("2. Big");
		System.out.print("Select the pizza size: ");
		opcion = (int) tc.nextInt();

		switch (opcion) {
		case 1:
			
			Warehouse.reduceAmount("Small", 1);
			this.doughSize = "Small";

			break;

		case 2:

			Warehouse.reduceAmount("Big", 1);
			this.doughSize = "Big";

			break;

		default:

			Warehouse.reduceAmount("Small", 1);
			this.doughSize = "Small";

			break;
		}

	}

	@Override
	public void selectTypePizza() {
		
		System.out.println("TYPE PIZZA");
		System.out.println("1. Pepperoni");
		System.out.println("2. Pineapple");
		System.out.print("Select the pizza type: ");
		opcion = (int) tc.nextInt();

		switch (opcion) {
		case 1:
			
			Warehouse.reduceAmount("Pepperoni", Warehouse.selectQuantity());
			
			type = "Pepperoni";
			break;

		case 2:
			
			Warehouse.reduceAmount("Pineapple", Warehouse.selectQuantity());
			type = "Pinapple";
			break;

		default:
			
			Warehouse.reduceAmount("Pepperoni", Warehouse.selectQuantity());
			type = "Pepperoni";
			break;
		}

	}

	@Override
	public void selectVegetable() {

		System.out.println("VEGETABLES");
		System.out.println("1. Parsley");
		System.out.println("2. Thyme");
		System.out.print("Select the vegetable: ");
		opcion = (int) tc.nextInt();

		switch (opcion) {
		case 1:
			Warehouse.reduceAmount("Parsley", Warehouse.selectQuantity());
			vegetable = "Parsley";
			break;

		case 2:
			
			Warehouse.reduceAmount("Thyme", Warehouse.selectQuantity());;
			vegetable = "Thyme";
			
			break;

		default:
			Warehouse.reduceAmount("Parsley", Warehouse.selectQuantity());
			vegetable = "Parsley";
			break;
		}

	}

	/**********************************************/
	
	/*GETTER & SETTER*/
	public String getDoughSize() {
		return doughSize;
	}

	public void setDoughSize(String doughSize) {
		this.doughSize = doughSize;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVegetable() {
		return vegetable;
	}

	public void setVegetable(String vegetable) {
		this.vegetable = vegetable;
	}
		

}
