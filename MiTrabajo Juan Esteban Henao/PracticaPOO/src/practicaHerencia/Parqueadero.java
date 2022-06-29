package practicaHerencia;

import java.util.ArrayList;
import java.util.Iterator;


public class Parqueadero {

	 static final int CAPACIDADMAXIMA = 10;
	 public int cantidad;
	 ArrayList<MedioDeTransporte> vehiculosEnParqueadero;
	 
	 public Parqueadero() {
		 cantidad =0;
		 vehiculosEnParqueadero = new ArrayList<>();
		 
	 }
	 // metodo de agregar vehiculos que valida que no se encuentren repetidos
	 public void agregarVehiculo (MedioDeTransporte vehiculo) {
		 boolean bandera = false;
		 if (cantidad ==0) {
			 System.out.println("Ingresa el vehiculo de placa: "+vehiculo.placa+" al parqueadero");
			 vehiculosEnParqueadero.add(vehiculo);
			 cantidad++; 
			 mostrarResumen();
		 }else {
			 if(cantidad<=CAPACIDADMAXIMA ) {
				 for (int i = 0; i < vehiculosEnParqueadero.size() && bandera == false; i++) {
					 if(!vehiculosEnParqueadero.get(i).placa.equalsIgnoreCase(vehiculo.placa)) {
						 System.out.println("Ingresa el vehiculo de placa: "+vehiculo.placa+" al parqueadero");
						 vehiculosEnParqueadero.add(vehiculo);
						 cantidad++; 
						 mostrarResumen();
						 bandera = true;
					 }else {
						 System.out.println("Ya se encuentra un vehiculo con la placa: "+vehiculo.placa);
					 }
				 }

			 }else {
				 System.out.println("El parqueadero se encuentra lleno");
			 }
		 }
	 }
	 private void mostrarResumen() {
		 System.out.println("Se encuentran los siguientes vehiculos en el parqueadero");
		for (MedioDeTransporte medioDeTransporte : vehiculosEnParqueadero) {
			System.out.print(medioDeTransporte.placa+ ", ");
		}
		System.out.println("El parqueadero actualmente tiene: "+cantidad+" vehiculos");
	}

	public void retirarVehiculo(String placa) {
		 for (int i = 0; i < vehiculosEnParqueadero.size(); i++) {
			if(vehiculosEnParqueadero.get(i).placa.equalsIgnoreCase(placa)) {
				vehiculosEnParqueadero.remove(i);
				cantidad--;
			}
		}
	 }
	 
}
