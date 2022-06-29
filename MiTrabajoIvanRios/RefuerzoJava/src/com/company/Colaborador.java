package com.company;

public class Colaborador extends Usuario{
	String cargo;
	public Colaborador(String cedula, TipoDeUsuario tipoDeUsuario, String nombre, String placa, TipoDeVehiculo typeOfVehicle, String celular, String cargo) {
		super(cedula, tipoDeUsuario, nombre, placa, typeOfVehicle, celular);
		this.cargo = cargo;
	}
	
	public Colaborador(String cedula, TipoDeUsuario tipoDeUsuario, String nombre, TipoDeVehiculo typeOfVehicle, String celular, String cargo) {
		super(cedula, tipoDeUsuario, nombre, typeOfVehicle, celular);
		this.cargo = cargo;
	}
	
}
