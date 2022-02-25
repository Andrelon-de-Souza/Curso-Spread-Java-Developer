package Exercicio1;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "00000000";

        Cliente cliente = new Cliente();

        try{
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");

        }catch(Exception e){
            System.out.println("Houve um erro ao adicionar endereco: " + e.getMessage());
        }



    }
}
