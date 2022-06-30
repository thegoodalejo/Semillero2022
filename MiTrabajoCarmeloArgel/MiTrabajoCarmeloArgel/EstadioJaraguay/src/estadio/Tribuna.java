package estadio;

import java.util.ArrayList;

public class Tribuna {

	int piso;
	int numeroFila;
	int contador;
	String infoUbicacion;

	ArrayList<Aficionado> listAficionado = new ArrayList<Aficionado>();

	public Tribuna(int piso, int numeroFila) {

		if (numeroFila <= 0) {
			this.numeroFila = 0;
		} else if (numeroFila > 30) {
			this.numeroFila = 30;
		} else {
			this.numeroFila = numeroFila;
		}
		
		this.piso = piso;
		this.contador = 0;
		this.infoUbicacion = "";

		if (this.numeroFila > 0 && this.numeroFila < 10) {
			infoUbicacion = String.valueOf(this.piso) + "-0"
					+ String.valueOf(this.numeroFila);
		} else {
			infoUbicacion = String.valueOf(this.piso) +"-"+ String.valueOf(this.numeroFila);
		}
	}
	
	public void ingresar(Aficionado aficionado) {
		
		contador++;
		System.out.println("\nAficionado ingresado: " + aficionado.nombre + " [" +aficionado.sexo+"]"+
				"\nTotal de aficionados: "+contador);
		listAficionado.add(aficionado);
	}

	public void resumen() {
		
		System.out.println("\n <<Informacion de ubicacion>>" +
				"\n[Piso:"+piso+"]"+" [Fila: "+numeroFila+"]"+" [Ubicacion: "+infoUbicacion+"]"+ 
				"\nLos aficionados ingresados a esta fila son: ");
		
		for (Aficionado aficionado : listAficionado) {
			System.out.println(aficionado.nombre+" ["+aficionado.sexo+"]");

		}
		System.out.println("Total aficionados: "+contador);
	}
}
