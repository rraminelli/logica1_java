package br.bancobrasil.projeto1;

import java.util.Scanner;

public class Correcao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        boolean finalizou = false;
        double precoProdutoBarato = Double.MAX_VALUE, precoProdutoCaro = 0.0;
        String nomeProdutoBarato = "", nomeProdutoCaro = "";

        while(!finalizou) {
            System.out.println("Digite 1 para adicionar produto ou 2 para sair.");
            int opcao = Integer.parseInt(scanner.nextLine());
            if(opcao == 1) {
                System.out.println("Digite o nome do produto.");
                String nomeAuxiliar = scanner.nextLine();
                System.out.println("Digite o preço do produto.");
                double precoAuxiliar = Double.parseDouble(scanner.nextLine());
                if(precoAuxiliar > precoProdutoCaro) {
                    precoProdutoCaro = precoAuxiliar;
                    nomeProdutoCaro = nomeAuxiliar;
                }
                if(precoAuxiliar < precoProdutoBarato) {
                    precoProdutoBarato = precoAuxiliar;
                    nomeProdutoBarato = nomeAuxiliar;
                }
                i++;
            } else {
                if (opcao == 2) {
                    finalizou = true;
                } else {
                    System.out.println("Digite uma opção válida.");
                }
            }
        }
        if(i > 0) {
            System.out.println("O produto mais caro é: " + nomeProdutoCaro + " no valor de " + precoProdutoCaro);
            System.out.println("O produto mais barato é: " + nomeProdutoBarato + " no valor de " + precoProdutoBarato);
        } else {
            System.out.println("Não foram registrados produtos.");
        }
    }

}
