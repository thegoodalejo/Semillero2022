package calculadora;

import javax.swing.JOptionPane;

import hospital.Paciente;

public class Main {

	public static void main(String[] args) {

		int salir = 0;
		int numero1;
		int numero2;
		int resultado;

		while (salir == 0) {
			int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la operación que desea realizar :\n"
					+ "1. Sumar\n" + "2. Restar\n" + "3. Multiplicar\n" + "4. Dividir\n" + "5. Salir\n"));

			switch (opcion) {
			case 1:
				numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero: "));
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero: "));
				resultado = numero1 + numero2;
				System.out.println("El resultado de la suma es :" + resultado);
				break;
			case 2:
				numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero: "));
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero: "));
				resultado = numero1 - numero2;
				System.out.println("El resultado de la resta es :" + resultado);
				break;

			case 3:
				numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero: "));
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero: "));
				resultado = numero1 * numero2;
				System.out.println("El resultado de la multiplicacion es :" + resultado);
				break;

			case 4:
				numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero: "));
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero: "));
				if (numero1 >= numero2 && numero2 != 0) {
					resultado = numero1 / numero2;
					System.out.println("El resultado de la division es :" + resultado);
				}
				if (numero1 < numero2 || numero2 == 0) {
					System.out.println("No se puede realizar la operacion el");
				}
				break;
			case 5:
				salir = 1;
				break;
			}

		}

	}

}
