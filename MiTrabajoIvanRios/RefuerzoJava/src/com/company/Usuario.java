package com.company;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Usuario {
	
	String cedula;
	TipoDeUsuario tipoDeUsuario;
	String nombre;
	String dateOfCreation = generateDateOfCreation();
	String placa = null;
	String celular;
	TipoDeVehiculo typeOfVehicle;
	
	public static ArrayList<Usuario> lstGlobalUsuarios = new ArrayList<Usuario>();
	
	public Usuario(String cedula, TipoDeUsuario tipoDeUsuario, String nombre, String placa, TipoDeVehiculo typeOfVehicle, String celular) {
		//Se almacenan los datos del nuevo usuario cuando tenga vehiculos como carro o moto
		this.cedula = cedula.toUpperCase();
		this.tipoDeUsuario = tipoDeUsuario;
		this.nombre = nombre;
		this.placa = placa;
		this.typeOfVehicle = typeOfVehicle;
		this.celular = celular;
		
		//Se almacena el usuario en la lista de usuarios
		lstGlobalUsuarios.add(this);
	}
	
	public Usuario(String cedula, TipoDeUsuario tipoDeUsuario, String nombre, TipoDeVehiculo typeOfVehicle, String celular) {
		//Se almacenan los datos del nuevo usuario cuando tenga vehículo como bicicleta o no tenga vehiculo
		this.cedula = cedula.toUpperCase();
		this.tipoDeUsuario = tipoDeUsuario;
		this.nombre = nombre;
		this.typeOfVehicle = typeOfVehicle;
		this.celular = celular;
		
		//Se almacena el usuario en la lista de usuarios
		lstGlobalUsuarios.add(this);
	}
	
	public String generateDateOfCreation() {
		DateTimeFormatter date = DateTimeFormatter.ofPattern("ddMMyyHHmmss");
		return date.format(LocalDateTime.now());
	}
	
	
	

}
