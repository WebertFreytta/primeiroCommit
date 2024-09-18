package minhaPrimeiraCalculadora;

public class Calculadora {

	public static void main(String[] args) {
		// SOMA = +
		// SUBTRACAO = -
		// DIVISAO = /
		// MULTIPLICACAO = *
		
		

		EngrenagemDaCalculadora eg = new EngrenagemDaCalculadora();
		eg.soma(100, 5);
		eg.multiplicacao(15, 10);
		eg.divisao(100, 2);
		eg.subtracao(45, 10);
	}

}
