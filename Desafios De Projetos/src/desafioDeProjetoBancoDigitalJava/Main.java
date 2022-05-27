package desafioDeProjetoBancoDigitalJava;

import java.util.*;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {

		Cliente shayder = new Cliente();
		shayder.setNome("Shayder");
		
		Conta cc = new ContaCorrente(shayder);
		Conta poupanca = new ContaPoupanca(shayder);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		cc.depositar(100);
		cc.imprimirExtrato();

		cc.transferir(50, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
