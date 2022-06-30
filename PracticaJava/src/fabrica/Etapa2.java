package fabrica;

public class Etapa2 extends Fabricacion{

	@Override
	public void iniciarEtapa(Calzado calzado) {
		System.out.println("Iniciando Etapa 2");
		
	}

	@Override
	public void EtapaEnProceso() {
		System.out.println("En proceso Etapa 2");
		
	}

	@Override
	public void FinalizarEtapa() {
		System.out.println("Finalizando Etapa 2");
		
	}

	
}
