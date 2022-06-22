package ejercicios;

public class TorresHanoi {


	public static void main(String[] args) {
		 // número de discos
		int []torre1 = {4,3,2,1};
		int []torre2 = {0,0,0,0};
		int []torre3 = {0,0,0,0};
		int n = 4;
        hanoi(n,1,2,3); //implementando recursividad
		hanoi(torre1, torre2, torre3); //movimientos manuales

	}
	
    public static void hanoi(int cantidadDiscos, int origen,  int auxiliar, int destino){
        if(cantidadDiscos==1){
           System.out.println("moviendo disco de la torre " + origen + " a la torre " + destino);
        }else{
           hanoi(cantidadDiscos-1, origen, destino, auxiliar);
           System.out.println("moviendo disco de la torre " + origen + " a la torre " + destino);
           hanoi(cantidadDiscos-1, auxiliar, origen, destino);
        }
    }
    
    public static void hanoi(int []torre1, int []torre2, int []torre3) {
    	if(torre2[0] == 0) {
    		torre2[0] = torre1[torre1.length-1];
    		torre1[torre1.length-1]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3);
    	if(torre3[0] == 0) {
    		torre3[0] = torre1[torre1.length-2];
    		torre1[torre1.length-2]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3);
    	if(torre3[1] == 0) {
    		torre3[1] = torre2[0];
    		torre2[0]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3);
    	if(torre2[0] == 0) {
    		torre2[0] = torre1[torre1.length-3];
    		torre1[torre1.length-3]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3);
    	if(torre1[1] == 0) {
    		torre1[1] = torre3[1];
    		torre3[1]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3);
    	if(torre2[1] == 0) {
    		torre2[1] = torre3[0];
    		torre3[0]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3);
    	if(torre2[2] == 0) {
    		torre2[2] = torre1[torre1.length-3];
    		torre1[torre1.length-3]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3);
    	if(torre3[0] == 0) {
    		torre3[0] = torre1[torre1.length-4];
    		torre1[torre1.length-4]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3);
    	if(torre3[1] == 0) {
    		torre3[1] = torre2[torre2.length-2];
    		torre2[torre2.length-2]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3);
    	if(torre1[0] == 0) {  //
    		torre1[0] = torre2[torre1.length-3];
    		torre2[torre1.length-3]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3);
    	if(torre1[1] == 0) {  //paso 11
    		torre1[1] = torre3[torre3.length-3];
    		torre3[torre3.length-3]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3); 
    	if(torre3[1] == 0) {
    		torre3[1] = torre2[torre2.length-4];
    		torre2[torre2.length-4]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3);
    	if(torre2[0] == 0) {
    		torre2[0] = torre1[torre1.length-3];
    		torre1[torre1.length-3]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3);
    	if(torre2[0] == 0) {
    		torre2[0] = torre1[torre1.length-3];
    		torre1[torre1.length-3]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3);
    	if(torre3[2] == 0) {
    		torre3[2] = torre1[torre1.length-4];
    		torre1[torre1.length-4]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3);
    	if(torre3[3] == 0) {
    		torre3[3] = torre2[torre2.length-4];
    		torre2[torre2.length-4]=0;
    	}
    	imprimirTorres(torre1, torre2, torre3);
    }
    public static void imprimirTorres(int []torre1, int []torre2, int []torre3) {
    	System.out.print("torre 1  ----> ");
    	for (int i = 0; i < torre1.length; i++) {
			System.out.print(torre1[i]+" ");
		}
    	System.out.print("torre 2  ----> ");
    	for (int i = 0; i < torre2.length; i++) {
			System.out.print(torre2[i]+" ");
		}
    	System.out.print("torre 3  ----> ");
    	for (int i = 0; i < torre3.length; i++) {
			System.out.print(torre3[i]+" ");
		}
    	System.out.println();
    }
    	
}
