package br.bancobrasil.projeto1;

public class Teste2 {

    static String nome = "Joao Antonio Santos";

    public static void main(String[] args) {

        int idade = 15;

        /*if (idade > 18) {
            imprimirValor("Adulto");
        } else if (idade <= 18 && idade > 12) {
            imprimirValor("Adolescente");
        } else {
            imprimirValor("Criança");
        }*/


        String nome2 = new String("Joao Antonio Santos");

        if (nome.equals(nome2)) {
            System.out.println("iguais - string");
        }

        Integer valor1 = 1554880;
        Integer valor2 = 1554880;

        if (valor1.equals(valor2)) {
            System.out.println("iguais - int");
        }

    }

    static void imprimirValor(String valor) {
        System.out.println(valor);
    }

}
