import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantNumero;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de Números: ");
        quantNumero = entrada.nextInt();

        int i = 0;

        do{

            System.out.println("Número: ");
            numero = entrada.nextInt();

            if(numero % 2 == 0) quantPares++;
            else quantImpares++;

            i++;

        } while(i < quantNumero);

        System.out.println("Quantidade Pares: " + quantPares);
        System.out.println("Quantidade Impares: " + quantImpares);

    }
}
