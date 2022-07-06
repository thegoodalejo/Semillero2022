package entity;

import controller.Warehouse;

public class Food extends Warehouse{
	
	private int stock;
	private String name;
	
	public Food(String name) {
		this.stock = 5;	
		this.name = name;
		foods.add(this);
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
