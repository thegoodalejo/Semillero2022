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

		//
		
		Ensamble ensamble = new Ensamble(1,3,"Ensamble de equipos Gama Alta",5);
		Testeo testeo = new Testeo(5,4,"Testeo de equipos Gama Alta",3);
		
		
		
		System.out.println("");
		System.out.println("*******************************Ingreso de equipos al Area de ENSAMBLE*******************************");
		ensamble.ingresar(consola1);
		ensamble.ingresar(consola2);
		ensamble.ingresar(celular1);
		ensamble.ingresar(consola4);
		ensamble.ingresar(consola5);
		ensamble.ingresar(celular3);
		ensamble.ingresar(celular2);
		System.out.println("");
		System.out.println("*******************************Ingreso de equipos al Area de TESTEO*******************************");
		testeo.ingresar(consola1);
		testeo.ingresar(celular1);
		testeo.ingresar(celular2);
		testeo.ingresar(celular1);
		testeo.ingresar(consola5);
		
		System.out.println("");
		System.out.println("*******************************Proceso Actual de Ensamble*******************************");
		ensamble.enProceso();
		
		System.out.println("");
		System.out.println("*******************************Proceso Actual de Testeo*******************************");
		testeo.enProceso();
		
	}

}
