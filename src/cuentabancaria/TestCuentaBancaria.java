package cuentabancaria;

public class TestCuentaBancaria {

	public static void main(String[] args) {
		
		Cuenta_bancaria MiCuenta = new Cuenta_bancaria();
		System.out.println("el saldo es "+MiCuenta.getSaldo());
		System.out.println("el titular es "+MiCuenta.getTitular());
		System.out.println("el numero de cuenta es "+MiCuenta.getNumero());
		MiCuenta.Retirar(50);
		System.out.println("tu cuenta se queda en "+MiCuenta.getSaldo());
		MiCuenta.Ingresar(100);
		System.out.println("tu cuenta se queda en "+MiCuenta.getSaldo());
			
		
		
		
		
		
		
		
		
		
	}

}
