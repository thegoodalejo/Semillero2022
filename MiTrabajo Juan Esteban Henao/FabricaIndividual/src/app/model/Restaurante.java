package app.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import app.model.alimentos.*;
import app.model.bebidas.*;
import app.services.*;

public class Restaurante {
	static Scanner consola = new Scanner (System.in);
	static Pedido pedido = new Pedido();
	static Etapa1 etapa1;
	static Etapa2 etapa2;
	static Etapa3 etapa3;
	static Consumible consumible;
	static CremaTomate cremaTomate;
	static Ceviche ceviche;
	static LomoCerdo lomoCerdo;
	static Pasta pasta;
	static JugoMango jugoMango;
	static JugoMora jugoMora;
	static ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();


	public static void iniciarPedido() {
		
		int nuevoPedido= -1;
		
		do {
			System.out.println("Bienvenido al restaurante \n"
					+ "¿Desea realizar un pedido? \n"
					+ "1. Si  \n"
					+ "2. No");
			nuevoPedido = consola.nextInt();
			if(nuevoPedido == 1) {
				tomarEntrada();
				tomarFuerte();
				tomarBebida();
				listaPedidos.add(pedido);
				pedido = new Pedido();
			}else if(listaPedidos.isEmpty() && nuevoPedido == 2) {
				System.out.println("Gracias por venir");
			}else if(!listaPedidos.isEmpty() && nuevoPedido == 2) {
				resumenDePedidos();
			}
		}while(nuevoPedido != 2); 
		

	
		
	}
	


	private static void resumenDePedidos() {
		System.out.println("El pedido tuvo: ");
		for (Pedido pedido : listaPedidos) {
			for (int i = 0; i < pedido.getComida().size(); i++) {
				System.out.println("El consumible: " + pedido.getComida().get(i).getClass().getSimpleName() 
						+ " por el valor de: " +pedido.getComida().get(i).getPrecio());
			}
		}
		total();
	}

	public static void total() {
		int total=0;
		for (Pedido pedido : listaPedidos) {
			for (int i = 0; i < pedido.getComida().size(); i++) {
				total += pedido.getComida().get(i).getPrecio();
			}
		}
		System.out.println("El total es: " +total);
	}
	
	public static void tomarEntrada() {
	 int entrada;
			System.out.println("Bienvenido al restaurante \n"
					+ "¿Qué entrada desea? \n"
					+ "1. Crema de tomate \n"
					+ "2. Ceviche");
			entrada = consola.nextInt();

			
			if (entrada == 1 || entrada == 2) {
				crearConsumibleEntrada(entrada);
				etapa1 = new Etapa1(pedido, consumible);
				pedido = etapa1.getPedido();
				
				
			}else {
				System.out.println("Debe ingresar un valor valido");
				tomarEntrada();
			}
		 
	}
	
	
	private static void crearConsumibleEntrada(int entrada) {
		switch (entrada) {
		case 1:
			 consumible = cremaTomate;
			break;
		case 2:
			consumible = ceviche;
		break;
		}
	}
	
	private static void tomarFuerte() {
		 int fuerte;
			System.out.println( "¿Qué plato fuerte desea? \n"
					+ "1. Lomo de cerdo \n"
					+ "2. Pasta");
			fuerte = consola.nextInt();

			
			if (fuerte == 1 || fuerte == 2) {
				crearConsumibleFuerte(fuerte);
				etapa2 = new Etapa2(pedido, consumible);
				pedido = etapa2.getPedido();
				
				
			}else {
				System.out.println("Debe ingresar un valor valido");
				tomarFuerte();
			}
		
	}
	private static void crearConsumibleFuerte(int fuerte) {
		switch (fuerte) {
		case 1:
			 consumible = lomoCerdo;
			break;
		case 2:
			consumible = pasta;
		break;
		}
	}
	
	private static void tomarBebida() {
		 int bebida;
			System.out.println( "¿Qué bebida desea? \n"
					+ "1. Jugo mora \n"
					+ "2. Jugo mango");
			bebida = consola.nextInt();

			
			if (bebida == 1 || bebida == 2) {
				crearConsumibleBebida(bebida);
				etapa3 = new Etapa3(pedido, consumible);
				pedido = etapa3.getPedido();
				
				
			}else {
				System.out.println("Debe ingresar un valor valido");
				tomarBebida();
			}
		
	}
	
	private static void crearConsumibleBebida(int bebida) {
		switch (bebida) {
		case 1:
			 consumible = jugoMora;
			break;
		case 2:
			consumible = jugoMango;
		break;
		}
	}
	

	public static void inicializarDatos() {
		
		cremaTomate = new CremaTomate(19000, null);
		ceviche = new Ceviche(16000, null);
		lomoCerdo = new LomoCerdo(30000, null);
		pasta = new Pasta(27000, null);
		jugoMango = new JugoMango(null, 5000);
		jugoMora = new JugoMora(null, 5000);
		Nevera.listaConsumiblesTotales.add(cremaTomate);
		Nevera.listaConsumiblesTotales.add(ceviche);
		Nevera.listaConsumiblesTotales.add(lomoCerdo);
		Nevera.listaConsumiblesTotales.add(pasta);
		Nevera.listaConsumiblesTotales.add(jugoMora);
		Nevera.listaConsumiblesTotales.add(jugoMango);
		
		
	}


}