package array;

public class Array {

	public static void main(String[] args) {
		
       int[] Array_numeros = {5,7,2,4,1};
       int numeroActual,numeroSiguiente ;
       System.out.println("Mi arreglo de numeros es: ");
       for (int i=0; i<Array_numeros.length; i++) {
    	   System.out.println(Array_numeros[i]);
       }
       
   	//Usando condicionales y ciclos organice de mayor a menor
    
       for (int i=0; i<Array_numeros.length; i++) {
    	   for (int j=0; j<Array_numeros.length-1; j++) {
    		   numeroActual = Array_numeros[j];
    		   numeroSiguiente =  Array_numeros[j+1];
    		   if (numeroActual<numeroSiguiente){
    			   Array_numeros[j]=numeroSiguiente;
    			   Array_numeros[j+1]=numeroActual;
    		   }
    	   }
       }
  
       System.out.println("Mi arreglo Ordenado de mayor a menor: ");
       for (int i=0; i<Array_numeros.length; i++) {
    	   System.out.println(Array_numeros[i]);
       }

      	//Usando condicionales y ciclos organice de menor a mayor
       
       for (int i=0; i<Array_numeros.length; i++) {
    	   for (int j=0; j<Array_numeros.length-1; j++) {
    		   numeroActual = Array_numeros[j];
    		   numeroSiguiente =  Array_numeros[j+1];
    		   if (numeroActual>numeroSiguiente){
    			   Array_numeros[j]=numeroSiguiente;
    			   Array_numeros[j+1]=numeroActual;
    		   }
    	   }
       }
       System.out.println("Mi arreglo Ordenado de menor a mayor: ");
       for (int i=0; i<Array_numeros.length; i++) {
    	   System.out.println(Array_numeros[i]);
       }
	}
	
}
