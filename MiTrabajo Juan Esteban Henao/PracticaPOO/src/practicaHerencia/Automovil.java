package practicaHerencia;

public class Automovil extends MedioDeTransporte {
	
	public int kilometraje;

	public Automovil(String placa, int modelo, int Kilometraje) {
		super(placa, modelo);
		this.kilometraje=Kilometraje;
	}

	@Override
	public void mensajeDeBienvenida() {
		System.out.println("Se agrego el automovil con la placa: "+placa
				+ "con modelo "+ modelo);
		
	}

	@Override
	public void enceder() {
		System.out.println("Se ha encendido el automovil de placa: "+ placa
				+ "con un kilometraje de: "+kilometraje);
		
	}

}
