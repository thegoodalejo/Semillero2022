package fabrica;

import java.util.Scanner;

public class Etapa2 extends Fabricacion{
	
	//Calzado clasico
	public Calzado  iniciarEtapaClasico(Calzado clasico) {
		Clasico clasicoAux = new Clasico();
		System.out.println("\nIniciando Etapa 2");
		
		Scanner eleccion = new Scanner(System.in);
		System.out.println("\nElige los materiales para tu zapato: ");
		System.out.println(" - Digita 1 para Calzado Cuero");
		System.out.println(" - Digita 2 para Calzado Cuerina");
		System.out.println("Ingresa tu eleccion: ");
		int material = eleccion.nextInt();
		if(material == 1) {
			clasico.setMaterial("cuero");
		}else if(material == 2){
			clasico.setMaterial("cuerina");	
		}else {
			System.out.println("Opcion incorrecta");
		}
		System.out.println(clasico.getMaterial());
		
		return clasico;
		}
	
	//Calzado Deportivo
	public Calzado  iniciarEtapaDeportivo(Calzado deportivo) {
		System.out.println("\nIniciando Etapa 2");
		
		Scanner eleccion = new Scanner(System.in);
		System.out.println("\nElige los materiales para tu zapato: ");
		System.out.println(" - Digita 1 para Calzado Goma");
		System.out.println(" - Digita 2 para Calzado Tela");
		System.out.println(" - Digita 3 para Calzado Nailon");
		System.out.println("Ingresa tu eleccion: ");
		int material = eleccion.nextInt();
		if(material == 1) {
			deportivo.setMaterial("Goma");
		}else if(material == 2){
			deportivo.setMaterial("Tela");	
		}else if(material == 3){
			deportivo.setMaterial("Nailon");	
		}else {
			System.out.println("Opcion incorrecta");
		}
		System.out.println(deportivo.getMaterial());
		return deportivo;
	}

	
	@Override
	public int iniciarEtapa(Calzado calzado1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
