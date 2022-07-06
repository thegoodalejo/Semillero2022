package com.furniture.materials;

public abstract class FactoryBuilder {
	
	public Material piece1;
	public Material piece2;
	private String info;

	
	public FactoryBuilder(Material piece1, Material piece2) {
		this.piece1 = piece1;
		this.piece2 = piece2;
		this.info = getInfo();
	}
	
	public abstract String getInfo(); 
	
}
