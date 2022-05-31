package Exercicios_Estruturas_de_Repetição_e_Arrays_em_Java;

import java.util.Scanner;

public class Ex5_Tabuada {
	public static void main(String[] args) {
		tabuada();
	}

	public static void tabuada() {
		try (Scanner scan = new Scanner(System.in)) {

			System.out.println("Digite o n�mero que deseja obter a tabuada: ");
			int tabuada = scan.nextInt();

			System.out.println("Tabuada de " + tabuada);

			for (int i = 1; i <= 10; i++) {
				System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
			}

		}

	}

}
