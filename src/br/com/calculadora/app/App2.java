package br.com.calculadora.app;

import br.com.calculadora.models.Calculos;

public class App2 {

	public static void main(String[] args) {

		Calculos operacao = new Calculos();

		// Criando array1

		int[] a = { 1, 34, 24, 4, 65 };

		// Criando array2

		int[] b = { 2, 5, 6, 12, 0 };

		// Operacoes

		for (int i = 0; i < b.length; i++) {
			System.out.println("\n" + i + "\nAdicao: " + operacao.adicao(a[i], b[i]));
			System.out.println("Subtracao: " + operacao.subtracao(a[i], b[i]));
			System.out.println("Divisao: " + operacao.divisao(a[i], b[i]));
			System.out.println("Multiplicacao: " + operacao.multiplicacao(a[i], b[i]));

		}

	}

}
