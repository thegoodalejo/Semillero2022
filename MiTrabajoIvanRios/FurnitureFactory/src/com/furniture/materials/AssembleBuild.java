package com.furniture.materials;

public class AssembleBuild extends FactoryBuilder{

	public AssembleBuild(Material woodPiece, Material screw) {
		super(woodPiece, screw);
	}
	
	@Override
	public String getInfo() {
		
		return "The wood "+this.piece1.name+" piece(s) and the "+this.piece2.name+" screw(s) were assembled successfully";
	}
	
}
