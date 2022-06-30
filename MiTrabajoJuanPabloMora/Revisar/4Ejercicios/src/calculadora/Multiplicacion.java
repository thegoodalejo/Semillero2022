package calculadora;

import java.util.Scanner;

public class Multiplicacion extends Numeros {

	public Multiplicacion(double a) {
		super(a);
	}
	
	public void multiplicar(Multiplicacion m) {
    	int opcion =1;
    	
    	do {
    		
            m.setA(m.getA()*m.leerNumero());
    	    System.out.println("TOTAL PARCIAL: "+m.getA());
    	    System.out.println("Digite 1 para cotinuar, 0 para finalizar: ");
    	    Scanner leer=new Scanner(System.in);    
		    
    	    opcion=leer.nextInt();
    	} while (opcion!=0); 
    	System.out.println("SU MULTIPLICACION TOTAL ES: "+m.getA());
    	m.setA(0);
	}
}
