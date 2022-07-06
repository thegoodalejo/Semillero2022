package proyecto.modelo;

import java.util.Scanner;

import proyecto.services.*;

public class Salchipapa extends ComidaRapida implements IProteinas, IVegetales {
	Scanner tc = new Scanner(System.in);
	private String proteina, vegetales;
	
	
	public Salchipapa(double precio, String nombre) {
		super(precio, nombre);
		adicionarProteina();
		adicionarVegetales();
		resumenProducto();
	}
	
	private void resumenProducto() {
		System.out.println("La salchipapa de valor: "+getPrecio()+ ", "
						+ "contiene una proteina de: "+getProteina()+ ", "
								+ "y con vegetal: "+getVegetales()+ ", esta lista");
		
	}
	@Override
	public void adicionarVegetales() {
		
		int opcion = 0;
		
		System.out.println("Seleccione el vegetal: \n"
				+ "1: Maiz \n"
				+ "2: Lechuga\n"
				+ "3: Sin vegetales \n");
		
		opcion = (int)tc.nextInt();
		
		switch(opcion) {
			case 1:
				setVegetales("Maiz");
				break;
				
			case 2:
				setVegetales("Lechuga");
				break;
			case 3:
				setVegetales("Sin vegetales");
				break;
			default:
				setVegetales("Sin vegetales");
				break;
		}
	}




	@Override
	public void adicionarProteina() {
		
		int opcion = 0;
		
		System.out.println("Seleccione la Proteina: \n"
				+ "1: Carne de Res \n"
				+ "2: Pollo\n"
				+ "3: Salchicha de cerdo \n"
				+ "4: Chicharron \n");
		
		opcion = (int)tc.nextInt();
		
		switch(opcion) {
			case 1:
				setProteina("Carne de Res");
				break;
				
			case 2:
				setProteina("Pollo");
				break;
			case 3: 
				setProteina("Salchicha de cerdo");
				break;
			case 4:
				setProteina("Chicharron");
			default:
				setProteina("Carne de Res");
				break;
		}
		
	}
	public String getProteina() {
		return proteina;
	}
	public void setProteina(String proteina) {
		this.proteina = proteina;
	}
	public String getVegetales() {
		return vegetales;
	}
	public void setVegetales(String vegetales) {
		this.vegetales = vegetales;
	}

	
}
