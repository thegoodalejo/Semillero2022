package fibonacci;


public class Main {

	public static void main(String[] args) {
		
		Fibonacci fibonacci = new Fibonacci(0,0,1);
		
	    System.out.println("Serie de Fibonacci");
		fibonacci.menu();
		System.out.println("Lista de los primeros 50 números de Fibonacci");    
		System.out.println("");
		System.out.println("__________________________________");
		System.out.println("     Fn        Numero ");
		System.out.println("__________________________________");
		fibonacci.calcularSerie();

	}

}
