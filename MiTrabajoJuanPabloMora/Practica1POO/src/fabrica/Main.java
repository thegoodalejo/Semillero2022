package fabrica;

public class Main {

	public static void main(String[] args) {
		
		Consola consola1 = new Consola("PS5 DIGITAL","SO005",51248,0);
		Consola consola2 = new Consola("XBOX SERIE X","MI001",2215,1);
		Consola consola3 = new Consola("NINTENDO SWITCH ","NI0054",002514,0);
		Consola consola4 = new Consola("PS5","SO005L",51248,3);
		Consola consola5 = new Consola("NINTENDO SWITCH LITE ","NI0054",002544,1);
		
		Celular celular1=new Celular("SONY X","S25",3000,5);
		Celular celular2=new Celular("SAMSUNG","SUMG10",10101,6);
		Celular celular3=new Celular("IPHONE 11","APL11",33254,7);
		
		
		System.out.println("*******************************CONSOLAS*******************************");
		consola1.verCaracteristicas();
		consola2.verCaracteristicas();
		consola3.verCaracteristicas();
		consola4.verCaracteristicas();
		consola5.verCaracteristicas();
		System.out.println("");
		System.out.println("*******************************CELULARES*******************************");
		celular1.verCaracteristicas();
		celular2.verCaracteristicas();
		celular3.verCaracteristicas();

	}

}
