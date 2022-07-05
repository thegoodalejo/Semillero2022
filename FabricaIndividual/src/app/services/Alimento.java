package app.services;

public abstract class  Alimento extends Consumible{
	private String proporcionSal;
	

	public Alimento(int precio, String proporcionSal) {
		super(precio);
		this.proporcionSal = proporcionSal;
		// TODO Auto-generated constructor stub
	}


	public String getProporcionSal() {
		return proporcionSal;
	}


	public void setProporcionSal(String proporcionSal) {
		this.proporcionSal = proporcionSal;
	}



}
