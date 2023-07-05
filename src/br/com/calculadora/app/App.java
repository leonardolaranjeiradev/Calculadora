
package br.com.calculadora.app;

import java.util.Scanner;

import br.com.calculadora.models.Calculos;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Perguntando pro usuario

		System.out.println("Qual tipo de calculo você deseja realizar?");

		System.out.println("  +      -      /      *  ");

		// Escolha de operacao

		String operador = sc.next();

		int a = sc.nextInt();
		int b = sc.nextInt();

		Calculos operacao = new Calculos();

		if (operador.equals("+")) {
			System.out.println(operacao.adicao(a, b));
		} else if (operador.equals("-")) {
			System.out.println(operacao.subtracao(a, b));
		} else if (operador.equals("/")) {
			System.out.println(operacao.divisao(a, b));
		} else {
			System.out.println(operacao.multiplicacao(a, b));
		}

		sc.close();

	}

}
