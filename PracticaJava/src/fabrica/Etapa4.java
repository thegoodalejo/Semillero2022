package fabrica;

import java.util.Scanner;

public class Etapa4 extends Fabricacion {

	@Override
	public void iniciarEtapa() {
		// TODO Auto-generated method stub

	}

	public Calzado iniciarEtapaTipo(Calzado calzado1) {
		Scanner eleccion = new Scanner(System.in);
		int tipoTacon;
		boolean continuar = false;

		do {
			System.out.println("\nElige tu tipo de Tacon:");
			System.out.println(" - Digita 1 para Calzado Alto");
			System.out.println(" - Digita 2 para Calzado Medio");
			System.out.println(" - Digita 3 para Calzado Bajo");
			System.out.println(" - Digita 4 para Calzado Sin tacon");
			System.out.println("Ingresa tu eleccion: ");
			tipoTacon = eleccion.nextInt();

			// validacion tipo de calzado
			continuar = false;
			switch (tipoTacon) {
			case 1:
				calzado1.settipoTacon("Alto");
				break;
			case 2:
				calzado1.settipoTacon("Medio");
				break;
			case 3:
				calzado1.settipoTacon("Bajo");
				break;
			case 4:
				calzado1.settipoTacon("Sin tacon");
				break;
			default:
				continuar =true;
				System.out.println("Eliga una opcioin valida");
			}
		} while (continuar);

		return calzado1;
	}
}
