package fabrica;

public class ComputadorMesa extends Equipo{
	//Atributos
	//------------------------------------------------------------------------------------------------------------------------------------
	private int nucleos;
	private int memoriaRam;
	private int discoDuro;
	private int memoriaVideo=0;
	private int pantalla=0;
	private int kitMouseTeclado=0;
	private int webCam=0;	
	
	//Constructores
	//------------------------------------------------------------------------------------------------------------------------------------
	public ComputadorMesa(String nombre, String modelo) {
		super(nombre, modelo);

	}
	
	//Metodos 
	//------------------------------------------------------------------------------------------------------------------------------------	
	
	public int getPantalla() {
		return pantalla;
	}

	public void setPantalla(int pantalla) {
		this.pantalla = pantalla;
	}

	public int getKitMouseTeclado() {
		return kitMouseTeclado;
	}

	public void setKitMouseTeclado(int kitMouseTeclado) {
		this.kitMouseTeclado = kitMouseTeclado;
	}

	public int getWebCam() {
		return webCam;
	}

	public void setWebCam(int webCam) {
		this.webCam = webCam;
	}

	public ComputadorMesa() {
		super();
		// TODO Auto-generated constructor stub
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
		return "\nConfiguracion COMLETA Computador de Mesa"+"\nNombre= " + getNombre()+"\nModelo= " + getModelo()+" \nNucleos del Procesador= "+ nucleos + "\nMemoria Ram= " + memoriaRam + "\nDisco Duro= " + discoDuro
				+ "\nMemoria Grafica de Video= " + memoriaVideo + "\npantalla= " + pantalla + "\nkitMouseTeclado= " + kitMouseTeclado
				+ "\nwebCam= " + webCam +"\nValor= " + getValor()+" Dolares";
	}
	

	public String resumenParcialEtapa2PC() {
		return "\nConfiguracion PARCIAL Computador de Mesa"+" \nNucleos del Procesador= "+ nucleos + "\nMemoria Ram= " + memoriaRam + "\nDisco Duro= " + discoDuro
				+ "\nMemoria Grafica de Video= " + memoriaVideo +"\nValor= " + getValor()+" Dolares";
	}

}
