package cuentabancaria;

public class cuentabancariaejemplo {

	private String numCuenta;
	private String nomTitular;
	private float saldo;
	private float interes;
	public cuentabancariaejemplo(String numCuenta, String nomTitular, float saldo, float interes) {

		this.numCuenta = numCuenta;
		this.nomTitular = nomTitular;
		this.saldo = saldo;
		this.interes = interes;
																									}
	
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	public String getNomTitular() {
		return nomTitular;
	}
	public void setNomTitular(String nomTitular) {
		this.nomTitular = nomTitular;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public float getInteres() {
		return interes;
	}
	public void setInteres(float interes) {
		this.interes = interes;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
}
