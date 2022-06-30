package calculadora;

import java.util.Scanner;

public class Dividir extends Numeros {
	
	private double b;

	public Dividir(double a, double b) {
		super(a);
		this.b=b;
	}
	public void dividir(Dividir d) {
    	int opcion =1;
    	double aux=0;
    	int control=0;

    		System.out.println("Dividendo");		
    		aux = d.leerNumero();
    		
    		if(aux<0) {
    			aux=aux*-1;	
    		           }
              d.setA(aux);
            
            do {
               System.out.println("Divisor");
                aux = d.leerNumero();
    		if(aux==0) {
    			System.out.println("Error No se puede dividir por 0, digite un numero valido: ");	
    		}else if(aux<0) {
    			aux=aux*-1;	
    			control=1;
    			this.b=aux;
    		}else {
    			control=1;
    			this.b=aux;
    		}
            }while(control!=1);
            aux=0;

    	System.out.println("SU DIVISION ES: "+(d.getA()/this.b));
    	d.setA(0);
	}
}
