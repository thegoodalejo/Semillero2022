package EstantePackage;

public abstract class EstanteNoReproducible extends Estante {
	

	public EstanteNoReproducible(String descripcion) {
		super(descripcion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public abstract void mostrarDescripcion();

}
