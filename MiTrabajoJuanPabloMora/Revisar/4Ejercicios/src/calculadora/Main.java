package calculadora;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner leer=new Scanner(System.in);

		
		Suma suma = new Suma(0);
		Multiplicacion multiplica = new Multiplicacion(1);
		Dividir dividir = new Dividir(0,0);
		
		int opcion=0;

	    System.out.println("Calculadora");
        System.out.println("Digita la opoeracion a realizar");
        
        do {
            System.out.println("1 - Sumar");
            System.out.println("2 - Multiplicar");
            System.out.println("3 - Dividir");
            System.out.println("4 - Salir");

            opcion=leer.nextInt();


            switch (opcion){
                case 1:
                	System.out.println("********OPERACION A REALIZAR SUMAR*********");
                	suma.sumar(suma);
                	System.out.println("");
                break;

                case 2:
                	System.out.println("********OPERACION A REALIZAR MULTIPLICAR*********");
                	multiplica.multiplicar(multiplica);
                	System.out.println("");
                break;

                case 3:
                	System.out.println("********OPERACION A REALIZAR DIVIDIR*********");
                	System.out.println("Si ingresa numeros negativos este los tomara como positivos");
                	System.out.println("");
                	dividir.dividir(dividir);
                	System.out.println("");
                break;

            }

        } while (opcion!=4);   
        System.out.println("FINALIZADO,Que tengas buen dia");
	}

}
