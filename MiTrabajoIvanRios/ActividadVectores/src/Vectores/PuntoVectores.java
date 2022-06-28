package Vectores;

public class PuntoVectores {

	public static void main(String[] args) {
		
		int[] elementos = {5,7,2,4,1};
		Arreglo vector1 = new Arreglo(elementos);
		System.out.println("Vector Original: "+vector1.elementos);
		vector1.ordenarMenorAMayor(vector1.elementos);
		System.out.println("Vector Ordenado de Menor a Mayor: "+vector1.elementos);
		vector1.ordenarMayorAMenor(vector1.elementos);
		System.out.println("Vector Ordenado de Mayor a Menor: "+vector1.elementos);
	}

}
