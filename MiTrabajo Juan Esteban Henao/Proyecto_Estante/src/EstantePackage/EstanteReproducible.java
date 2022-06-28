package EstantePackage;

public abstract class  EstanteReproducible extends Estante{
	


	public EstanteReproducible(String descripcion) {
		super(descripcion);
		// TODO Auto-generated constructor stub
	}
	
	
	public abstract void reproducir();


	@Override
	public void mostrarDescripcion() {
		// TODO Auto-generated method stub
		
	}

}
