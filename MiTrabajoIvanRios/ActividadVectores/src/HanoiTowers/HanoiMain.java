package HanoiTowers;

public class HanoiMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Torre1 = 1, Torre2 = 2, Torre3 = 3;
		int discos = 4;
		Movimiento(discos,Torre1,Torre2,Torre3);
				
	}
	
	public static void Movimiento (int Discos, int T1,int T2, int T3)
	{
		if (Discos==1)
		{
			System.out.println("Mover disco de la torre "+T1+" hacia la torre "+T3);
		}
		else
		{
			Movimiento(Discos-1,T1,T3,T2);
			System.out.println("Mover disco de la torre "+T1+" hacia la torre "+T3);
			Movimiento(Discos-1,T2,T1,T3);
		}
	}

}