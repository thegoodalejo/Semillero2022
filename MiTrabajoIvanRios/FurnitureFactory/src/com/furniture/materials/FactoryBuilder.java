package com.furniture.materials;

import java.util.ArrayList;

public abstract class FactoryBuilder {
	
	public Product product;
	public Material piece1;
	public Material piece2;
	private boolean state = false;
	private String info;
	
	public FactoryBuilder(Product product, Material piece1, Material piece2) {
		this.product = product;
		this.piece1 = piece1;
		this.piece2 = piece2;
		this.setState(true);
		this.info = getInfo();
		this.product.lstFactoryBuilders.add(this);
		}
	
	public abstract String getInfo();

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	} 
	
}
