package parqueadero;

public class Main {

	public static void main(String[] args) {
		
		Automovil automovil1 = new Automovil("ABC135","Mazda","Mazda3");
		Automovil automovil2 = new Automovil("DEF321","Chevrolet","Sail");
		Automovil automovil3 = new Automovil("HIJ579","Renault","Sandero");
		
		Motocicleta motocicleta1  = new Motocicleta("ABC12D","Yamaha","Crypton");
		Motocicleta motocicleta2  = new Motocicleta("ZUN22D","KEEWAY","Kee");
		
		
		ParqueaderoAutomoviles parqueaderoauto1 = new ParqueaderoAutomoviles(1,30);
		ParqueaderoMotocicletas parqueaderomoto1 = new ParqueaderoMotocicletas(2,10);
		
		parqueaderoauto1.ingresarVehiculo(automovil1);
		parqueaderoauto1.ingresarVehiculo(automovil2);
		parqueaderoauto1.ingresarVehiculo(automovil3);
		
		parqueaderomoto1.ingresarVehiculo(motocicleta1);
		parqueaderomoto1.ingresarVehiculo(motocicleta2);
		
		
		parqueaderoauto1.resumenParqueadero();
		parqueaderomoto1.resumenParqueadero();
	}
	

}
