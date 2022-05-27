package br.bancobrasil.projeto1;

import java.util.Scanner;

public class TesteMediaAluno {

    /*
    *   Exercício: Crie um programa que calcule a média de um aluno para uma determinada matéria.
        Entrada:
	        - Nome do aluno
	        - 4 notas da matéria
    * */
    public static void main(String[] args) {

        String nome;
        double nota1;
        double nota2;
        double nota3;
        double nota4;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        nome = scanner.nextLine();

        System.out.print("Nota 1: ");
        nota1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nota 2: ");
        nota2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nota 3: ");
        nota3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nota 4: ");
        nota4 = scanner.nextDouble();
        scanner.nextLine();

        double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println(nome + " a sua media é: " + mediaNotas);
    }

}
