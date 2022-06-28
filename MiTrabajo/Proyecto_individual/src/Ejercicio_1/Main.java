package Ejercicio_1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//Declaramos un array de tipo entero
		int[] ArrayNum = {5,7,2,4,1};
		//Definimos una variable auxiliar que nos permite determinar el intercambio de las posiciones entre el elemento actual y el siguiente
		int aux;	
		
		//Algoritmo de ordenamiento método Burbuja basado en el intercambio de la posicion
		//generado a partir dela comparación entre el elemento actual y el elementosiguiente 
		
		//Recorremos nuestro array posición a posición hasta n-1 posiciones
		for (int i=0; i<ArrayNum.length-1;i++) {
			for(int j=0;j<ArrayNum.length-1;j++)
				if(ArrayNum[j]>ArrayNum[j+1]) {	 //Validamos si el elemento_actual es mayor al elementosiguiente se produce un intercambio de posición.
					aux = ArrayNum[j];
					ArrayNum[j] = ArrayNum[j+1];
					ArrayNum[j+1] = aux;
				}
		}
		//Luego de realizar el ordenamiento de nuestro array de tipo entero procedemos al imprimirlo 
		//de menor a mayor
		System.out.print("Array ordenado de forma Creciente: ");
		for (int i=0; i<ArrayNum.length;i++) {
			System.out.print(ArrayNum[i]);			
		}
		System.out.println("");
		//Luego de realizar el ordenamiento de nuestro array de tipo entero procedemos al imprimirlo 
		//de mayor a menor
		System.out.print("Array ordenado de forma Decreciente: ");
		for (int j=ArrayNum.length - 1;j>=0;j--) {
			System.out.print(ArrayNum[j]);
		}

	}

}
