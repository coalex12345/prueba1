package circulo;

public class Testcirculobueno {

	public static void main(String[] args) {
		////instanciamos el objeto invocanco a un constructor de la clase
		Circulo miCirculo = new Circulo();
		System.out.println(miCirculo.getRadio());
		miCirculo.setRadio(10);
		System.out.println(miCirculo.getRadio());
		System.out.println("El área del círculo es " + miCirculo.calcularSuperficie());
		Circulo tuCirculo = new Circulo(miCirculo);
		System.out.println("El área del círculo es " + tuCirculo.calcularSuperficie());
	}

}