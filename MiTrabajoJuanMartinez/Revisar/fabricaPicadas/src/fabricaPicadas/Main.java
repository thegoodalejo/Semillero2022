package fabricaPicadas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int salir = 0;
		Fabrica fabrica = new Fabrica();
		Scanner scanner = new Scanner(System.in);

		int opcion = 0;
		while (salir == 0) {
			System.out.println("\n****FABRICA DE PICADAS LLANERAS****\n\n");
			System.out.println(
					"Seleccione la accion que desea realizar: \n\n" + "1: Crear Producto \n" + "2: Resumen y Salir\n");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				fabrica.vender();
				break;
			case 2:
				Insumo.listar();
				salir = 1;
				break;
			}

		}

	}
}
