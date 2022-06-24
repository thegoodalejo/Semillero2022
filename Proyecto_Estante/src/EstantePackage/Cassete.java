package EstantePackage;

public class Cassete extends Estante implements IReproducible {
	int duracion;
	

	public Cassete(int duracion, String descripcion) {
		super(descripcion);
		this.duracion = duracion;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarDescripcion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo Cassete con duracion: "+duracion);
		
	}

	
	

}
