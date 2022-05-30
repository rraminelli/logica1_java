package br.bancobrasil.projeto1;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class AulaFormatString {

    public static void main(String[] args) {

        String strEncode = new String("Valor".getBytes(StandardCharsets.UTF_8));

        String strFormat = "Nome: %s, Valor: %.2f";
        String stringResultado =
                String.format(new Locale("pt", "BR"), strFormat, "Rodrigo", 23.55333);

        System.out.println(stringResultado);

    }

}
