package torre;

public class Hanoi {
	
	//Metodo recursivo Hanoi
	public void hanoi(int num, int origen, int temporal, int destino) {
		
		if(num== 1) 
		{
			System.out.println("Moviendo de la torre inicio "+origen+" a la torre de destino: "+destino);
		}
		
		else 
		{
			hanoi(num-1,origen,destino,temporal);
			System.out.println("Moviendo de la torre inicio "+origen+" a la torre de destino: "+destino);
			hanoi(num-1,temporal,origen,destino);
		}
		
	}

}
