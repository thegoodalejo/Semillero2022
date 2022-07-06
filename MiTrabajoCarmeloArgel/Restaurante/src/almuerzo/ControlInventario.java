package almuerzo;

public class ControlInventario {

	int cantidadInventario;
	Inventario inventario = new Inventario();
	
	public void controlInventario(String opcion, int cantidad) {
		//System.out.println(inventario.getCarne()+"Estoooooooooo");
		if (opcion.equals(inventario.getCarne())) {
			if (cantidad>=5 && cantidad>=inventario.getCantidadCarne()) {
				cantidadInventario = inventario.getCantidadCarne()- cantidad;
				inventario.setCantidadCarne(cantidadInventario);
			} if (cantidad>inventario.getCantidadCarne()) {
				System.out.println("Estamos abasteciendo porciones de tu solicitud");
				inventario.setCantidadCarne(inventario.getCantidadCarne()+3);				
			}
		}
		
		//System.out.println(inventario.getCerdo()+"Estoooooooooo");
		if (opcion.equals("porcion de cerdo asado")) {
			if (cantidad>=5 && cantidad>=inventario.getCantidadCerdo()) {
				cantidadInventario = inventario.getCantidadCerdo()-cantidad;
				inventario.setCantidadCerdo(cantidadInventario);
			} if (cantidad>inventario.getCantidadCerdo()) {
				System.out.println("Estamos abasteciendo porciones de tu solicitud");
				inventario.setCantidadCerdo(inventario.getCantidadCerdo()+3);				
			}
		}
		
		//System.out.println(inventario.getPollo()+"Estoooooooooo");
		if (opcion.equals(inventario.getPollo())) {
			if (cantidad>=5 && cantidad>=inventario.getCantidadPollo()) {
				cantidadInventario = inventario.getCantidadPollo()-cantidad;
				inventario.setCantidadPollo(cantidadInventario);
			} if (cantidad>inventario.getCantidadPollo()) {
				System.out.println("Estamos abasteciendo porciones de tu solicitud");
				inventario.setCantidadPollo(inventario.getCantidadPollo()+3);				
			}
		}
		
	}
}
