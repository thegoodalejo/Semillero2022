package entity;
import java.util.*;
import services.IDough;
import services.IType;
import services.IVegetable;

public class Pizza implements IDough, IType, IVegetable{

	private String size;
	private String type;
	private String vegetable;
	private int opcion;
	Scanner tc = new Scanner(System.in);

//	public Pizza(String size, String type, String vegetable) {
//		this.size = size;
//		this.type = type;
//		this.vegetable = vegetable;
//	}
	
	/*Faces de creacion*/
	
	@Override
	public String selectSizeDough() {
		
		String sizeDough = "";
		
		System.out.println("SIZE DOUGH");
		System.out.println("1. Small");
		System.out.println("2. Medium");
		System.out.println("3. Big");		
		System.out.print("Select the pizza size: ");
		opcion = (int)tc.nextInt();
		
		switch(opcion) {
			case 1:
				sizeDough = "Small";
				break;
				
			case 2:
				sizeDough = "Medium";
				break;
				
			case 3:
				sizeDough = "Big";
				break;
				
			default:
				sizeDough = "Small";
				break;
		}
		
		return sizeDough;
	}
	
	@Override
	public String selectTypePizza() {
		
		String typePizza = "";
		
		System.out.println("TYPE PIZZA");
		System.out.println("1. Pepperoni");
		System.out.println("2. Pinaple");		
		System.out.print("Select the pizza type: ");
		opcion = (int)tc.nextInt();
		
		switch(opcion) {
			case 1:
				typePizza = "Pepperoni";
				break;
				
			case 2:
				typePizza = "Pinaple";
				break;
				
			default:
				typePizza = "Pepperoni";
				break;
		}
		
		return typePizza;
		
	}
	
	@Override
	public String selectVegetable() {
		
		String vegetable = "";
		
		System.out.println("VEGETABLES");
		System.out.println("1. Parsley");
		System.out.println("2. Thyme");		
		System.out.print("Select the vegetable: ");
		opcion = (int)tc.nextInt();
		
		switch(opcion) {
			case 1:
				vegetable = "Parsley";
				break;
				
			case 2:
				vegetable = "Thyme";
				break;
				
			default:
				vegetable = "Parsley";
				break;
		}
		
		return vegetable;
		
	}

	/**********************************************/
	
	/*GETTER & SETTER*/
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
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

	/******************************************/


}
