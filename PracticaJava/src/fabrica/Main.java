package fabrica;

public class Main {

	public static void main(String[] args) {
		
		Etapa1 etapa1 = new Etapa1();
		Etapa2 etapa2 = new Etapa2();
		Etapa3 etapa3 = new Etapa3();
		
		Deportivo deportivo = new Deportivo();
		
		etapa1.iniciarEtapa(deportivo);
		etapa1.EtapaEnProceso();
		etapa1.FinalizarEtapa();
		
		etapa2.iniciarEtapa(deportivo);
		etapa2.EtapaEnProceso();
		etapa2.FinalizarEtapa();
		
		etapa3.iniciarEtapa(deportivo);
		etapa3.EtapaEnProceso();
		etapa3.FinalizarEtapa();
		
		

	}

}
