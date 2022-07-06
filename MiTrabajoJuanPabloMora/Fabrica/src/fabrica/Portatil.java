package fabrica;

public class Portatil extends Equipo{
	
	private int nucleos;
	private int memoriaRam;
	private int discoDuro;
	private int memoriaVideo;
	private int PadMouse;
	private int Morral;
	private int BaseRefrigerante;
	

	public int getPadMouse() {
		return PadMouse;
	}

	public void setPadMouse(int padMouse) {
		PadMouse = padMouse;
	}

	public int getMorral() {
		return Morral;
	}

	public void setMorral(int morral) {
		Morral = morral;
	}

	public int getBaseRefrigerante() {
		return BaseRefrigerante;
	}

	public void setBaseRefrigerante(int baseRefrigerante) {
		BaseRefrigerante = baseRefrigerante;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public int getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public int getDiscoDuro() {
		return discoDuro;
	}

	public void setDiscoDuro(int discoDuro) {
		this.discoDuro = discoDuro;
	}

	public int getMemoriaVideo() {
		return memoriaVideo;
	}

	public void setMemoriaVideo(int memoriaVideo) {
		this.memoriaVideo = memoriaVideo;
	}

	


	public Portatil(int nucleos, int memoriaRam, int discoDuro, int memoriaVideo, int padMouse, int morral,
			int baseRefrigerante) {
		super();
		this.nucleos = nucleos;
		this.memoriaRam = memoriaRam;
		this.discoDuro = discoDuro;
		this.memoriaVideo = memoriaVideo;
		this.PadMouse = padMouse;
		this.Morral = morral;
		this.BaseRefrigerante = baseRefrigerante;
	}

	public Portatil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Portatil(String nombre, String modelo) {
		super(nombre, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\nConfiguracion COMLETA Portatil"+"\nNombre= " + getNombre()+"\nModelo= " + getModelo()+" \nNucleos del Procesador= " + nucleos + "\nMemoria Ram= " + memoriaRam + "\nDisco Duro= " + discoDuro
				+ "\nMemoria Gravicad de Video=" + memoriaVideo+ "\nPad Mouse=" + PadMouse + "\nMaleta Portatil=" + Morral + "\nBase Refrigerante=" + BaseRefrigerante+"\nValor (Dolares)= " + getValor()+" Dolares";
	}
	
	public String resumenParcialEtapa2() {
		return "\nConfiguracion PARCIAL Portatil"+" \nNucleos del Procesador= " + nucleos + "\nMemoria Ram= " + memoriaRam + "\nDisco Duro= " + discoDuro
				+ "\nMemoria Video= " + memoriaVideo+"\nValor (Dolares)= " + getValor()+" Dolares";
	}
	
	
	

}
