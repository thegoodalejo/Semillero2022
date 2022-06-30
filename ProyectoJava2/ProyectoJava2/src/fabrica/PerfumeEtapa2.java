package fabrica;

public class PerfumeEtapa2 {
	public InsumosEtapa1 insumos;
	public int cantidadFragancia;
	public int cantidadAlcohol;
	public int cantidadAlmizcle;
	public int cantidadFeromonas;
	
	public PerfumeEtapa2(InsumosEtapa1 insumos, int cantidadFragancia, int cantidadAlcohol, int cantidadAlmizcle, int cantidadFeromonas) {
		this.insumos = insumos;
		if (validarPerfume(insumos.getInsumos().envase.tamanio, cantidadFragancia, cantidadAlcohol, cantidadAlmizcle, cantidadFeromonas)) {
			this.cantidadFragancia = cantidadFragancia;
			this.cantidadAlcohol = cantidadAlcohol;
			this.cantidadAlmizcle = cantidadAlmizcle;
			this.cantidadFeromonas = cantidadFeromonas;
		}else {
			System.out.println("El total de cantidades de insumos supera el tamaño del envase...");
		}
		
	}
	
	public boolean validarPerfume(int tamanio, int cantidadFragancia, int cantidadAlcohol, int cantidadAlmizcle, int cantidadFeromonas) {
		int totalCantidades = cantidadFragancia + cantidadAlcohol + cantidadAlmizcle + cantidadFeromonas;
		
		return  totalCantidades <= tamanio ? true:false;
	}
	
	public PerfumeEtapa2 getPerfume() {
		return new PerfumeEtapa2(this.insumos,this.cantidadFragancia,this.cantidadAlcohol,this.cantidadAlmizcle,this.cantidadFeromonas);
	}
}
