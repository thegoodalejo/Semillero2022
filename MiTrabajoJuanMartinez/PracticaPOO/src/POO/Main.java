package POO;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
//		Scanner tc = new Scanner(System.in);
//		
//		List<Persona> contactos = new ArrayList();
//		
//		
//		for(int i = 0; i < 2; i++) {
//			
//			Persona contacto = new Persona();
//			
//			System.out.println("Ingrese nombre: ");
//			contacto.nombre = tc.next();
//			
//			System.out.println("Ingrese edad: ");
//			contacto.edad = tc.nextInt();
//			
//			contactos.add(contacto);
//			
//		}
//		
//		for(Persona item : contactos ) {
//			if(item.nombre.equals("titi")) {
//				System.out.println(item.edad);
//			}
//			
//		}
		
		Persona persona = new Mutante("marlon", 20);
		
		System.out.println(persona.nombre);
		
		
	
	}

}
