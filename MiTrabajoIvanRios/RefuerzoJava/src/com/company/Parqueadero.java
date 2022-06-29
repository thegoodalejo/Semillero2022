package com.company;

public class Parqueadero {
	TipoDeUsuario tipoDeUsuario;
	int codigo;
	String puesto;
	Estado estado;
	Usuario usuario = null;
	
	public Parqueadero(TipoDeUsuario tipoDeUsuario, int codigo, Estado estado) {
		this.tipoDeUsuario = tipoDeUsuario;
		this.codigo = codigo < 1 ? 1: codigo;
		this.codigo = this.codigo > 30 ? 30: this.codigo;
		this.puesto = this.tipoDeUsuario+String.valueOf(this.codigo);
		if (this.codigo>=1 && this.codigo<=9) this.puesto = this.tipoDeUsuario+"0"+String.valueOf(this.codigo);
		this.estado = estado;
		
	}
	
	public void ingresarUsuario(Usuario usuario) {
		if (usuario.tipoDeUsuario.equals(tipoDeUsuario) && (this.estado.equals(Estado.DISPONIBLE))) {
			this.usuario = usuario;
			System.out.println("Usuario "+this.usuario.nombre+" ingresa vehiculo al puesto "+this.puesto);
		}else {
			System.out.println("Este usuario no puede parquearse en este puesto...");
		}
		
	}

}
