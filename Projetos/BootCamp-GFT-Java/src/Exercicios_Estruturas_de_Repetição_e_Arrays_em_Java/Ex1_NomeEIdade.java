package Exercicios_Estruturas_de_Repetição_e_Arrays_em_Java;

import java.util.Scanner;

public class Ex1_NomeEIdade {

	public static void armazenarNomeIdade() {
		try (Scanner scan = new Scanner(System.in)) {
			;

			String nome;
			int idade;

			while (true) {
				System.out.println("Digite seu nome: ");
				nome = scan.next();
				if (nome.equals("0"))
					break;

				System.out.println("Digite sua Idade: ");
				idade = scan.nextInt();
				if (idade == 0)
					break;
			}

			System.out.println("Programa encerrado!");
		}
	
	}

	public static void main(String[] args) {

		System.out.println("Digite '0' quando desejar encerrar o programa");

		armazenarNomeIdade();
	}

}
