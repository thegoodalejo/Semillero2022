package com.furniture.materials;

import java.util.ArrayList;

public class Product {
	
	private int id;
	private String name;
	public ArrayList<FactoryBuilder> lstFactoryBuilders = new ArrayList<FactoryBuilder>();
	
	public static ArrayList<Product> lstProducts = new ArrayList<Product>();
	
	public Product(int id, String name) {
		this.id = id + 1;
		this.name = name;
		
		lstProducts.add(this);
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	

	

}
