package fibonacci;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		/*n -> indica hasta donde debe ir la secuencia de fibonacci*/
		int n = 0;
		
		System.out.println("Indique cuantos numeros de la secuencia de fibonacci quiere mostrar: s");
		n = (int)tc.nextInt();
		
		if(n > 0) {
			long s1 = System.nanoTime();
			fibonacci(n);
			long e1 = System.nanoTime() - s1;
			System.out.println("TIEMPO FIBONACCI ITERATIVO: " + e1);
			
			/*SE COMPRUEBA QUE EL FIBONACCI RECURSIVO ES MAS LENTO QUE EL ITERATIVO
			 * Experimentando con los 50 numeros de fibonaccio
			 * El algoritmo iterativo se demoro : aprox 1008100 nanosegundos -> 0.001 segundos
			 * El algoritmo recursivo se demoro: aprox 87570538300 nanosegundos -> 87.57 segundos
			 * */
			
			long s2 = System.nanoTime();
			System.out.println(fibonacciRecursivo(n));
			long e2 = System.nanoTime() - s2;
			System.out.println("TIEMPO FIBONACCI RECURSIVO: " + e2);
			
		}else {
			System.out.println("No puede ingresar valores negativos...!");
		}
		
	}
	
	/*Mi solucion de fibonacci recursivo*/
	public static void fibonacci(int n) {
		int a = 0;
		int b = 1;
		int c = 1;
		
		for(int j = 0; j < n; j++) {
			
			if(j == 0) {
				System.out.print(a + ", " + b + ", " + c + ", ");
			}else {
				a = b;
				b = c;
				c = a + b;
				System.out.print(c + ", ");
			}
		}
		
		System.out.println("");
	}
	
	/*solucion de fibonacci recursivo de internet*/
	public static int fibonacciRecursivo(int n) {
		if(n < 2) {
			return n;
		}else {
			return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
		}
	}
 
}
