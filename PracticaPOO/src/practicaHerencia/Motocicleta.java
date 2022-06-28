package practicaHerencia;

public class Motocicleta extends MedioDeTransporte {
	
	public int velocidadMaxima;

	public Motocicleta(String placa, int modelo, int velocidadMaxima) {
		super(placa, modelo);
		this.velocidadMaxima=velocidadMaxima;
		
	}

	@Override
	public void enceder() {
		System.out.println("Se ha encendido la motocicleta de placa: "+ placa);
		
	}

	@Override
	public void mensajeDeBienvenida() {
		System.out.println("Se agrego la motocicleta con la placa: "+placa
				+ "con modelo "+ modelo);
		
	}
	
	

}
