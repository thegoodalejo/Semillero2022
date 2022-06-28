package practicaHerencia;

public abstract class MedioDeTransporte {
	public String placa;
	public int modelo;
	
	
	public MedioDeTransporte(String placa, int modelo) {
		this.placa=placa;
		this.modelo=modelo;
		mensajeDeBienvenida();
		
	}
	
	public abstract void mensajeDeBienvenida();

	public abstract void enceder();
	

}
