package fabrica;

public class Main {

	public static void main(String[] args) {
	   
		Fragancia fragancia1=new Fragancia("Lacoste one", Genero.MASCULINA);
		Envase envase1= new Envase( "Single", 100);
		InsumosEtapa1 insumo1= new InsumosEtapa1(fragancia1, envase1);
		PerfumeEtapa2 perfume1= new PerfumeEtapa2(insumo1, 25, 25, 25, 25);
		TipoAtomizadorEtapa4 atomizador1= new TipoAtomizadorEtapa4(perfume1,TipoAtomizador.NORMAL);
		EmpaqueEtapa3 empaque1= new EmpaqueEtapa3(perfume1, 15,8 ,10,atomizador1);
		empaque1.informe();
		

	}

}