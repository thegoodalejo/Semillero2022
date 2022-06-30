package Calculadora;

public class Calculadora {
	
	private int num1;
	private int num2;
	
	public Calculadora(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int sumarNumeros() {
		int resultado = this.num1 + this.num2;
		System.out.println("El resultaldo de la suma es: "+resultado);
		return resultado;
	}
	
	public int restarNumeros() {
		int resultado = this.num1 - this.num2;
		System.out.println("El resultaldo de la resta es: "+resultado);
		return resultado;
	}
	
	public int multiplicarNumeros() {
		int resultado = this.num1 * this.num2;
		System.out.println("El resultaldo de la multiplicacion es: "+resultado);
		return resultado;
	}
	
	public double dividirNumeros() {
		double resultado = (double)this.num1/ (double)this.num2;
		System.out.println("El resultaldo de la division es: "+resultado);
		return resultado;
	}
}
