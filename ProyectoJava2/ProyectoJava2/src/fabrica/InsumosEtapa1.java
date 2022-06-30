package fabrica;

public class InsumosEtapa1 {
	public Fragancia fragancia;
	public Envase envase;
	
	public InsumosEtapa1(Fragancia fragancia, Envase envase) {
		this.fragancia = fragancia;
		this.envase = envase;
	}
	
	public InsumosEtapa1 getInsumos() {
		return new InsumosEtapa1(this.fragancia,this.envase);
	}

}
