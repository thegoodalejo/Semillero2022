package taller;

public class Main {
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente("Marlon", "M", 23, true);
		Paciente paciente2 = new Paciente("Samantha", "F", 3, false);
		
		
		Doctor doctor1 = new Doctor("Alejandro", "M", 28, false);
		
		Cuarto cuarto1 = new Cuarto(5);
		Hospital hospital = new Hospital(5);
		
		
		cuarto1.enter(paciente1);
		cuarto1.enter(paciente2);
		
		hospital.enter(doctor1);
		
		//sumary
		cuarto1.sumary();
		hospital.sumary();
		
	}
	
	
		
	

	
	
}


