/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package arreglos;

/**
 *
 * @author User
 */
public class ArregloSemillero {

    public static void main(String[] args) {
        Integer[] arr = {5, 7, 2, 4, 1};
        ordenarAsc(arr);
        ordenarDesc(arr);
    }

    public static void ordenarAsc(Integer[] arr) {

        //Ciclo For para ordenar de manera ascendente
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //Mostramos un mensaje y el orden Ascendente.
        System.out.println("El orden Ascendente es:");
        for (int i : arr) {
            System.out.print("[" + i + "] ");

        }
    }

    public static void ordenarDesc(Integer[] arr) {
        //Ciclo For para ordenar de manera descendente
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp2 = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp2;
                }
            }
        }
        //Mostramos un mensaje y el orden Descendente.
        System.out.println();
        System.out.println("El orden Descendente es:");
        for (int i : arr) {
            System.out.print("[" + i + "] ");
        }
    }
}
