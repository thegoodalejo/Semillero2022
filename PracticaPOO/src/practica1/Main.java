package practica1;

public class Main {
	
	public static void main(String[] args) {
		
		Estudiante estudiante1 = new Estudiante("Juan", 20);
		Estudiante estudiante2 = new Estudiante("Jefferson", 22);
		Estudiante estudiante3 = new Estudiante("Ivan", 31);
		Estudiante estudiante4 = new Estudiante("Santiago", 25);
		Estudiante estudiante5 = new Estudiante("Juan Pablo", 30);
		Estudiante estudiante6 = new Estudiante("Carmelo", 24);
		Estudiante estudiante7 = new Estudiante("Mario", 26);
		
		Maestro maestro1 = new Maestro("Alejandro", 27);
		Maestro maestro2 = new Maestro("Rigoberto", 33);
		//Instanciamos aula y oficina
		
		Aula aula1 = new Aula(1,101);
		Oficina oficina1 = new Oficina(5,501);
		
		
		aula1.ingresar(estudiante1);
		aula1.ingresar(estudiante2);
		aula1.ingresar(estudiante3);
		aula1.ingresar(estudiante4);
		aula1.ingresar(estudiante5);
		aula1.ingresar(estudiante6);
		aula1.ingresar(estudiante7);


		oficina1.ingresar(maestro1);
		oficina1.ingresar(maestro2);
		
		aula1.resumen();
		oficina1.resumen();
		
	}

}
