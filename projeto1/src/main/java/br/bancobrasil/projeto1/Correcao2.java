package br.bancobrasil.projeto1;

import java.util.Scanner;

public class Correcao2 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(ePalindromo(input));



    }

    public static boolean ePalindromo(String palavra) {
        palavra = palavra.toLowerCase();

        for(int i=0; i<palavra.length()/2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }


}
