package Exercicios_Estruturas_de_Repetição_e_Arrays_em_Java;

import java.util.Scanner;

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {
		media();

	}

	public static void media() {
		try (Scanner scan = new Scanner(System.in)) {

			int numero;
			int maior = 0;
			int soma = 0;
			int count = 0;

			do {
				System.out.println("Digite um n�mero: ");
				numero = scan.nextInt();

				soma += numero;

				if (numero > maior)
					maior = numero;

				count++;
			} while (count < 5);

			System.out.println("Maior: " + maior);
			System.out.println("M�dia: " + (soma / 5));
		}
	}
}
