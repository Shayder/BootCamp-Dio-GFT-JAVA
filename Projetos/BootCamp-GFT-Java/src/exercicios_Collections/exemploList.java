package exercicios_Collections;

import java.util.ArrayList;
import java.util.List;

public class exemploList {

	public static void main(String[] args) {

		System.out.println("Crie uma lista e adicione as sete notas: ");

		List<Double> notas = new ArrayList<Double>();
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);

		System.out.println(notas.toString());

		System.out.println("Exiba a posi��o da nota 5.0: " + "Posi��o = " + notas.indexOf(5.0));

		System.out.println("Adiciona na lista a nota 8.0 na posi��o 4: ");
		notas.add(4, 8.0);
		System.out.println(notas.toString());
		
		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		notas.set(notas.indexOf(5.0), 6.0);
		System.out.println(notas.toString());
		
		System.out.println("Confira se a nota 5.0 est� na lista: " + notas.contains(5.0));
		
		
		
		
		
	}

}
