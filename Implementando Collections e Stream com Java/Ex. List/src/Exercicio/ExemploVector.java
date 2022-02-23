package Exercicio;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {

        List<String> esportes = new Vector<>();

        esportes.add("Futebol");
        esportes.add("Volei");
        esportes.add("Handebol");
        esportes.add("Basquete");

        System.out.println(esportes);

        esportes.set(2, "Tenis de Mesa");

        esportes.remove(2);

        esportes.remove("Volei");

        System.out.println(esportes);

        System.out.println(esportes.get(0));

        for(String esporte : esportes){
            System.out.println(esporte);
        }

    }
}
