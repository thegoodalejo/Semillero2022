package practica1;

public class Main {
	
	public static void main(String[] args) {
		
		Estudiante estudiante1 = new EstudianteNativo("Juan", 20,"ESPAÑOL");
		Estudiante estudiante2 = new EstudianteNativo("Jefferson", 22,"ESPAÑOL");
		Estudiante estudiante3 = new EstudianteNativo("Ivan", 31,"ESPAÑOL");
		Estudiante estudiante4 = new EstudianteExtranjero("Santiago", 25,"ITALIANO");
		Estudiante estudiante5 = new EstudianteExtranjero("Juan Pablo", 30,"ITALIANO");
		Estudiante estudiante6 = new EstudianteExtranjero("Carmelo", 24,"RUSO");
		Estudiante estudiante7 = new EstudianteExtranjero("Mario", 26,"ITALIANO");
		Estudiante estudiante8 = new EstudianteExtranjero("Marlon", 23,"RUSO");
		Estudiante estudiante9 = new EstudianteExtranjero("Juan Sebastian", 29,"ITALIANO");
		
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
		
		aula1.iniciarClase();
		
		aula1.resumen();
		aula2.resumen();
		aula3.resumen();
		oficina1.resumen();
		
		
		aula1.iniciarClase();
		aula2.iniciarClase();
		aula3.iniciarClase();
	}
}
