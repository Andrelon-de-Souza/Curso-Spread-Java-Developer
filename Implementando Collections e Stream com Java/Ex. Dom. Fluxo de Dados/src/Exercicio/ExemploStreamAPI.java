package Exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();

        estudantes.add("Andrelon");
        estudantes.add("Gabrielly");
        estudantes.add("Francisco");
        estudantes.add("Cleide");
        estudantes.add("Jeisa");
        estudantes.add("Francielle");
        estudantes.add("José");

        System.out.println("Contagem: " + estudantes.stream().count());

        System.out.println("Maior número de letra: " + estudantes.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Menor número de letra: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("Com a letra r no nome: " + estudantes.stream().filter((estudante) ->
        estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        System.out.println("Todos os elementos tem o W no nome? " + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        System.out.println("Tem algum elemento com a minúscula no nome? " + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        System.out.println("Não tem nenhum elemento com a minúscula no nome? " + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                                .peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
                .collect(Collectors.toList()));
                //.collect(Collectors.joining(", ")));
                //.collect(Collectors.toSet()));
                //.collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));

    }
}
