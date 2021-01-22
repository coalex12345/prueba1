package vehiculosEJ7_herencia_polimorfismo;

public class Coche extends Vehiculos {
	
	private int numPasajeros;
	
	public Coche(int ruedas, int autonomia, int pasajeros) {
		super(ruedas, autonomia);
		this.numPasajeros = pasajeros;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	////////////////////////////////////////////////
	public void verDatos() {
		super.verDatos();
		System.out.println( "el numero de pasajeros es "+numPasajeros);
	}
}
