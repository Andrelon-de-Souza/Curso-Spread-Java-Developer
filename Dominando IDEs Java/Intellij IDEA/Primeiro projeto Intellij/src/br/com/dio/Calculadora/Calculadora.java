package br.com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double a, b;

        System.out.println("Digite o primeiro valor:");
        a = entrada.nextInt();
        System.out.println("Digite o segundo valor:");
        b = entrada.nextInt();

        double somar = somar(a, b);
        double subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("Soma:" + somar);
        System.out.println("Subt:" + subtrair);
        System.out.println("Multi:" + multiplicar);
        System.out.println("Div:" + dividir);

    }

    public static double somar(double a, double b){
        return a + b;

    }
    public static double subtrair(double a, double b){
        return a - b;

    }
    public static double multiplicar(double a, double b){
        return a * b;

    }
    public static double dividir(double a, double b){
        return a / b;

    }

}
