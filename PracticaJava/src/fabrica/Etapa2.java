package fabrica;

public class Etapa2 extends Fabricacion{

	
	public void iniciarEtapa() {
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
