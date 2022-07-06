package com.furniture.materials;

import java.util.ArrayList;

public class Material {
	
	public String name;
	public double size;
	
	public static ArrayList<Material> lstMaterials = new ArrayList<Material>();
	
	public Material(String name, double size) {
		this.name = name;
		this.size=size;
		addStorage();
	}
	
	public void addStorage() {
		lstMaterials.add(this);
		new Storage(this);
	}
}
