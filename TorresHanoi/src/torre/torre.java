//********************************************************************
//Ejericcio Torre de Hanoi con 4 discos
//22/06/2022
//Juan Pablo Mora Palacios
//ENGINEER TRAINEE I
//********************************************************************

package torre;


public class torre {

	public static void main(String[] args) {
		int n=4;
		Hanoi h = new Hanoi();

		System.out.println("Juego la Torre de Hanoi con 4 discos\n");
		System.out.println("           *                   *                    *");
		System.out.println("           *                   *                    *");
		System.out.println("           *                   *                    *");
		System.out.println("           *                   *                    *");
		System.out.println("           *                   *                    *");
		System.out.println("           *                   *                    *");
		System.out.println("          ***                  *                    *");
		System.out.println("         *****                 *                    *");
		System.out.println("        *******                *                    *");
		System.out.println("       *********               *                    *");
		System.out.println("     -------------       -------------        -------------\n");
		System.out.println("        Torre 1             Torre 2              Torre 3\n");
		
		//llamada a metodo recursivo 
        h.hanoi(n, 1, 2, 3);
	}

}
