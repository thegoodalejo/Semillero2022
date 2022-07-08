package fabricaPicadas;

import java.util.ArrayList;
import java.util.Scanner;

public class Insumo {

	int cantidadInsumo;
	String tipo;
	
	public static ArrayList<Insumo> lstInsumo = new ArrayList<Insumo>();

	public Insumo(int cantidadDisponible, String tipo) {
		super();
		this.cantidadInsumo = cantidadDisponible;
		this.tipo = tipo;
	}

	
	
	public void agregarInsumo(Insumo insumo) {
		lstInsumo.add(insumo);
	}

	public int getCantidadDisponible() {
		return cantidadInsumo;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadInsumo = cantidadDisponible;
	}

	public static void listar() {
		
		System.out.println("Pedidos Creados: \n");
		for (Insumo insumo : lstInsumo) {
			System.out.println(insumo.tipo+" :"+ insumo.cantidadInsumo);
		
		}
		
	}

	

}
