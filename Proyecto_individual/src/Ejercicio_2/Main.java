package Ejercicio_2;

public class Main {

	public static void main(String[] args) {
		int Num_discos = 4;
		int Torre_inicio = 1;
		int Torre_aux = 2;
		int Torre_fin = 3;
		System.out.println("N° de discos: "+Num_discos);
		System.out.println("Serie de pasos : ");
		TorreHanoi(Num_discos,Torre_inicio,Torre_aux,Torre_fin);
	}
	
	public static void TorreHanoi(int Num_discos, int Torre_inicio, int Torre_aux, int Torre_fin) {
		if(Num_discos == 1) {
			System.out.println("Moviendo disco de la torre de inicio "+Torre_inicio+" a la torre destino "+Torre_fin);
		}
		else {
			TorreHanoi(Num_discos-1,Torre_inicio,Torre_fin,Torre_aux);
			System.out.println("Moviendo disco de la torre de inicio "+Torre_inicio+" a la torre de destino "+Torre_fin);
			TorreHanoi(Num_discos -1, Torre_aux,Torre_inicio, Torre_fin);
		}
	}
}
