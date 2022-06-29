package com.company;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("001",TipoDeUsuario.CLI,"Jose Ramirez","ABC123",TipoDeVehiculo.CARRO,"3105555555");
		Cliente cliente2 = new Cliente("002",TipoDeUsuario.CLI,"Maria Morales",TipoDeVehiculo.BICICLETA,"3152223344");
		
		Colaborador colaborador1 = new Colaborador("001", TipoDeUsuario.COL,"Camila Vallejo","HOY286",TipoDeVehiculo.CARRO,"3105555555","Project Leader");
		Colaborador colaborador2 = new Colaborador("001", TipoDeUsuario.COL,"Gerardo Torres","EFG04D",TipoDeVehiculo.MOTO,"3105555555","Product Owner");
		
		ParqueoClientes puesto1 = new ParqueoClientes(TipoDeUsuario.CLI,1,Estado.RESERVADO);
		ParqueoClientes puesto2 = new ParqueoClientes(TipoDeUsuario.CLI,2,Estado.DISPONIBLE);
		
		ParqueoColaboradores puesto3 = new ParqueoColaboradores(TipoDeUsuario.COL,1,Estado.DISPONIBLE);
		ParqueoColaboradores puesto4 = new ParqueoColaboradores(TipoDeUsuario.COL,2,Estado.OCUPADO);
		
		
		  puesto1.ingresarUsuario(colaborador1); puesto1.ingresarUsuario(cliente1);
		  
		  puesto2.ingresarUsuario(cliente1); puesto3.ingresarUsuario(cliente2);
		  puesto3.ingresarUsuario(colaborador1);
		  
		  puesto4.ingresarUsuario(colaborador2);
		 
	}

}
