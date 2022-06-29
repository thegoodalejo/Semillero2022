package practica1;

public class Main {
	
	public static void main(String[] args) {
		
		Estudiante estudiante1 = new Estudiante("Juan", 20, "Italiano");
		Estudiante estudiante2 = new Estudiante("Jefferson", 22, "Ruso");
		Estudiante estudiante3 = new Estudiante("Ivan", 31);
		Estudiante estudiante4 = new Estudiante("Santiago", 25);
		Estudiante estudiante5 = new Estudiante("Juan Pablo", 30);
		Estudiante estudiante6 = new Estudiante("Carmelo", 24);
		Estudiante estudiante7 = new Estudiante("Mario", 26);
		Estudiante estudiante8 = new Estudiante("Marlon", 23);
		Estudiante estudiante9 = new Estudiante("Juan Sebastian", 29);
		
		Maestro maestro1 = new Maestro("Alejandro", 27);
		Maestro maestro2 = new Maestro("Rigoberto", 33);
		
		//Instanciamos aula y oficina
		Aula aula1 = new Aula(12,593);
		Aula aula2 = new Aula(15,40);
		Aula aula3 = new Aula(20,200);
		Oficina oficina1 = new Oficina(5,12);
		
		//Se agregan estudiantes
		aula1.ingresar(estudiante1);
		aula1.ingresar(estudiante2);
		aula1.ingresar(estudiante3);
		aula2.ingresar(estudiante4);
		aula2.ingresar(estudiante5);
		aula2.ingresar(estudiante6);
		aula3.ingresar(estudiante7);
		aula3.ingresar(estudiante8);
		aula3.ingresar(estudiante9);
		
		
		
		oficina1.ingresar(maestro1);
		oficina1.ingresar(maestro2);
		
		aula1.resumen();
		aula2.resumen();
		aula3.resumen();
		oficina1.resumen();
	}
}
