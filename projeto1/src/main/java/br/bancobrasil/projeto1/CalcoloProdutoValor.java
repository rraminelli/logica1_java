package br.bancobrasil.projeto1;

import java.util.Locale;
import java.util.Scanner;

public class CalcoloProdutoValor {

    public static void main(String[] args) {

        double valorMenor = 0;
        String produtoValorMenor = "";

        double valorMaior = 0;
        String produtoValorMaior = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o produto e o valor separados por virgula, exemplo: arroz,4.55");

        while (true) {
            String produtoValorDigitado = scanner.nextLine();
            if (produtoValorDigitado.isEmpty()) {
                break;
            }

            String[] produtoValor = produtoValorDigitado.split(",");

            String produto = produtoValor[0];
            double valor = Double.parseDouble(produtoValor[1]);

            if (valorMenor == 0 || valor < valorMenor) {
                valorMenor = valor;
                produtoValorMenor = produto;
            }

            if (valor > valorMaior) {
                valorMaior = valor;
                produtoValorMaior = produto;
            }

        }

        System.out.println("Resultado:");
        System.out.printf("Produto mais barato: %s - R$ %.2f", produtoValorMenor, valorMenor);
        System.out.printf("\nProduto mais caro: %s - R$ %.2f", produtoValorMaior, valorMaior);

    }


}
