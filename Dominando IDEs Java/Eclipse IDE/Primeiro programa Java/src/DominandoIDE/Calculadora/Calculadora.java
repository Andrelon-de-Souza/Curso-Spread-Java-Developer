package DominandoIDE.Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Double a, b;
		
		System.out.println("Digite o primeiro valor:");
		a = entrada.nextDouble();
		System.out.println("Digite o segundo valor:");
		b = entrada.nextDouble();
		
		Double soma = soma(a, b);
		Double subtracao = subtracao(a, b);
		Double multiplicacao = multiplicacao(a, b);
		Double divisao = divisao(a, b);
		
		System.out.println("Soma:" + soma);
		System.out.println("Subtração:" + subtracao);
		System.out.println("Multiplicação:" + multiplicacao);
		System.out.println("Divisão:" + divisao);
		
		entrada.close();
		
	}
	
	public static Double soma(Double a,Double b) {
		
		return a + b;
		
	}
	public static Double subtracao(Double a,Double b) {
		
		return a - b;
		
	}
	public static Double divisao(Double a,Double b) {
		
		return a / b;
		
	}
	public static Double multiplicacao(Double a,Double b) {
		
		return a * b;
		
	}

}