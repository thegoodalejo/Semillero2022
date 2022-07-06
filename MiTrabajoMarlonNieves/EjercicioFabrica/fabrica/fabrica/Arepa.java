package fabrica;

public class Arepa extends Main {

	private String ingredientes;
	private String tipoArepa;
	private String tamanoArepa;
	private String temperatura;

	

	public Arepa() {

	}
	

	public Arepa(String ingredientes,  String tipoArepa, String tamanoArepa, String temperatura) {
		super();
		this.ingredientes = ingredientes;
		this.tipoArepa = tipoArepa;
		this.tamanoArepa = tamanoArepa;
		this.temperatura = temperatura;

	}

	

	public Arepa(String ingredientes2, String tipoArepa2) {
		// TODO Auto-generated constructor stub
	}


	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String gettipoArepa() {
		return tipoArepa;
	}

	public void settipoCalzado(String tipoArepa) {
		this.tipoArepa = tipoArepa;

	}
	public String gettamanoArepa() {
		return tamanoArepa;
	}

	public void settamanoArepa(String tamanoArepa) {
		this.tamanoArepa = tamanoArepa;
	}
	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "Resumen elaboracion Arepa" + "\ntipoArepa=" + tipoArepa + ",\nMaterial=" + ingredientes;
	}

}
