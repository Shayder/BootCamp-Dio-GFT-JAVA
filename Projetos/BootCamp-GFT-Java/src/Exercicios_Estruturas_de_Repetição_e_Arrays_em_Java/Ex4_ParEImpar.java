package Exercicios_Estruturas_de_Repeti��o_e_Arrays_em_Java;

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

			System.out.println("Digite a quantidade de n�meros: ");
			qtdNumeros = scan.nextInt();

			int count = 0;
			do {
				System.out.println("N�mero: ");
				numero = scan.nextInt();

				if (numero % 2 == 0)
					qtdPar++;
				else
					qtdImpar++;

				count++;
			} while (count < qtdNumeros);

			System.out.println("Quantidade de n�meros Pares: " + qtdPar);
			System.out.println("Quantidade de n�meros �mpares: " + qtdImpar);

		}

	}

}
