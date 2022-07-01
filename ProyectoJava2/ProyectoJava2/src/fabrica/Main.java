package fabrica;

import java.util.Scanner;

public class Main {
	
	Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
	   
		Fragancia fragancia1=new Fragancia("Lacoste one", Genero.MASCULINA);
		Envase envase1= new Envase( "Single", 100);
		InsumosEtapa1 insumo1= new InsumosEtapa1(fragancia1, envase1);
		PerfumeEtapa2 perfume1= new PerfumeEtapa2(insumo1, 25, 25, 25, 25);
		TipoAtomizadorEtapa4 atomizador1= new TipoAtomizadorEtapa4(perfume1,TipoAtomizador.NORMAL);
		EmpaqueEtapa3 empaque1= new EmpaqueEtapa3(perfume1, 15,8 ,10,atomizador1);
		empaque1.informe();
		

	}
	
	public void agregarFragancia() {
		System.out.println("Nombre de la Fragancia: ");
		String nombreFragancia = leer.next();
		System.out.println("Género de la Fragancia");
		System.out.println("1. MASCULINO");
		System.out.println("2. FEMENINO");
		System.out.println("3. UNISEX");
		int genero = leer.nextInt();
		Fragancia frag1 = new Fragancia(nombreFragancia);
		switch(genero) {
		case 1:
			frag1.genero = Genero.MASCULINA;
			System.out.println("Fragancia "+frag1.nombre +" de genero "+frag1.genero+" creada correctamente...");
			break;
		case 2:
			frag1.genero = Genero.FEMENINA;
			System.out.println("Fragancia "+frag1.nombre +" de genero "+frag1.genero+" creada correctamente...");
			break;
		case 3:
			frag1.genero = Genero.UNISEX;
			System.out.println("Fragancia "+frag1.nombre +" de genero "+frag1.genero+" creada correctamente...");
			break;
		default:
			System.out.println("Opcion NO valida para el genero...");
			Fragancia.lstFragancias.remove(frag1);
			
		}
		
	}
	
	public void agregarEnvase() {
		System.out.println("Nombre del Envase: ");
		String nombreEnvase = leer.next();
		System.out.println("Tamanio del Envase: ");
		int tamanioEnvase = leer.nextInt();
		Envase env1 = new Envase(nombreEnvase,tamanioEnvase);
		System.out.println("Envase "+env1.nombre +" de "+env1.tamanio+" ml creado correctamente...");
	}

}
