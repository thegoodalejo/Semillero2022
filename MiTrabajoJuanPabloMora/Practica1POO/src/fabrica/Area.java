package fabrica;

import java.util.ArrayList;


public class Area {
	int division;
	int area;
	String descripcion;
	int capacidad;
	int contador=0;
	ArrayList<Equipo> listaEquipos = new ArrayList<Equipo>();
	ArrayList<Equipo> listaEquiposAtrasados = new ArrayList<Equipo>();

	
	public Area(int division, int area, String descripcion, int capacidad) {
		super();
		this.division = division;
		this.area = area;
		this.descripcion = descripcion;
		this.capacidad = capacidad;
	}
	
	public void ingresar(Equipo equipo) {
		contador++;
		System.out.println("Ingreso:  "+equipo.nombre+", Serie:"+equipo.serie+", Area: "+descripcion+", ---Total : "+contador);
		
		if (contador<=this.capacidad) {
		    listaEquipos.add(equipo);
		}else {
			listaEquiposAtrasados.add(equipo);
		}
	}
	
	public void enProceso() {
		System.out.println("");
		System.out.println("Equipos en Proceso: ");
		
		for(Equipo equipo : listaEquipos) {
			System.out.println("Nombre: "+equipo.nombre+" Serie: "+equipo.serie+" Ubicacion: Division "+division+" area "+area);
		}
		System.out.println("");
		System.out.println("Equipos Resagados/Atrasados: ");
		
		for(Equipo equipo : listaEquiposAtrasados) {
			System.out.println("Nombre: "+equipo.nombre+" Serie: "+equipo.serie+" Ubicacion Bodega: Division "+division+" area "+area);
		}
	}
	
	

}
