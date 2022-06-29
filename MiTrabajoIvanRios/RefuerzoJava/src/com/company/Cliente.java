package com.company;

public class Cliente extends Usuario{
	

	public Cliente(String cedula, TipoDeUsuario tipoDeUsuario, String nombre, String placa, TipoDeVehiculo typeOfVehicle, String celular) {
		super(cedula, tipoDeUsuario, nombre, placa, typeOfVehicle, celular);
	}
	
	public Cliente(String cedula, TipoDeUsuario tipoDeUsuario, String nombre, TipoDeVehiculo typeOfVehicle, String celular) {
		super(cedula,tipoDeUsuario, nombre, typeOfVehicle, celular);
	}

}
