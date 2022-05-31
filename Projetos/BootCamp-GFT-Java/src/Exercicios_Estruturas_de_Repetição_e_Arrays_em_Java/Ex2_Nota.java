package Exercicios_Estruturas_de_Repetição_e_Arrays_em_Java;

import java.util.Scanner;

public class Ex2_Nota {
	public static void main(String[] args) {
		nota();
	}

	public static void nota() {
		try (Scanner scan = new Scanner(System.in)) {

			int nota;

			System.out.println("Nota: ");
			nota = scan.nextInt();

			if (nota >= 0 && nota <= 10)
				System.out.println("Nota atribuida");

			while (nota < 0 || nota > 10) {
				System.out.println("Nota Inv�lida! Digite novamente: ");
				nota = scan.nextInt();

				if (nota >= 0 && nota <= 10)
					System.out.println("Nota atribuida");

			}

		}
	}
}
