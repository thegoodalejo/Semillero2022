package fabrica;

public class EmpaqueEtapa3 {
 public PerfumeEtapa2 perfume;
 public int alto,ancho,largo,dimension;
 public String nombrePerfume; 
 public TipoAtomizadorEtapa4 atomizador;
 
 public EmpaqueEtapa3(PerfumeEtapa2 perfume,int alto,int ancho,int largo, TipoAtomizadorEtapa4 atomizador ) {
	 this.perfume= perfume;
	 this.alto=alto;
	 this.ancho=ancho;
	 this.largo=largo;
	 this.dimension= (alto*ancho)*largo;
	 this.nombrePerfume= this.perfume.insumos.fragancia.nombre+" "+
	             this.perfume.insumos.fragancia.genero+
			 " "+this.perfume.insumos.envase.tamanio+"ml";
	 this.atomizador=atomizador;
 }
 
 public void informe() {
	 System.out.println("       INFORME PRODUCCIÓN PERFUME  ");
	 System.out.println("Perfume: "+this.nombrePerfume);
	 System.out.println("Etapa 1");
	 System.out.println("Fragancia: "+this.perfume.insumos.fragancia.nombre);
	 System.out.println("Genero: "+this.perfume.insumos.fragancia.genero);
	 System.out.println("Envase: "+this.perfume.insumos.envase.nombre);
	 System.out.println("Tamanio: "+this.perfume.insumos.envase.tamanio);
	 System.out.println("Etapa 2");
	 System.out.println("Cantidad de fragancia: "+this.perfume.cantidadFragancia+" ml");
	 System.out.println("Cantidad de alcohol: "+this.perfume.cantidadAlcohol+" ml");
	 System.out.println("Cantidad de almizcle: "+this.perfume.cantidadAlmizcle+" ml");
	 System.out.println("Cantidad de feromonas: "+this.perfume.cantidadFeromonas+" ml");
	 
	 System.out.println("Etapa 3");
	 System.out.println("Tipo de atomizador: "+this.atomizador.atomizador);
	 System.out.println("Dimension del empaque: "+this.dimension+"cc");
	 
	 
 }
  
 
}
