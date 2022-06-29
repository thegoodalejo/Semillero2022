package parqueadero;

import java.util.ArrayList;

public class Parqueadero {
	int pisoParqueadero;
	int numeroArea;
	int contador;
	String formatoArea;
	ArrayList<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();
	
	public Parqueadero(int pisoParqueadero, int numeroArea) {
		this.contador = 0;
		this.formatoArea = "";
		if(numeroArea <=0) {
			this.numeroArea = 0;	
		}
		if(numeroArea>30) {
			this.numeroArea = 30;
		}
		else {
			this.pisoParqueadero = pisoParqueadero*100;
			this.numeroArea = numeroArea;
			formatoArea = String.valueOf(this.pisoParqueadero+this.numeroArea);
		}
		
		
	}
	
	public void ingresarVehiculo(Vehiculo vehiculo) {
		contador++;
		String datosVehiculo = "Ingreso vehiculo con placa: "+vehiculo.placa+" Marca:"+vehiculo.marca+" Modelo: "+vehiculo.modelo+" Total vehiculos: "+contador;
		System.out.println(datosVehiculo);
		listaVehiculos.add(vehiculo);
	}
	public void resumenParqueadero() {
		System.out.println("Los vehiculos en el parqueadero: "+formatoArea+" son: ");
		for(Vehiculo vehiculo:listaVehiculos) {
			System.out.println(vehiculo.placa+" "+vehiculo.marca+" "+vehiculo.modelo);
		}
	}
	
	
	

}
