package fabrica;

public class Clasico extends Calzado {

	public Clasico(String marca) {
		super(marca);

	}

	public Clasico(String marca, String material, String colorBase, String tipoCalzado) {
		super(marca, material, colorBase, tipoCalzado, tipoCalzado);

	}

}
