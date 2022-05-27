package br.bancobrasil.projeto1;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestePalindromo {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

        System.out.println("Palavra:");
        String palavra = sc.nextLine();

        String[] ary = palavra.split("");
        List<String> list = Arrays.asList(ary);
        Collections.reverse(list);
        String palindromo = String.join("", list);

        System.out.println(palindromo);

        System.out.print(palindromo.equalsIgnoreCase(palavra) ? "É palíndromo!" : "Não é palíndromo!");*/

        System.out.println(checaPalindromo("Arara"));



    }

    public static boolean checaPalindromo(String palavra){
        palavra = palavra.toLowerCase();

        String parte1 = palavra.substring(0, (int)Math.floor(palavra.length()/2f));
        String parte2 = palavra.substring((int)Math.ceil(palavra.length()/2f));

        for(int i = 0; i < parte1.length(); i++){
            if(parte1.charAt(i) != parte2.charAt(parte2.length() - i - 1)){
                return false;
            }
        }

        return true;
    }


}
