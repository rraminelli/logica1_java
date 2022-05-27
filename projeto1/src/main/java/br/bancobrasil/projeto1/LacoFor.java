package br.bancobrasil.projeto1;

import java.util.List;

public class LacoFor {

    public static void main(String[] args) {

        String[] stringArray = new String[]{"A","B", "C"};
        String[] stringArray2 = new String[]{"C","D"};

        primeiroFor : for (String str1 : stringArray) {
            for (String str2 : stringArray2) {
                if (str2.equals("C")) {
                    break primeiroFor;
                }
            }
        }

        //....

        String str1 = "A";
        String str2 = new String("A");

        Integer valueInt1 = 123456;
        Integer valueInt2 = Integer.valueOf(123456);

        System.out.println("Value 1 = " + valueInt1);
        System.out.println("Value 2 = " + valueInt2);

        System.out.println(valueInt1 == valueInt2);
        System.out.println(valueInt1.equals(valueInt2));

    }

}
