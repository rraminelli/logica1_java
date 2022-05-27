package br.bancobrasil.projeto1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class TesteMediaAluno2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double count = 0;

        double notas = 0;
        String notaLinha = "";
        while (!(notaLinha = scanner.nextLine()).isEmpty()) {
            notas += Double.parseDouble(notaLinha);
            count++;
        }

        double mediaNotas = notas/count;

        NumberFormat numberFormat = new DecimalFormat("0.##");

        System.out.println("Media = " + numberFormat.format(mediaNotas));

    }

}
