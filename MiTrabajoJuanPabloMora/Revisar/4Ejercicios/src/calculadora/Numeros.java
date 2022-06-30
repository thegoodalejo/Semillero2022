package calculadora;


import java.util.Scanner;

public abstract class Numeros {
	
	private double a;
	
	
	public double leerNumero() {
		double num=0;
		Scanner leer=new Scanner(System.in);
		System.out.println("Digite el numero, si ingresa decimal separe con , (coma) ");
		num=leer.nextDouble();
		return num;
	}
	public Numeros(double a) {
		super();
		this.a = a;
	}


	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	
	
	
	

}
