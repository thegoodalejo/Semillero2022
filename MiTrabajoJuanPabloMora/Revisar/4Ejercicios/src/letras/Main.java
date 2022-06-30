package letras;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
	Scanner leer=new Scanner(System.in);
	
	    Alfabeto alfabeto = new Alfabeto();
		int opcion=0;

	    System.out.println("LETRAS");
        System.out.println("Dado una cadena con las letras del alfabeto de la A-Z (mayúsculas y minúsculas) escribir un programa que haga lo siguiente:");
        
        do {
            System.out.println("1 - Imprimir la menor letra de todas");
            System.out.println("2 - Imprimir la mayor letra de todas");
            System.out.println("3 - Sumar la menor letra y la mayor letra e imprimir el carácter resultante y el código ASCII de este");
            System.out.println("4 - Imprimir por consola las letras repetidas y las veces que aparece en la cadena");
            System.out.println("5 - Salir");

            opcion=leer.nextInt();


            switch (opcion){
                case 1:
                	System.out.println("********Letra Menor*********");
                	System.out.println("");
                	alfabeto.letraMenor();
                break;

                case 2:
                	System.out.println("********Letra Mayor*********");
                	System.out.println("");
                	alfabeto.letraMayor();
                break;

                case 3:
                	System.out.println("********ASCII*********");
                	System.out.println("");
                	alfabeto.codigoAsciir();
                break;
                
                case 4:
                	System.out.println("********letras repetidas*********");
                	System.out.println("");
                	alfabeto.letrasRepeidas();
                break;

            }

        } while (opcion!=5);   
        System.out.println("FINALIZADO,Que tengas buen dia");

	}

}
