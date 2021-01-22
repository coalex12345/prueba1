package vehiculosEJ7_herencia_polimorfismo;

public class TestVehiculo {

	public static void main(String[] args) {
		//creamos un camion
		Camion camion1 = new Camion(8,200,3500);
		camion1.verDatos();
		//creamos coche
		Coche coche1 = new Coche(4,600,5);
		coche1.verDatos();

	}

}
