package proyecto.modelo;

import proyecto.services.*;
import java.util.*;

public class Hamburguesa extends ComidaRapida implements IProteinas, IBase, IVegetales{
	private String proteina, base, vegetales;
	
	Scanner tc = new Scanner(System.in);
	
	public Hamburguesa(double precio, String nombre) {
		super(precio, nombre);
	
		adicionarBase();
		adicionarProteina();
		adicionarVegetales();
		resumenProducto();
	}
	
	
	private void resumenProducto() {
		System.out.println("La hamburguesa de valor: "+getPrecio()+ " "
				+ "con base de: "+getBase()+ ", "
						+ "contiene una proteina de: "+getProteina()+ ", "
								+ "y con vegetal: "+getVegetales()+ ", esta lista");
		
	}


	/*Metodos de creacion de hamburguesa*/
	
	@Override
	public void adicionarVegetales() {
		
		int opcion = 0;
		
		System.out.println("Seleccione el vegetal: \n"
				+ "1: Tomate \n"
				+ "2: Lechuga\n"
				+ "3: Cebolla\n"
				+ "4: Sin vegetales \n");
		
		opcion = (int)tc.nextInt();
		
		switch(opcion) {
			case 1:
				setVegetales("Tomate");
				break;
				
			case 2:
				setVegetales("Lechuga");
				break;
			case 3:
				setVegetales("Cebolla");
				break;
			case 4:
				setVegetales("Sin vegetales");
				break;
			default:
				setVegetales("Sin vegetales");
				break;
		}
	}


	@Override
	public void adicionarBase() {
		
		int opcion = 0;
		
		System.out.println("Seleccione la base: \n"
				+ "1: Pan \n"
				+ "2: Platano\n");
		opcion = (int)tc.nextInt();
		
		switch(opcion) {
			case 1:
				setBase("Pan");
				break;
				
			case 2:
				setBase("Platano");
				break;
				
			default:
				setBase("Pan");
				break;
		}
		
	}


	@Override
	public void adicionarProteina() {
		
		int opcion = 0;
		
		System.out.println("Seleccione la Proteina: \n"
				+ "1: Carne de Res \n"
				+ "2: Carne de Pollo\n");
		
		opcion = (int)tc.nextInt();
		
		switch(opcion) {
			case 1:
				setProteina("Carne de Res");
				break;
				
			case 2:
				setProteina("Carne de Pollo");
				break;
				
			default:
				setProteina("Carne de Res");
				break;
		}
		
	}
	
	
	/****************************************/

	/*Getter & Setter*/
	public String getProteina() {
		return proteina;
	}

	public void setProteina(String proteina) {
		this.proteina = proteina;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public String getVegetales() {
		return vegetales;
	}

	public void setVegetales(String vegetales) {
		this.vegetales = vegetales;
	}
	/****************************************/


}
