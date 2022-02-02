import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = entrada.nextInt();

        while(nota < 0 || nota > 10) {

            System.out.println("Nota Inválida! digite novamente: ");

            nota = entrada.nextInt();

        }

    }
}
