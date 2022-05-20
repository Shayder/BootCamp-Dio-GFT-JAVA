package entendendoMetodos;

public class calculadora {

	public static void somar(double numero1, double numero2) {
		double resultado = numero1 + numero2;
		System.out.println("O resultado de " + numero1 + " + " + numero2 + " é: " + resultado);
	}
	
	public static void subtrair(double numero1, double numero2) {
		double resultado = numero1 - numero2;
		System.out.println("O resultado de " + numero1 + " - " + numero2 + " é: " + resultado);
	}
	
	public static void multiplicar(double numero1, double numero2) {
		double resultado = numero1 * numero2;
		System.out.println("O resultado de " + numero1 + " * " + numero2 + " é: " + resultado);
	}
	
	public static void dividir(double numero1, double numero2) {
		double resultado = numero1 / numero2;
		System.out.println("O resultado de " + numero1 + " / " + numero2 + " é: " + resultado);
	}
}
