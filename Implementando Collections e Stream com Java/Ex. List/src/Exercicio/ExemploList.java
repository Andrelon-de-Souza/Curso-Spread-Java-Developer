package Exercicio;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Cleide");
        nomes.add("Jeisa");
        nomes.add("Andrelon");
        nomes.add("Francielle");
        nomes.add("Francisco");

        System.out.println(nomes);

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        nomes.remove("Wesley");

        System.out.println(nomes);

        String nome = nomes.get(3);

        System.out.println(nome);

        int posicao = nomes.indexOf("Wesley");

        System.out.println(posicao);

        int tamanho = nomes.size();

        System.out.println(tamanho);

        nomes.remove("Larissa");

        tamanho = nomes.size();

        System.out.println(tamanho);

        boolean temAndrelon = nomes.contains("Andrelon");

        System.out.println(temAndrelon);

        boolean temJeisa = nomes.contains("Jeisa");

        System.out.println(temJeisa);

        boolean listaVazia = nomes.isEmpty();

        System.out.println(listaVazia);

        for(String nomeDoItem: nomes){
            System.out.println("--> " + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while(iterator.hasNext()){
            System.out.println("----> " + iterator.next());
        }

        nomes.clear();

        listaVazia = nomes.isEmpty();

        System.out.println(listaVazia);



    }

}
