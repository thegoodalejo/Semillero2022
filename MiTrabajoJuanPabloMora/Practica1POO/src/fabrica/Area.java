package fabrica;

import java.util.ArrayList;


public class Area {
	int division;
	int area;
	String descripcion;
	int capacidad;
	int contador=0;
	ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();

	
	public Area(int division, int area, String descripcion, int capacidad) {
		super();
		this.division = division;
		this.area = area;
		this.descripcion = descripcion;
		this.capacidad = capacidad;
	}
	
	public void ingresar(Equipo equipo) {
		contador++;
		System.out.println("Ingreso:  "+equipo.nombre+" --- Total Equipos: "+contador);
		listaEquipos.add(equipo);
	}
	
	public void enProceso() {
		System.out.println("Equipos en Proceso: ");		
		for(Equipo equipo : listaEquipos) {
			System.out.println(equipo.nombre);
		}
	}
	
	

}
