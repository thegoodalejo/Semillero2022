package fabricaFritos;

import java.util.Scanner;

public class Etapa3 {

	  public static Etapa2 etapa2;
	  Empaque empaque= new Empaque("plastico", 0);
	  
	  
	  public Empaque definirEmpaque() {
		  Scanner entrada= new Scanner(System.in);
			System.out.println("Tomaremos la cantidad de empaques ");
			System.out.println("ingrese la cantidad de empaques para el lote");
			empaque.cantidad=entrada.nextInt();
			System.out.println("ingrese el material del empaque");
			empaque.mateiral=entrada.next();
			
		  
		  
		  return empaque;
		  
	  }
	public void empacar() {
		this.definirEmpaque();
		System.out.println("empacar");
		
	}
	
}
