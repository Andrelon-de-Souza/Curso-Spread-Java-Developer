import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int soma = 0;
        int maior = 0;
        int i = 0;

        do{

            System.out.println("Número: ");
            numero = entrada.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;

            i++;

        } while(i < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma / 5);

    }
}
