package cafe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);

        int opcion=0;
        
        CafeConLeche cafeConleche = new CafeConLeche("",0,0,0,5000,0,0,50);

        System.out.println("Maquina de Cafe");
        System.out.println("seleccione sus opciones.");

        do {
            System.out.println("1 - Cafe Con leche");
            System.out.println("2 - Cafe Doble Crema");
            System.out.println("3 - Cafe Sencillo");
            System.out.println("4 - Cafe Americano");
            System.out.println("5 - Salir");

            opcion=leer.nextInt();


            switch (opcion){
                case 1:
                	
                	cafeConleche.setTamanoVaso(cafeConleche.escogerVaso());
                	cafeConleche.setPalito(cafeConleche.escogerPalito());
                	cafeConleche.setAzucar(cafeConleche.escogerAzucar());
                	cafeConleche.setServir(cafeConleche.escogerServicio());
                    
                	cafeConleche.cuenta(cafeConleche);
                	opcion=5;
                    break;

                case 2:

                   
                    break;

                case 3:

      
                    break;


                case 4:


                    break;

   
            }


        } while (opcion!=5);    

	}

}
