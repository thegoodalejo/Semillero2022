package proyecto.modelo;

import java.util.Scanner;

import proyecto.services.IBase;
import proyecto.services.IBebida;
import proyecto.services.IProteinas;
import proyecto.services.IVegetales;

public class Falafel extends ComidaRapida implements IBase, IProteinas, IVegetales, IBebida {

	private String proteina, base, vegetales, bebida;
	Scanner tc = new Scanner(System.in);

	public Falafel(double precio, String nombre) {
		super(precio, nombre);
		adicionarBase();
		adicionarProteina();
		adicionarVegetales();
		adicionarBebida();
		resumenProducto();

	}

	@Override
	public void adicionarVegetales() {
		int opcion = 0;

		System.out.println(
				"Seleccione el vegetal: \n" + "1: Tomate \n" + "2: Lechuga\n" + "3: Cebolla\n" + "4: Sin vegetales \n");

		opcion = (int) tc.nextInt();

		switch (opcion) {
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
	public void adicionarProteina() {
		int opcion = 0;

		System.out.println("Seleccione la Proteina: \n" + "1: Carne de Garbanzos \n" + "2: Carne de Falafel \n");

		opcion = (int) tc.nextInt();

		switch (opcion) {
		case 1:
			setProteina("Carne de Garbanzos");
			break;

		case 2:
			setProteina("Carne de Falafel");
			break;

		default:
			setProteina("Carne de Falafel");
			break;
		}

	}

	@Override
	public void adicionarBase() {
		int opcion = 0;

		System.out.println("Seleccione la base: \n" + "1: Pan Pita \n" + "2: Pan Frances \n");
		opcion = (int) tc.nextInt();

		switch (opcion) {
		case 1:
			setBase("Pan Pita");
			break;

		case 2:
			setBase("Pan Frances");
			break;

		default:
			setBase("Pan Pita");
			break;
		}

	}

	@Override
	public void adicionarBebida() {
		int opcion = 0;

		System.out.println("Seleccione la bebida: \n" + "1: gaseosa Coca Cola \n" + "2: Agua \n");
		opcion = (int) tc.nextInt();

		switch (opcion) {
		case 1:
			setBebida("Coca Cola");
			break;

		case 2:
			setBebida("Agua");
			break;

		default:
			setBebida("Agua");
			break;
		}

	}
	
	private void resumenProducto() {
		System.out.println("El Falafel de valor: "+getPrecio()+ " "
				+ "con base de: "+getBase()+ ", "
						+ "contiene una proteina de: "+getProteina()+ ", "
								+ "con vegetal: "+getVegetales()+
								 "y acompañado con bebida: "+getBebida()+ ", esta listo");
		
	}

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

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

}
