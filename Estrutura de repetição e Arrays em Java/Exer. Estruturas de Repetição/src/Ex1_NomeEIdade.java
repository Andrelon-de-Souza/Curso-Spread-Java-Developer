import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {

            System.out.println("Nome: ");
            nome = entrada.next();
            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = entrada.nextInt();

        }

        System.out.println("Continua aqui...");

    }
}
