package com.furniture.materials;

public class AssembleBuild extends FactoryBuilder{

	public AssembleBuild(Product product, Material woodPiece, Material screw) {
		super(product, woodPiece, screw);
	}
	
	@Override
	public String getInfo() {
		
		return "The wood "+this.piece1.name+" piece(s) and the "+this.piece2.name+" screw(s) were assembled successfully";
	}
	
}
