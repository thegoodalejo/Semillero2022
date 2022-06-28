package model;

public class Cafe {
	
	private String tipo;
	private int cantidad_ml;
	private String tipoGrano;
	
	
	public Cafe(String tipo, int cantidad, String tipoGrano) {
		this.cantidad_ml=cantidad;
		this.tipo=tipo;
		this.tipoGrano=tipoGrano;

	}


	public String getTipo() {
		return tipo;
	}


	public int getCantidad_ml() {
		return cantidad_ml;
	}


	public String getTipoGrano() {
		return tipoGrano;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public void setCantidad_ml(int cantidad_ml) {
		this.cantidad_ml = cantidad_ml;
	}


	public void setTipoGrano(String tipoGrano) {
		this.tipoGrano = tipoGrano;
	}

	
	

}
