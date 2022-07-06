package com.furniture.materials;

public class DetailBuild extends FactoryBuilder {

	public DetailBuild(Product product, Material glue, Material sandpaper) {
		super(product, glue, sandpaper);
	}

	@Override
	public String getInfo() {
		return "The wood was pasted with "+this.piece1.name+" and it was sanding with "+this.piece2.name;
	}
	
}
