package letrasAlfabeto;

public class testAlfabeto {

	public static void main(String[] args) {
		String cadena = "akjlBbdffhafsAfAbfaaaff";
		
		char menor = encontrarMenor(cadena);
		char mayor = encontrarMayor(cadena);
		System.out.println("La letra menor es: "+menor);
		System.out.println("La letra mayor es: "+mayor);
		ordenarLetras(cadena);
		sumarMenorMayor(menor, mayor);
		contarLetras(cadena);

	}

	private static void contarLetras(String cadena) {
		char[] arregloOrganizado = ordenarLetrasArreglo(cadena);
		
		for (int i = 0; i < arregloOrganizado.length; i++) {
			int contador =0;
			if(i>0 && arregloOrganizado[i] == arregloOrganizado[i-1]) {
			
			}else {
				for (int j = 0; j < arregloOrganizado.length; j++) {
					
					if(arregloOrganizado[i] == arregloOrganizado[j]) {
						contador++;
						
					}
				}
				System.out.println("La letra: "+ arregloOrganizado[i]+ " esta "+contador+" veces" );
			}
			
			
		}
		
		
	}

	private static void sumarMenorMayor(char menor, char mayor) {
		// TODO Auto-generated method stub
		int suma = menor + mayor;
		char letraResultante = (char) suma;
		System.out.println("El caracter resultante es: "+letraResultante + ", y el codigo ascii es: " +suma);
	}

	private static char[] ordenarLetrasArreglo(String cadena) {
		char [] arregloDeLetras = almacenarLetras(cadena);
		char letraAux = 0;
		for (int i = 0; i < arregloDeLetras.length ; i++) {
			for (int j = 0; j < arregloDeLetras.length; j++) {
				if(arregloDeLetras[i] < arregloDeLetras[j]) {
					letraAux = arregloDeLetras[i];
					arregloDeLetras[i]= arregloDeLetras[j];
					arregloDeLetras[j]= letraAux;
				}
			}
		}
		return arregloDeLetras;
	}
	private static void ordenarLetras(String cadena) {
		char [] arregloDeLetras = almacenarLetras(cadena);
		char letraAux = 0;
		for (int i = 0; i < arregloDeLetras.length ; i++) {
			for (int j = 0; j < arregloDeLetras.length; j++) {
				if(arregloDeLetras[i] < arregloDeLetras[j]) {
					letraAux = arregloDeLetras[i];
					arregloDeLetras[i]= arregloDeLetras[j];
					arregloDeLetras[j]= letraAux;
				}
			}
		}
		imprimirArreglo(arregloDeLetras);
		System.out.println();
	}

	private static void imprimirArreglo(char[] arregloDeLetras) {
		System.out.println("El arreglo ordenado alfabeticamente");
		for (char c : arregloDeLetras) {
			System.out.print(c+" ");
		}
		
	}

	private static char[] almacenarLetras(String cadena) {
		char arreglo [] = new char [cadena.length()];
		for (int i = 0; i < cadena.length(); i++) {
			arreglo[i] = cadena.charAt(i);
		}
		
		return arreglo;
	}

	private static char encontrarMayor(String cadena) {
		char letraMayor =  cadena.charAt(0);
		for (int i = 1; i < cadena.length(); i++) {
			if(letraMayor < cadena.charAt(i) ) {
				letraMayor = cadena.charAt(i);
			}
		}
		return letraMayor;
	}	
	

	private static char encontrarMenor(String cadena) {
		char letraMenor =  cadena.charAt(0);
		for (int i = 1; i < cadena.length(); i++) {
			if(letraMenor > cadena.charAt(i) ) {
				letraMenor = cadena.charAt(i);
			}
		}
		return letraMenor;
	}

}
