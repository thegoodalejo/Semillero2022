package practicaHerencia;

public class Test {

	public static void main(String[] args) {
		
		
		Motocicleta moto1 = new Motocicleta("hre123", 2006, 130);
		Motocicleta moto2 = new Motocicleta("hre124", 2007, 135);
		Motocicleta moto3 = new Motocicleta("hre126", 2008, 150);
		Automovil automovil = new Automovil("qwe345", 2019, 125000);
		Automovil automovil2 = new Automovil("qwe346", 2015, 160000);
		Automovil automovil3 = new Automovil("qwe347", 2020, 80000);
		Automovil automovil4 = new Automovil("qwe348", 2017, 140000);
		
		
		Parqueadero parqueadero = new Parqueadero();
		
		parqueadero.agregarVehiculo(moto1);
		parqueadero.agregarVehiculo(moto2);
		parqueadero.agregarVehiculo(moto3);
		parqueadero.agregarVehiculo(automovil);
		parqueadero.agregarVehiculo(automovil2);
		parqueadero.agregarVehiculo(automovil3);
		parqueadero.agregarVehiculo(automovil4);

	}

}
