package br.com.caelum.ed.conjuntos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();
        conjunto.adiciona("Rafael");
        conjunto.adiciona("Ana");
        conjunto.adiciona("Paulo");
        List<String> palavras = conjunto.pegaTodas();
        System.out.println("antes de remover");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
        conjunto.remove("Rafael");

        palavras = conjunto.pegaTodas();
        System.out.println("depois de remover");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
        System.out.println("Verifica se contém Rafael.");
        System.out.println(conjunto.contem("Rafael"));
        System.out.println("Verifica se contém Ana.");
        System.out.println(conjunto.contem("Ana"));
    }
}
