package hospital;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import practica1.Persona;

public class Main {

	public static void main(String[] args) {
		Sala numeroSala1 = new Sala();
		int salir = 0;

		while (salir == 0) {
			int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Opcion:\n" + "1. Agregar sala\n"
					+ "2. Ingresar persona a Sala\n" + "3. Listar personas en sala\n" + "4. Listar Salir\n"));
			
			switch (opcion) {
			case 1:
				numeroSala1.ingresarSala();
				break;
			case 2:
				Paciente paciente1=new Paciente("Juan", 1069742505,29, "3194766615");
				//numeroSala1.ingresarPersona(paciente1);
			case 3:
				numeroSala1.listarSala();
			case 4:
				salir = 1;
				break;
			}
			
		}

	}

}
