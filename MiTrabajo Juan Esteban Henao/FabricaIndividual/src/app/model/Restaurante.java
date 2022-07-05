package app.model;

import java.util.ArrayList;
import java.util.Scanner;

import app.model.alimentos.*;
import app.model.bebidas.*;
import app.services.*;

public class Restaurante {
	static Scanner consola = new Scanner (System.in);
	static Pedido pedido = null;
	static Etapa1 etapa1;
	static Etapa2 etapa2;
	static Etapa3 etapa3;
	static Consumible consumible;
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
			}else if(listaPedidos.isEmpty() && nuevoPedido == 2) {
				System.out.println("Gracias por venir");
			}else if(!listaPedidos.isEmpty() && nuevoPedido == 2) {
				resumenDePedidos();
			}
		}while(nuevoPedido != 2); 
		

	
		
	}
	
	private static void resumenDePedidos() {
		
		
	}

	public static void tomarEntrada() {
	 int entrada;
			System.out.println("Bienvenido al restaurante \n"
					+ "¿Qué entrada desea? \n"
					+ "1. Crema de tomate \n"
					+ "2. Ceviche");
			entrada = consola.nextInt();
			
			if (entrada == 1 || entrada == 2) {
				etapa1 = new Etapa1(pedido, consumible);
				
				
			}else {
				System.out.println("Debe ingresar un valor valido");
				tomarEntrada();
			}
		 
	}
	
	
	public static void inicializarDatos() {
		Ceviche ceviche = new Ceviche(16000, null);
		CremaTomate cremaTomate = new CremaTomate(19000, null);
		LomoCerdo lomoCerdo = new LomoCerdo(30000, null);
		Pasta pasta = new Pasta(27000, null);
		JugoMango jugoMango = new JugoMango(null, 5000);
		JugoMora jugoMora = new JugoMora(null, 5000);
		
		
	}


}