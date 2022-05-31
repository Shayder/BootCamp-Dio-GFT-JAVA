package Exercicios_Estruturas_de_Repetição_e_Arrays_em_Java;

import java.util.Scanner;

public class Ex6_Fatorial {
	public static void main(String[] args) {
		fatorial();
	}

	public static void fatorial() {
		try (Scanner scan = new Scanner(System.in)) {

			System.out.println("Digite um numero: ");
			int fatorial = scan.nextInt();

			int multiplicacao = 1;

			System.out.print(fatorial + "! = ");
			for (int i = fatorial; i >= 1; i--) {
				multiplicacao = multiplicacao * i;
			}

			System.out.println(multiplicacao);
		}

	}

}
