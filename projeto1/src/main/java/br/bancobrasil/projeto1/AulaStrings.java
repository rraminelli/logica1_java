package br.bancobrasil.projeto1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class AulaStrings {

    public static void main(String[] args) {

        //System.out.println(str.substring(0, 3));

        /*String strA = "String A";
        String strB = strA + " String B";

        strB = strB.concat("");

        strB += " outro valor";*/

        /*StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("String A");
        stringBuilder.append("String B");
        System.out.println(stringBuilder);*/

        String str = "Texto;para;a;String";

        String[] strSplit = str.split(";");

        /*for (String value : strSplit) {

        }

        List<String> list = List.of("A", "B");
        list.forEach(s -> System.out.println(s));

        for (int i=0; i<strSplit.length; i++) {
            System.out.println(strSplit[i]);
        }*/

        StringTokenizer st = new StringTokenizer(str, ";");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        //String[] strArray = new String[]{"A","B","C"};
        List<String> list = List.of("A", "B");
        String result = String.join(",", list);
        System.out.println(result);

        char c = 'A';
        int i = 1;

        System.out.println(c+i);

    }

}
