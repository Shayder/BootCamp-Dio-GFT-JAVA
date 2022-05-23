package Exercicios_Estruturas_de_Repetição_e_Arrays_em_Java;

import java.util.Scanner;

public class Ex4_ParEImpar {
	public static void main(String[] args) {

		parImpar();
	}

	public static void parImpar() {
		try (Scanner scan = new Scanner(System.in)) {

			int qtdNumeros;
			int numero;
			int qtdPar = 0;
			int qtdImpar = 0;

			System.out.println("Digite a quantidade de números: ");
			qtdNumeros = scan.nextInt();

			int count = 0;
			do {
				System.out.println("Número: ");
				numero = scan.nextInt();

				if (numero % 2 == 0)
					qtdPar++;
				else
					qtdImpar++;

				count++;
			} while (count < qtdNumeros);

			System.out.println("Quantidade de números Pares: " + qtdPar);
			System.out.println("Quantidade de números Ímpares: " + qtdImpar);

		}

	}

}
