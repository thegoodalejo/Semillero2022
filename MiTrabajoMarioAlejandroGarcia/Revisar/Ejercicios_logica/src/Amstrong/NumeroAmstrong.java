package Amstrong;

import java.util.Scanner;

public class NumeroAmstrong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		int numA = sc.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		int numB = sc.nextInt();
		
		//Validamos que los numA y numB sean enteros positivos
		if(numA>0 && numB>0) {
			//Validamos que numA es menor que NumB
			if(numB>numA) {
				System.out.println("Los numeros de Amstrong entre "+numA+" y "+numB+" son: ");
				for(int i=numA; i < numB; i++) {
					if (calcularNArms(i)) {
						 System.out.println(i);
					}
		        }	
			}
		}
    }

    public static boolean calcularNArms(int num) {
        int contDig = 0; 
        int sumDig = 0;
        int aux = num;
        int ultDig = 0;
        
       //Realizamos el cálculo del número de digitos
        while (aux != 0) {
            aux /= 10;
            contDig++;
        }
        ultDig = num;
        
        //Realizamos el calculo del suma de los digitos de num elevados a la n-esima potencia
        while (ultDig != 0) {
            int residuo = ultDig % 10;
            sumDig += Math.pow(residuo, contDig);
            ultDig /= 10;
        }
        //Validamos  que num es número de Amstrong si se cumple que la suma de los cubos de los digitos es igual al num
        //si es verdadero retorna true, sino retorna false
        if (sumDig == num) 
        {
        	return true;
        }
        return false;
    }
}
