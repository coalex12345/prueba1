package vehiculosEJ7_herencia_polimorfismo;

public class Camion extends Vehiculos {

	private int limiteCarga;

	public Camion(int ruedas, int autonomia, int limiteCarga) {
		super(ruedas, autonomia);
		this.limiteCarga = limiteCarga;
	}

	public int getLimiteCarga() {
		return limiteCarga;
	}

	public void setLimiteCarga(int limiteCarga) {
		this.limiteCarga = limiteCarga;
	}
	////////////////////////////////
	
	public void verDatos() {
		
		super.verDatos();
		System.out.println("el limite de carga es "+limiteCarga+" kg");
	}
	
	
	
	
	
}
