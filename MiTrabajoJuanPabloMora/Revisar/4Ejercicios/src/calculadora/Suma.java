package calculadora;

import java.util.Scanner;

public class Suma extends Numeros{

	public Suma(double a) {
		super(a);
	}
	
	
	public void sumar(Suma s) {
    	int opcion =1;
    	
           do {
    		
            s.setA(s.getA()+s.leerNumero());
    	    System.out.println("TOTAL PARCIAL: "+s.getA());
    	    System.out.println("Digite 1 para cotinuar, 0 para finalizar: ");
    	    Scanner leer=new Scanner(System.in);    
		    
    	    opcion=leer.nextInt();
    	} while (opcion!=0); 
    	System.out.println("SU SUMA TOTAL ES: "+s.getA());
    	s.setA(0);
	}
	

}
