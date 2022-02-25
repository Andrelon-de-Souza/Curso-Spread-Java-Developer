package Exercicio;

import java.util.Optional;

public class ExemploOptionalEstados {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("Valor presente");

        System.out.println("Valor optional que está presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não eiste presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("Valor optional que não está presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Null = não está presente"));

        Optional<String> emptyOptional = Optional.empty();

        System.out.println("Valor optional que não está presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Empty = não está presente"));

        Optional<String> optionalNullErro = Optional.of(null);

        System.out.println("Valor optional que lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("Erro = não está presente"));


    }
}
