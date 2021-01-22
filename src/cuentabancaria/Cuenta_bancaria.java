package cuentabancaria;
import java.util.Scanner;
public class Cuenta_bancaria {
	///////datos
	private String nombre_titular;
	private int numero_cuenta;
	private String tipo_interes;
	private float saldo;
	/////////constructor
	public Cuenta_bancaria() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("dime el nombre del titular");
		nombre_titular = s.nextLine();
		System.out.println("dime el numero de cuenta");
		numero_cuenta = s.nextInt();
		System.out.println("dime el tipo de interes que tiene la cuenta");
		tipo_interes = s.nextLine();
		System.out.println("dime el saldo que tiene la cuenta");
		saldo = s.nextFloat();
		
								}
	
	public Cuenta_bancaria(String nombre, int numero,String tipo, float saldo) {
		
		this.nombre_titular = nombre;
		this.numero_cuenta = numero;
		this.tipo_interes = tipo;
		this.saldo = saldo;
				
																				}
	
	
	public float getSaldo() {
		return saldo;	
							}
	public float Ingresar(float i) {
		if (i<=0) {
			System.out.println("no puedes ingresar esa cantidad");
			return saldo;
		}
		System.out.println("has ingresado "+i+" tu saldo queda en: ");
		return saldo = saldo+i;
									}
	
	public float Retirar(float i) {
		if (i > this.saldo) {
			System.out.println("Error, no puedes sacar mas dinero del que tienes");
			return saldo;
							}
		else if (i <= 0) {
			System.out.println("no puedes retirar esa cantidad");
			return saldo;
					}
		else {
		System.out.println("vas a retirar "+i+" tu saldo queda en: ");
		return saldo = saldo-i;
			}
	}
	
	public int getNumero() {
		return numero_cuenta;
							}
	public void setNumero(int i) {
		this.numero_cuenta = i;
		
									}
	public String getTitular() {
		return nombre_titular;
								}
	public void setTitular(String a) {
		this.nombre_titular = a;
										}
	
	
	
	
	
}
