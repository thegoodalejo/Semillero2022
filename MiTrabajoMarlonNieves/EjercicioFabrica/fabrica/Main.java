package fabrica;

import java.util.Scanner;

public class Main {

	static int nuevoPedido;
	static int opcion = 0;
	static int contador =0;
	static Scanner eleccion = new Scanner(System.in);

	public static void main(String[] args) {

		Arepa arepa = new Arepa();
		do {
			/* Etapa 0 */
			arepa.setTamanoArepa(tamanoArepa());

			/* Etapa 1 */
			arepa.setTipoArepa(Etapa1.iniciarEtapaTipo());

			if (arepa.getTipoArepa().equals("Mixta")) {
				/* Etapa 2 */
				arepa.setIngredientes(Etapa2.iniciarEtapaMixta());
			}

			if (arepa.getTipoArepa().equals("Especial")) {
				/* Etapa 2 */
				arepa.setIngredientes(Etapa2.iniciarEtapaVegetariana());
			}

			/* Etapa 3 */
			arepa.setTemperatura(Etapa3.iniciarEtapaDetalles());

			/* Resumen */
			System.out.println(arepa);
			contador++;
			
			System.out.println("\nQuieres pedir una nueva arepa?");
			System.out.println(" - Digita 1 para SI");
			System.out.println(" - Digita 2 para NO");
			nuevoPedido = eleccion.nextInt();
			if (nuevoPedido < 0 || nuevoPedido > 2) {
				System.out.println("Elija una opcion correcta");
			} else if (nuevoPedido == 2) {
				opcion = 1;
				System.out.println("Gracias por tu compra!! Feliz dia");
			}

		} while (opcion != 1);
	}

	public static String tamanoArepa() {

		int tamano;
		String tamanoArepa = "";

		Arepa arepa1 = new Arepa();

		do {
			System.out.println("\nElige el tamano que quieras para tu arepa: ");
			System.out.println(" - Digita 1 para arepa mediana");
			System.out.println(" - Digita 2 para arepa grande");
			tamano = eleccion.nextInt();

			switch (tamano) {
			case 1:
				tamanoArepa = "Mediana";
				break;
			case 2:
				tamanoArepa = "Grande";
				break;
			default:

				System.out.println("Eliga una opcioin valida");
			}
		} while (tamano < 0 && tamano > 2);

		return tamanoArepa;
	}
}
