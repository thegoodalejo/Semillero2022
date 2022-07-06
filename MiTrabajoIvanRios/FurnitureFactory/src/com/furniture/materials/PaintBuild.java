package com.furniture.materials;

public class PaintBuild extends FactoryBuilder {

	public PaintBuild(Product product, Material painting, Material varnish) {
		super(product, painting, varnish);
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "It was added a layer of "+this.piece1.name+" with a layer of "+this.piece2.name;
	}

}
