package fabricaPicadas;

import java.util.ArrayList;
import java.util.Scanner;

public class Fabrica {
	int stockRes = 5;
	int stockCerdo = 5;
	int stockPapa = 5;
	int stockPlatano = 5;
	int stockGuacamole = 5;
	int stockAji = 5;
	int contProductos=0;
	ArrayList<String> lstProductos = new ArrayList<String>();
	Scanner scanner = new Scanner(System.in);

	public void vender() {
		String descripcionProducto="";
		contProductos++;
		int opcion, cantidadPorciones = 6;

		// ETAPA1
		System.out.println(
				"Seleccione el producto a adicionar en la ETAPA 1 a la PICADA: \n\n" + "1. Res\n" + "2. Cerdo");

		opcion = scanner.nextInt();

		while (cantidadPorciones > 5) {
			System.out.println("Ingrese la cantidad de porciones que desea incluir a la PICADA:");
			cantidadPorciones = scanner.nextInt();
			if (cantidadPorciones > 5)
				System.out.println("\n **NO SE PUEDE INCLUIR MAS DE 5 PORCIONES**\n");

		}

		if (opcion == 1) {
			Res res = new Res(cantidadPorciones, "Res");
			stockRes = agregarEtapa(res, stockRes);
			descripcionProducto=descripcionProducto+"La PICADA creada contiene: \n"
					+ res.tipo+":"+cantidadPorciones;
		}

		if (opcion == 2) {
			Cerdo cerdo = new Cerdo(cantidadPorciones, "Cerdo");
			stockCerdo = agregarEtapa(cerdo, stockCerdo);
			descripcionProducto=descripcionProducto+"La PICADA creada contiene: \n"
					+ cerdo.tipo+":"+cantidadPorciones;
		}

		// ETAPA2
		System.out.println(
				"Seleccione el producto a adicionar en la ETAPA 2 a la PICADA: \n\n" + "1. Papa\n" + "2. Platano");

		opcion = scanner.nextInt();
		cantidadPorciones = 6;
		while (cantidadPorciones > 5) {
			System.out.println("Ingrese la cantidad de porciones que desea incluir a la PICADA:");
			cantidadPorciones = scanner.nextInt();
			if (cantidadPorciones > 5)
				System.out.println("\n **NO SE PUEDE INCLUIR MAS DE 5 PORCIONES**\n");

		}

		if (opcion == 1) {
			Papa papa = new Papa(cantidadPorciones, "Papa");
			stockPapa = agregarEtapa(papa, stockPapa);
			descripcionProducto=descripcionProducto+"\n"+papa.tipo+":"+cantidadPorciones;

		}

		if (opcion == 2) {
			Platano platano = new Platano(cantidadPorciones, "Platano");
			stockPlatano = agregarEtapa(platano, stockPlatano);
			descripcionProducto=descripcionProducto+"\n"+platano.tipo+":"+cantidadPorciones;
		}

		// ETAPA3
		System.out.println(
				"Seleccione el producto a adicionar en la ETAPA 3 a la PICADA: \n\n" + "1. Guacamole\n" + "2. Aji");

		opcion = scanner.nextInt();

		cantidadPorciones = 6;
		while (cantidadPorciones > 5) {
			System.out.println("Ingrese la cantidad de porciones que desea incluir a la PICADA:");
			cantidadPorciones = scanner.nextInt();
			if (cantidadPorciones > 5)
				System.out.println("\n **NO SE PUEDE INCLUIR MAS DE 5 PORCIONES**\n");

		}

		if (opcion == 1) {
			Guacamole guacamole = new Guacamole(cantidadPorciones, "Guacamole");
			stockGuacamole = agregarEtapa(guacamole, stockGuacamole);
			descripcionProducto=descripcionProducto+"\n"+guacamole.tipo+":"+cantidadPorciones;
		}

		if (opcion == 2) {
			Aji aji = new Aji(cantidadPorciones, "Aji");
			stockAji = agregarEtapa(aji, stockAji);
			descripcionProducto=descripcionProducto+"\n"+aji.tipo+":"+cantidadPorciones;
		}
		
		System.out.println(descripcionProducto);
		lstProductos.add(descripcionProducto);
	}

	public int agregarEtapa(Insumo insumo, int stockProducto) {

		while (insumo.cantidadInsumo > stockProducto) {
			System.out.println(
					"\n\n**La cantidad de porciones solicitadas son MAYORES al stock disponible, necesita abastecer la fabrica**\n\n");

			stockProducto = abastecerInsumo(insumo, stockProducto);

		}
		insumo.agregarInsumo(insumo);
		stockProducto = descontarInsumo(insumo, stockProducto);

		System.out.println("\n\n** Utilizaste " + insumo.cantidadInsumo + " porciones de " + insumo.tipo
				+ " te quedaron " + stockProducto + " porciones disponibles en el STOCK**\n");

		return stockProducto;
	}

	public static int abastecerInsumo(Insumo insumo, int stock) {

		int cantidadAbastecer;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Actualmente cuenta con " + stock + " porciones de " + insumo.tipo
				+ " en el STOCK, ingrese la cantidad de porciones que desea adicionar al STOCK:");
		cantidadAbastecer = scanner.nextInt();
		if (cantidadAbastecer > 0 && cantidadAbastecer <= 3) {
			stock = stock + cantidadAbastecer;
			System.out.println("\n **Abastecimiento exitoso, ahora cuenta con " + stock + " porciones de " + insumo.tipo
					+ " en su STOCK **\n");
		} else {
			System.out.println("\n **Solo puede abastecer entre 1 y 3 porciones cada vez**\n");
		}

		return stock;

	}

	public static int descontarInsumo(Insumo insumo, int stock) {

		return stock - insumo.cantidadInsumo;
	}

}
