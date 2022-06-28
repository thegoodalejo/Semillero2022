import java.util.Iterator;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int[] numeros = { 5, 7, 2, 4, 1 };
		int[] torre1 = { 4, 3, 2, 1 };
		int[] torre2 = { 0, 0, 0, 0 };
		int[] torre3 = { 0, 0, 0, 0 };
		// ordenar(numeros);
		hanoi(torre1, torre2, torre3);
	}

	public static void ordenar(int numeros[]) {

		int aux1 = 0;

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {

				if (numeros[i] > numeros[i + 1]) {
					aux1 = numeros[i];
					numeros[i] = numeros[i + 1];
					numeros[i + 1] = aux1;
				}
			}

		}
		System.out.print("Numeros ordenados: ");
		for (int j = 0; j <= 4; j++) {

			System.out.print(numeros[j] + ",");
		}

	}

	public static void hanoi(int torre1[], int torre2[], int torre3[]) {
		int paso = 0;
		// while (torre3[0] != 4 && torre3[3] != 3 && torre3[2] != 2 && torre3[3] != 1)
		// {
		for (int z = 0; z < 6; z++) {
			paso = 0;
			for (int j = 3; j >= 0; j--) {// movimiento desde torre 1

				paso = 0;

				for (int i = 0; i < 4; i++) {

					if (torre2[0] == 0 && paso == 0) {
						torre2[0] = torre1[j];
						torre1[j] = 0;
						paso = 1;

						System.out.print(torre1[0]);
						System.out.print(torre1[1]);
						System.out.print(torre1[2]);
						System.out.print(torre1[3]);
						System.out.print("\n");
						System.out.print(torre2[0]);
						System.out.print(torre2[1]);
						System.out.print(torre2[2]);
						System.out.print(torre2[3]);
						System.out.print("\n");
						System.out.print(torre3[0]);
						System.out.print(torre3[1]);
						System.out.print(torre3[2]);
						System.out.print(torre3[3]);
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("\n");
					}

					if (torre3[0] == 0 && paso == 0) {
						torre3[0] = torre1[j];
						torre1[j] = 0;
						paso = 1;

						System.out.print(torre1[0]);
						System.out.print(torre1[1]);
						System.out.print(torre1[2]);
						System.out.print(torre1[3]);
						System.out.print("\n");
						System.out.print(torre2[0]);
						System.out.print(torre2[1]);
						System.out.print(torre2[2]);
						System.out.print(torre2[3]);
						System.out.print("\n");
						System.out.print(torre3[0]);
						System.out.print(torre3[1]);
						System.out.print(torre3[2]);
						System.out.print(torre3[3]);
						System.out.print("\n");
						System.out.print("\n");
						System.out.print("\n");
					}

				}

			}

			for (int j = 3; j >= 0; j--) {// movimiento desde torre 2
				paso = 0;

				for (int i = 0; i < 4; i++) {

					if (torre2[j] > 0) {

						if (torre3[i] > 0) {
							if (torre2[j] < torre3[i]) {
								torre3[i + 1] = torre2[j];
								torre2[j] = 0;

								System.out.print(torre1[0]);
								System.out.print(torre1[1]);
								System.out.print(torre1[2]);
								System.out.print(torre1[3]);
								System.out.print("\n");
								System.out.print(torre2[0]);
								System.out.print(torre2[1]);
								System.out.print(torre2[2]);
								System.out.print(torre2[3]);
								System.out.print("\n");
								System.out.print(torre3[0]);
								System.out.print(torre3[1]);
								System.out.print(torre3[2]);
								System.out.print(torre3[3]);
								System.out.print("\n");
								System.out.print("\n");
								System.out.print("\n");
							}

						}
					}

				}

			}

		}
	}

	// }
}
