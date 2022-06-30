package fabrica;

public class Etapa1 extends Fabricacion {

	@Override
	public void iniciarEtapa(Calzado calzado) {
		System.out.println("Iniciando Etapa 1");
		
	}

	@Override
	public void EtapaEnProceso() {
		System.out.println("En proceso Etapa 1");
		
	}

	@Override
	public void FinalizarEtapa() {
		System.out.println("Finalizando Etapa 1");
		
	}
	
	

}
