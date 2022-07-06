package com.furniture.materials;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadMaterials();
	}

	public static void loadMaterials() {
		//
		
		Material pine = new WoodPiece("Pine",40);
		Material philips = new Screw("Philips",2);
		Material glue = new Glue("Glue",30);
		Material fiveHSandpaper = new Sandpaper("Five Hundred Sandpaper", 500);
		Material polyesterRedPaint = new Painting("Polyester Red Paint",1);
		Material mateVarnish = new Varnish("Varnish Mate Mode",0.375);
		
		Material oak = new WoodPiece("Oak",85);
		Material drywall = new Screw("Drywall",4);
		Material gum = new Glue("Gum",45);
		Material oneHTwentySandpaper = new Sandpaper("One Hundred Twenty Sandpaper", 120);
		Material polyesterBluePaint = new Painting("Polyester Blue Paint",2);
		Material shinningVarnish = new Varnish("Varnish Shinning Mode",0.625);
		
			
		
	}
}
