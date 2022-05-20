package entendendoMetodos;

public class Main {

	public static void main(String[] args) {
		
		//Calculadora
		System.out.println("Exercício calculadora");
		calculadora.somar(3,6);
		calculadora.subtrair(9,1.8);
		calculadora.multiplicar(7,8);
		calculadora.dividir(5,2.5);
		
		//Mensagem
		System.out.println("Exercício obter Mensagem");
		mensagem.obterMensagem(9);
		mensagem.obterMensagem(14);
		mensagem.obterMensagem(1);
		
		//Empréstimo
		emprestimo.calcular(1000, emprestimo.getDuasParcelas());
		emprestimo.calcular(1000, emprestimo.getTresParcelas());
		emprestimo.calcular(1000, 5);


	}

}
