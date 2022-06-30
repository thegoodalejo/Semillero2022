package proyecto.modelo;

import java.util.ArrayList;
import java.util.Scanner;

import proyecto.services.IBase;
import proyecto.services.IVegetales;

public class Ensalada extends ComidaRapida implements IVegetales, IBase {
	Scanner tc = new Scanner(System.in);
	private String vegetales, base;
	ArrayList<String> vegetalesEnEnsalada = new ArrayList<String>();

	public Ensalada(double precio, String nombre) {
		super(precio, nombre);
		adicionarBase();
		adicionarVegetales();
		resumenProducto();
	}
	private void resumenProducto() {
		System.out.println("La ensalada de valor: "+getPrecio()+ " "
				+ "con base de: "+getBase()+ ", "
								+ "y con vegetales : "+getListaVegetales()+ " esta lista");
		
	}
	
	private String getListaVegetales() {
		String vegetales ="";
		for (String vegetal : vegetalesEnEnsalada) {
			vegetales += vegetal+", ";
		}
		return vegetales;
	}
	@Override
	public void adicionarVegetales() {
	System.out.println("Seleccione 4 vegetales");	
		int opcion = 0;
		int i=0;
		do {
			System.out.println("Seleccione el vegetal: \n"
					+ "1: Maiz \n"
					+ "2: Tomate \n"
					+ "3: Repollo \n"
					+ "4: Zanahoria \n"
					+ "5: Cebolla \n");
		

		opcion = (int)tc.nextInt();
		
		switch(opcion) {
			case 1:
				setVegetales("Maiz");
				break;
				
			case 2:
				setVegetales("Tomate");
				break;
			case 3:
				setVegetales("Repollo");
				break;
			case 4:
				setVegetales("Zanahoria");
				break;
			case 5:
				setVegetales("Cebolla");
				
			default:
				setVegetales("Sin vegetales");
				break;
		}
		vegetalesEnEnsalada.add(getVegetales());
		i++;
		}while(i<=3);		
	}
	
	@Override
	public void adicionarBase() {
		
		int opcion = 0;
		
		System.out.println("Seleccione la base: \n"
				+ "1: Lechuga \n"
				+ "2: Espinaca \n");
		opcion = (int)tc.nextInt();
		
		switch(opcion) {
			case 1:
				setBase("Lechuga");
				break;
				
			case 2:
				setBase("Espinaca");
				break;
				
			default:
				setBase("Lechuga");
				break;
		}
		
	}

	public String getVegetales() {
		return vegetales;
	}

	public void setVegetales(String vegetales) {
		this.vegetales = vegetales;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

}
