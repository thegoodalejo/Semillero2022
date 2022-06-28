package cafe;

import java.util.Scanner;

public class Cafe {
	
	private String TamanoVaso;
	private int palito;
	private int azucar;
	private int servir;
	private int precio;
	private int agua;
	private int cafe;
	

	public Cafe(String tamanoVaso, int palito, int azucar, int servir, int precio, int agua, int cafe) {
		super();
		TamanoVaso = tamanoVaso;
		this.palito = palito;
		this.azucar = azucar;
		this.servir = servir;
		this.precio = precio;
		this.agua = agua;
		this.cafe = cafe;
	}
	

	public String escogerVaso() {
		
		int opcion=0;
		String tamano="";
		Scanner leer=new Scanner(System.in);
		do {
		System.out.println("Ecoge el Tamaño del Vaso");
        System.out.println("1 - Grande");
        System.out.println("2 - Pequeño");
        
        opcion=leer.nextInt();
        
        if (opcion==1) {
        	tamano="Grande";
        }
        else 
            if (opcion==2) {
            tamano="Pequeño";
        }
        
        }while(opcion>2 || opcion<0);
       return tamano;
	}
	
	public int escogerPalito() {
		
		int opcion=0;
		int palito=0;;
		Scanner leer=new Scanner(System.in);
		do {
		System.out.println("¿Necesitas pitillo para revolver ? ");
        System.out.println("1 - SI");
        System.out.println("2 - NO");
        
        opcion=leer.nextInt();
        
        if (opcion==1) {
        	palito=1;
        }
        else 
            if (opcion==2) {
            	palito=0;
        }
        
        }while(opcion>2 || opcion<0);
       return palito;
	}
	
	public int escogerAzucar() {
		
		int opcion=0;
		int azucar=0;;
		Scanner leer=new Scanner(System.in);
		do {
		System.out.println("¿Con Azucar ? ");
        System.out.println("1 - SI");
        System.out.println("2 - NO");
        
        opcion=leer.nextInt();
        
        if (opcion==1) {
        	azucar=1;
        }
        else 
            if (opcion==2) {
            	azucar=0;
        }
        
        }while(opcion>2 || opcion<0);
       return azucar;
	}
	
	public int escogerServicio() {
		
		int opcion=0;
		int servicio=0;;
		Scanner leer=new Scanner(System.in);
		do {
		System.out.println("¿Recipiente para llevar ? ");
        System.out.println("1 - SI");
        System.out.println("2 - NO");
        
        opcion=leer.nextInt();
        
        if (opcion==1) {
        	servicio=1;
        }
        else 
            if (opcion==2) {
            	servicio=0;
        }
        
        }while(opcion>2 || opcion<0);
       return servicio;
	}
	
	public int getCafe() {
		return cafe;
	}
	public void setCafe(int cafe) {
		this.cafe = cafe;
	}
	public int getAgua() {
		return agua;
	}
	public void setAgua(int agua) {
		this.agua = agua;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getTamanoVaso() {
		return TamanoVaso;
	}
	public void setTamanoVaso(String tamanoVaso) {
		TamanoVaso = tamanoVaso;
	}
	public int getPalito() {
		return palito;
	}
	public void setPalito(int palito) {
		this.palito = palito;
	}
	public int getAzucar() {
		return azucar;
	}
	public void setAzucar(int azucar) {
		this.azucar = azucar;
	}
	public int getServir() {
		return servir;
	}
	public void setServir(int servir) {
		this.servir = servir;
	}




	@Override
	public String toString() {
		return "Cafe [TamanoVaso=" + TamanoVaso + ", palito=" + palito + ", azucar=" + azucar + ", servir=" + servir
				+ ", precio=" + precio + ", agua=" + agua + ", cafe=" + cafe + "]";
	}
	
	

}
