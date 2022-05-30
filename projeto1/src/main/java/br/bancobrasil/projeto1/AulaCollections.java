package br.bancobrasil.projeto1;

import java.util.*;

public class AulaCollections {

    public static void main(String[] args) {

        //EVITAR!!
        /*List lista1 = new ArrayList();
        lista1.add("A");
        lista1.add(2);
        lista1.add(new Date());

        for (Object obj : lista1) {
            if (obj instanceof String) {
                String valorString = (String) obj;
                System.out.println("String: " + valorString);
            }
        }*/

        List<String> arrayList = new ArrayList<>();
        arrayList.add("ValorZ");
        arrayList.add("ValorS");
        arrayList.add("ValorC");
        arrayList.add("ValorA");
        arrayList.add("ValorA");
        arrayList.add("ValorC");

        arrayList.set(2, "VALOR_X");

        arrayList.remove(1);

        int posicao = arrayList.indexOf("ValorZ");
        System.out.println("Posicao valorZ: " + posicao);


        //String valor = arrayList.get(3);

        Collections.sort(arrayList);

        for (String valor : arrayList) {
            System.out.println(valor);
        }

        List<String> novaLista = List.copyOf(arrayList);
        //novaLista.add("novo valor"); - ERRO

    }

}
