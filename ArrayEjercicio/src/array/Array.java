package array;

public class Array {

	public static void main(String[] args) {
		
       int[] Array_numeros = {5,7,2,4,1};
       int temporal ;
       System.out.println("Mi arreglo de numeros es: ");
       for (int i=0; i<Array_numeros.length; i++) {
    	   System.out.println(Array_numeros[i]);
       }
       
   	//Usando condicionales y ciclos organice de mayor a menor
       System.out.println("Mi arreglo Ordenado de mayor a menor: ");
       for (int i=0; i<Array_numeros.length; i++) {
    	   
    	   for (int j=0; j<Array_numeros.length-i-1; j++) {
    		   if (Array_numeros[i]<Array_numeros[i+1]){
    			   temporal = Array_numeros[i+1]; 
    			   Array_numeros[i+1] = Array_numeros[i];
    			   Array_numeros[i]= temporal;
    		   }
    	   }
    	  
    	      
    	   System.out.println(Array_numeros[i]);
       }
	}
	
}
