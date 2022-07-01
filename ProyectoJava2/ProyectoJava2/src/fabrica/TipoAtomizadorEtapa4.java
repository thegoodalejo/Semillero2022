package fabrica;

public class TipoAtomizadorEtapa4 {

	 public PerfumeEtapa2 perfume;
	 public TipoAtomizador atomizador;
	
	 public TipoAtomizadorEtapa4 (PerfumeEtapa2 perfume,TipoAtomizador atomizador ) {
		 
		 this.perfume= perfume;
		 this.atomizador= atomizador;
		 
	 }
	
 public TipoAtomizadorEtapa4 (PerfumeEtapa2 perfume) {
		 
		 this.perfume= perfume;
		 this.atomizador= TipoAtomizador.NORMAL;
		 
	 }
	 
	 
 
 
	
}
