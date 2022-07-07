package fabrica;

public class Portatil extends Equipo{
	
	//Atributos
	//------------------------------------------------------------------------------------------------------------------------------------
	private int nucleos;
	private int memoriaRam;
	private int discoDuro;
	private int memoriaVideo=0;
	private int PadMouse=0;
	private int Morral=0;
	private int BaseRefrigerante=0;
	
	//Constructores
	//------------------------------------------------------------------------------------------------------------------------------------
	
	public Portatil() {
		super();
	}

	public Portatil(String nombre, String modelo) {
		super(nombre, modelo);
	}

	//Metodos 
	//------------------------------------------------------------------------------------------------------------------------------------	

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

	//------------------------------------------------------------------------------------------------------------------------------------

	@Override
	public String toString() {
		return "\nConfiguracion COMLETA Portatil"+"\nNombre= " + getNombre()+"\nModelo= " + getModelo()+" \nNucleos del Procesador= " + nucleos + "\nMemoria Ram= " + memoriaRam + "\nDisco Duro= " + discoDuro
				+ "\nMemoria Grafica de Video= " + memoriaVideo+ "\nPad Mouse= " + PadMouse + "\nMaleta Portatil= " + Morral + "\nBase Refrigerante= " + BaseRefrigerante+"\nValor= " + getValor()+" Dolares";
	}
	
	public String resumenParcialEtapa2() {
		return "\nConfiguracion PARCIAL Portatil"+" \nNucleos del Procesador= " + nucleos + "\nMemoria Ram= " + memoriaRam + "\nDisco Duro= " + discoDuro
				+ "\nMemoria Video= " + memoriaVideo+"\nValor = " + getValor()+" Dolares";
	}
	
	
	

}
