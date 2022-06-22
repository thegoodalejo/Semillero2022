package ejercicios;

public class OrganizarVectores {



	public static void main(String[] args) {
		int [ ] array = {5,7,2,4,1};
		
		//organizarMayoraMenor(array);
		//organizarMenoraMayor(array);

	}


	private static void organizarMenoraMayor(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length -i-1; j++) {
				if(array[j] > array[j+1]){
					int temporal = array[j];
					array[j] = array[j+1];
					array[j+1] = temporal;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+", ");
		}
		System.out.println();
	}

	private static void organizarMayoraMenor(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i -1; j++) {
				if (array[j] < array[j+1]) {
					int temporal = array[j];
					array[j] = array[j+1];
					array[j+1] = temporal;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+", ");
		}
		System.out.println();
	}


}
