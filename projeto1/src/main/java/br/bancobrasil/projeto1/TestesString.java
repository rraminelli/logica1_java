package br.bancobrasil.projeto1;

public class TestesString {

    public static void main(String[] args) {

        String valor = "O produto %s custa R$ %.2f";

        System.out.println(String.format(valor, "Arroz", 5.43));



    }

}
