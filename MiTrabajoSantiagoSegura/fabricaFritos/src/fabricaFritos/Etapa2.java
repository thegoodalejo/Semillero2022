package fabricaFritos;

import java.util.Scanner;

public class Etapa2 {
   
	public static Etapa1 etapa1;
	public static Aceite aceite=new Aceite();
    public static int cantidadGastada;
	
	public Aceite seleccionarAceite() {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Primero tomaremos los datos del aceite");
		System.out.println("ingrese los litros de aceite");
		aceite.litros=entrada.nextInt();

		do {
			
			System.out.println("no se puede agregar mas de tres unidades, intente de nuevo");
			aceite.litros	=entrada.nextInt();
			
			
		} while (aceite.litros>3);
		System.out.println("ingrese el tipo de aceite");
		aceite.tipoAceite=entrada.next();
		cantidadGastada= aceite.litros;
		
		
		aceite.abastecer();
		
		return aceite;
	}
	public void fritar() {
		this.seleccionarAceite();
	       
		System.out.println("Fritar en aceite: "+aceite.tipoAceite);
		
	 
		
		
	
	}
	
}
