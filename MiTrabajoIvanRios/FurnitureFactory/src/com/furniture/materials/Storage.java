package com.furniture.materials;

import java.util.ArrayList;

public class Storage {
	
	public Material material;
	
	private int quantity;
	private String className;
	
	public static ArrayList<Storage> lstStored = new ArrayList<Storage>();
	
	public Storage(Material material) {
		this.material = material;
		this.quantity = 5;
		this.className = material.getClass().getSimpleName();
		lstStored.add(this);
	}
	
	public String addMaterialQuantity(Material material, int quantity)
	{
		if (quantity>3) {
			return "Cantidad de "+material.name+" debe ser menor de tres (3)...";
		}else {
			this.quantity+=quantity;
			return "Cantidad de "+material.name+" actualizada correctamente";
		}
	}
	
	public boolean getMaterial(Material material, int quantity) {
		if(this.quantity<quantity) {
			return false;
		}else {
			this.quantity-=quantity;
			return true;
		}
	}
	
	public void summary() {
		System.out.println("***Informacion del material***"+"\n");
		System.out.println("Tipo: "+this.className);
		System.out.println("Nombre: "+this.material.name);
		System.out.println("Tamanio: "+this.material.size);
		System.out.println("Cantidad: "+this.quantity);
	}

	public String getClassName() {
		return className;
	}

	
}
