package fibonacci;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int numero;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros desea mostrar de la serie Fibonacci? "));
		int[] vec = new int[numero];

		if (numero == 1) {
			vec[0] = 0;
		}

		System.out.println("Serie de fibonacci con " + numero + " numeros: ");

		if (numero >= 2) {
			vec[0] = 0;
			vec[1] = 1;
			for (int i = 2; i < numero; i++) {
				vec[i] = vec[i - 1] + vec[i - 2];
			}
		}

		for (int i = 0; i < numero; i++) {
			System.out.println(vec[i]);
		}

	}

}
