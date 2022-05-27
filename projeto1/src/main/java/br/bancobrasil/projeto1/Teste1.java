package br.bancobrasil.projeto1;

import java.util.Date;
import java.util.Scanner;

public class Teste1 {

    static int idade = 0;

    public static void main(String[] args) {

        Integer intValor = Integer.valueOf("100");
        System.out.println(intValor);

        String nome = "X";
        nome = "Y";

        String nome1 = nome;
        nome = "X";

        String endereco = "";

        var scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        idade = scanner.nextInt();

        System.out.print("Digite o endereço: ");
        scanner.nextLine();
        endereco = scanner.nextLine();

        StringBuilder nomeBuilder = new StringBuilder(nome);
        nomeBuilder.append(" Idade: ");
        nomeBuilder.append(getIdade());

        imprimirValor("Ola " + nome);
        imprimirValor(nomeBuilder.toString());
        imprimirValor("Endereço: " + endereco);


        Integer valorTeste = null;
        if (1==1 && valorTeste == 0) {
            System.out.println();
        }

        if (idade > 18) {
            imprimirValor("Adulto");
        } else if (idade <= 18 && idade > 12) {
            imprimirValor("Adolescente");
        } else {
            imprimirValor("Criança");
        }

    }
    static int getIdade() {
        return idade;
    }

    static void imprimirValor(String valor) {
        System.out.println(valor);
    }

}
