package taller;

public class Hanoi {

	public void Hanoi(int num,int inicio,int tmp,int fin) {
		if(num==1) {
			System.out.println("moviendo de la torre 1 a 3, fin xd");
			
			
		}
		else {
			Hanoi(num-1,inicio,fin,tmp);
			System.out.println("moviendo de la torre inicio" +inicio+" fin "+fin );
			Hanoi(num-1,tmp,inicio,fin);
			
		}
	}
	
	
}
