package fibonacci;

import java.util.Scanner;

public class Fibonacci {
	private int numero;
	private long serie;
	private long serie2;
	
	
	
	public Fibonacci(int numero, long serie, long serie2) {
		super();
		this.numero = numero;
		this.serie = serie;
		this.serie2 = serie2;
	}



	public void calcularSerie() {
		int cont=0;

            System.out.println("     F"+cont+"          "+this.serie + " ");
        
        for(int i=2;i<=this.numero;i++){
            cont++;
        	System.out.println("     F"+cont+"         "+this.serie2 + " ");
            this.serie2 = this.serie + this.serie2;
            this.serie = this.serie2 - this.serie;
        }

	}
	
	
	
	public void menu() {
		int opcion =0;
		Scanner leer=new Scanner(System.in);

        do {
        	System.out.println("Digite el numero N que calculara los numero de la serie ");
            this.numero=leer.nextInt();
            if(this.numero>0) {
            	opcion=1;
            }
        	
        } while (opcion!=1);
        
	}

}
