package taller;

public class Doctor extends Persona {

//	Doctor(String name, String gender, int age) {
//		super(name, gender, age);
//		// TODO Auto-generated constructor stub
//	}
	public Doctor(String name, String gender, int age, boolean isHospitalize) {
		super(name, gender, age, false);
	}
	public void nombreDoctor() {
		System.out.println("El nombre del doctor es: "+name);
	}
//	String especiality;
}
