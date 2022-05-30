package br.bancobrasil.projeto1;

import java.util.*;

public class AulaColletionsSet {

    public static void main(String[] args) {

        List<String> arrayList = new LinkedList<>(); //ou ArrayList
        arrayList.add("ValorZ");
        arrayList.add("ValorS");
        arrayList.add("ValorC");
        arrayList.add("ValorA");
        arrayList.add("ValorA");
        arrayList.add("ValorC");
        System.out.println("Lista - ArrayList");
        for (String nome : arrayList) {
            System.out.println(nome);
        }

        Set<String> setLista = new LinkedHashSet<>(); //ou HashSet
        setLista.add("ValorZ");
        setLista.add("ValorS");
        setLista.add("ValorC");
        setLista.add("ValorA");
        setLista.add("ValorA");
        setLista.add("ValorC");
        System.out.println("Lista - HashSet");
        for (String nome : setLista) {
            System.out.println(nome);
        }

        setLista.remove("ValorC");

        for (String nome : setLista) {
            setLista.remove(nome);
        }


    }

}
