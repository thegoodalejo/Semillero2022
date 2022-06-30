package amstrong;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int numero1;
		int numero2;
		double sumaTotal = 0;
		double ultimoDigito;
		int numeroSinUltimoDigito = 0;
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero: "));

		for (int i = numero1; i <= numero2; i++) {
			numeroSinUltimoDigito = i;

			if (numeroSinUltimoDigito > 9) {

				while (numeroSinUltimoDigito > 9) {

					ultimoDigito = numeroSinUltimoDigito % 10;
					numeroSinUltimoDigito = numeroSinUltimoDigito / 10;
					sumaTotal = sumaTotal + (ultimoDigito * ultimoDigito * ultimoDigito);
				}
				sumaTotal = sumaTotal + (numeroSinUltimoDigito * numeroSinUltimoDigito * numeroSinUltimoDigito);
				
				
			}else {
				sumaTotal = sumaTotal + (numeroSinUltimoDigito * numeroSinUltimoDigito * numeroSinUltimoDigito);
			}
			
			if (i == sumaTotal) {
				System.out.println(i+" es un numero de Armstrong");
			}
			
			
			sumaTotal=0;

		}

	}

}
