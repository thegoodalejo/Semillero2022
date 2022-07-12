package fabrica;

public class Arepa extends Main {

	private String ingredientes;
	private String tipoArepa;
	private String tamanoArepa;
	private String temperatura;
	private int tamano;

	public Arepa() {

	}

	public Arepa(int tamano) {
		this.tamano = tamano;
	}

	public Arepa(String temperatura) {
		this.temperatura = temperatura;
	}

	public Arepa(String ingredientes, String tipoArepa, String tamanoArepa, String temperatura) {
		super();
		this.ingredientes = ingredientes;
		this.tipoArepa = tipoArepa;
		this.tamanoArepa = tamanoArepa;
		this.temperatura = temperatura;

	}

	public Arepa(String ingredientes, String tipoArepa) {
		// TODO Auto-generated constructor stub
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getTipoArepa() {
		return tipoArepa;
	}

	public void setTipoArepa(String tipoArepa) {
		this.tipoArepa = tipoArepa;
//		switch (this.tipoArepa) {
//		case "Mixta":
//			Etapa2.iniciarEtapaMixta(this);
//			break;
//		case "Especial":
//			Etapa2.iniciarEtapaEspecial(this);
//			break;
//		default:
//			break;
//			
//		}

	}

	public String getTamanoArepa() {
		return tamanoArepa;
	}

	public void setTamanoArepa(String tamanoArepa) {
		this.tamanoArepa = tamanoArepa;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
//		switch (this.temperatura) {
//		case "Tibio":
//			Etapa3.iniciarEtapaDetalles(this);
//			break;
//		case "Caliente":
//			Etapa3.iniciarEtapaDetalles(this);
//			break;
//		default:
//			break;
//		}
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return "Resumen Elaboracion Arepa" + "\n+Tamano Arepa: " + tamanoArepa + "\n+tipoArepa: " + tipoArepa
				+ "\n+Ingredientes: " + ingredientes + "\n+Temperatura: " + temperatura;
	}

}
