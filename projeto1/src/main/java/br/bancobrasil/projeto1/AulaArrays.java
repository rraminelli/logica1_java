package br.bancobrasil.projeto1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AulaArrays {

    public static void main(String[] args) {

        int[] valores = new int[]{1,2,3};

        int[] valores2 = new int[5];
        /*for (int value : valores2) {
            System.out.println(value);
        }*/

        int[] valores3 = {1,2,3};

        /*String[] arrayString = new String[5];
        for (String str : arrayString) {
            System.out.println(str);
        }*/

        /*Integer[] valoresInt = new Integer[5];
        for (int i=0;i<5; i++) {
            valoresInt[i] = i;
        }
        Integer[] valoresIntNovo = Arrays.copyOf(valoresInt, 10);
        for (Integer value : valoresIntNovo) {
            System.out.println(value);
        }*/

        String[] nomes =
                new String[]{"Jose", "Antonio", "Pedro", "Bernardo"};

        /*Arrays.parallelSort(nomes);
        for (String nome : nomes) {
            System.out.println(nome);
        }*/

        Comparator<String> comparador = new Comparator<String>() {
            @Override
            public int compare(String nome1, String nome2) {
                System.out.printf(
                        "Nome1: %s Nome2: %s compareTo: %d",
                        nome1, nome2, nome2.compareTo(nome1));

                return nome2.compareTo(nome1);
            }
        };

        Arrays.sort(nomes, comparador);

        System.out.println("=======");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);

        System.out.println(nomes[5]);


        for (int i=0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        List<String> nomesToList1 = Arrays.asList(nomes); //mutavel

        List<String> nomesToList = List.of(nomes); //imutavel



    }

}
