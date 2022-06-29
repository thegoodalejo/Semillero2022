package hospital;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import practica1.Persona;

public class Sala {
	int numeroSala;
	ArrayList<Persona> lstPersonas = new ArrayList<Persona>();
	ArrayList<Sala> lstSalas = new ArrayList<Sala>();

	public Sala(int numeroSala) {
		this.numeroSala = numeroSala;
	}
	public Sala() {
		
	}
	
	public void ingresarSala() {
		int salaNueva=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Sala:\n"));
		Sala numeroSala1=new Sala(salaNueva);
		lstSalas.add(numeroSala1);
	}
	
	public void ingresarPersona(Persona persona) {
		
	lstPersonas.add(persona);
	}
	
	public void listarSala() {
		
		for (Sala sala : lstSalas) {
			System.out.println("Sala numero :"+sala.numeroSala);
		}
	}

}
