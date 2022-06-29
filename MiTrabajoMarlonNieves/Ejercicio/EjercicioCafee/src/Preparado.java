import java.util.Scanner;

public class Preparado {
    public static void main(String[] args){
        System.out.println(".:: BIENVENIDO::.");
        Scanner s =new Scanner(System.in);
        System.out.println("Por favor ingrese un numero, Donde 1: CAPUCHINO, 2: CAFE CONLECHE");
        int opcion = s.nextInt();
        if(opcion == 1){
            Capuchino capuchino = new Capuchino();
            System.out.println("TU CAFE CONTIENE LOS SIGUIENTES INGREDIENTES: " +capuchino);

        }else if(opcion == 2){
            Cafeconleche cafeconleche = new Cafeconleche();
            System.out.println("TU CAFE CONTIENE LOS SIGUIENTES INGREDIENTES: " +cafeconleche);

        }else{
            System.out.println("Opcion no valida");
        }

    }
}

