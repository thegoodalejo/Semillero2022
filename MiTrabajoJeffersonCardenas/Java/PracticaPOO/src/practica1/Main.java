package practica1;

public class Main {
	
	public static void main(String[] args) {
		
		//Estudiantes
		Estudiante estudiante1 = new Estudiante("Juan", 20);
		Estudiante estudiante2 = new Estudiante("Jefferson", 22);
		Estudiante estudiante3 = new Estudiante("Marlon", 21);
		
		//Maestros
		Maestro maestro1 = new Maestro("Alejandro", 27);
		
		//Salones
		Salon aula1 = new Aula(1, 101);
		Salon aula2 = new Aula(1, 102);
		Salon oficina = new Oficina(5, 501);
		
		//Agregamos alumnos al aula
		aula1.ingresar(estudiante1);
		aula1.ingresar(estudiante2);
		aula2.ingresar(estudiante3);
		
		//Agregamos maestros a la oficina 
		oficina.ingresar(maestro1);
		
		//Verificamos cuantas persona hay el cada salon
		System.out.println("*********************************************");
		aula1.resumen();
		
		System.out.println("*********************************************");
		aula2.resumen();
		
		System.out.println("*********************************************");
		oficina.resumen();
	}

}
