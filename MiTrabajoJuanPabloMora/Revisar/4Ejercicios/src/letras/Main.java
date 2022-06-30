package letras;

import java.util.Scanner;


public class Main {

	
	
	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);
		
	    Alfabeto alfabeto = new Alfabeto();
		String palabra;

	    System.out.println("LETRAS");
        System.out.println("Dado una cadena con las letras del alfabeto de la A-Z (mayúsculas y minúsculas) escribir un programa que haga lo siguiente:");
        
        
            System.out.println("1 - Imprimir la menor letra de todas");
            System.out.println("2 - Imprimir la mayor letra de todas");
            System.out.println("3 - Sumar la menor letra y la mayor letra e imprimir el carácter resultante y el código ASCII de este");
            System.out.println("4 - Imprimir por consola las letras repetidas y las veces que aparece en la cadena");
            System.out.println("5 - Salir");

            palabra=leer.next();
            

            alfabeto.letraMenor();
            alfabeto.letraMayor();
            alfabeto.codigoAsciir();
            alfabeto.letrasRepeidas();
            
            
       

	}

}
