package taller;

import java.util.ArrayList;

public class Habitacion {
	int floor;
	int roomNumber;
	int counter;
	String roomFormat;
	ArrayList<Persona> listPersonas = new ArrayList<Persona>();
	
	public Habitacion(int floor) {
//		if(roomNumber > 99) roomNumber = 99;
//		if(roomNumber < 0) roomNumber = 0;
		
		this.floor = floor;
		this.counter = 0;
		this.roomFormat = "";
		if(this.roomNumber > 0 && this.roomNumber < 10) {
			roomFormat = String.valueOf(this.floor) +""+ String.valueOf(roomNumber);
		}else {
			roomFormat = String.valueOf(this.floor) + String.valueOf(this.roomNumber);
			}
		}
	
	public void enter(Persona persona) {
		counter++;
		System.out.println("Ingreso: "+persona.name+" El genero es: "+persona.gender+" la edad es: "+persona.age+" esta hospitalizado: "+persona.isHospitalize+" Total personas: "+counter);
		listPersonas.add(persona);
	}
	
	public void sumary() {
		System.out.println("La cantidad de personas en la habitacion es:  "+roomFormat);
		for(Persona persona : listPersonas) {
			System.out.println(persona.name);
		}
	}
	
	
}
