package cafe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leer=new Scanner(System.in);

        int opcion=0;
        
        CafeConLeche cafeConleche = new CafeConLeche("",0,0,0,6000,0,50,50);
        CafeDoble cafedoble = new CafeDoble("",0,0,0,4000,0,100);
        CafeSolo cafesolo = new CafeSolo("",0,0,0,2500,70,30);
        CafeAmericano cafeamericano = new CafeAmericano("",0,0,0,4500,50,50);

        System.out.println("Maquina de Cafe");
        System.out.println("seleccione sus opciones.");

        do {
            System.out.println("1 - Cafe Con leche");
            System.out.println("2 - Cafe Doble");
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
                	
                	cafedoble.setTamanoVaso(cafedoble.escogerVaso());
                	cafedoble.setPalito(cafedoble.escogerPalito());
                	cafedoble.setAzucar(cafedoble.escogerAzucar());
                	cafedoble.setServir(cafedoble.escogerServicio());
                    
                	cafedoble.cuenta(cafedoble);
                	opcion=5;
                   
                    break;

                case 3:

                	cafesolo.setTamanoVaso(cafesolo.escogerVaso());
                	cafesolo.setPalito(cafesolo.escogerPalito());
                	cafesolo.setAzucar(cafesolo.escogerAzucar());
                	cafesolo.setServir(cafesolo.escogerServicio());
                    
                	cafesolo.cuenta(cafesolo);
                	opcion=5;
      
                    break;


                case 4:
                	
                	cafeamericano.setTamanoVaso(cafeamericano.escogerVaso());
                	cafeamericano.setPalito(cafeamericano.escogerPalito());
                	cafeamericano.setAzucar(cafeamericano.escogerAzucar());
                	cafeamericano.setServir(cafeamericano.escogerServicio());
                    
                	cafeamericano.cuenta(cafeamericano);
                	opcion=5;

                    break;

   
            }


        } while (opcion!=5);    

	}

}
