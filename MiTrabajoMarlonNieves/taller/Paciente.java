package taller;

public class Paciente extends Persona {
	public boolean isHopitalize;
	public Paciente(String name, String gender, int age, boolean isHospitalize) {
		super(name, gender, age, isHospitalize);
	}
	
	public void nombrePaciente() {
		System.out.println("EL nombre del paciente es: "+name+"el genero es: "+gender+" y la edad que tiene es: "+ age+" El paciente esta hospitalizado: "+isHopitalize);
		
	}

	

}
