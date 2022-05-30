package br.bancobrasil.projeto1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AulaMaps {

    public static void main(String[] args) {

        /*Map<String, String> map1 = Map.of(
            "chave1", "valor1",
            "chave2", "valor2"
        );*/

        Map<String, String> map1 = new LinkedHashMap<>(); //ou HashMap
        map1.put("chave1", "valor1");
        map1.put("chave2", "valor2");
        map1.put("chave3", null);
        map1.put(null, null);

        map1.put("chave10", "valor1-A");

        map1.containsKey("chave1");

        //map1.remove("chave1");
        //map1.put("chave10", "valor1");

        //map1.remove("chave1", "xx");

        for (String chave : map1.keySet()) {
            System.out.println(chave+"-"+ map1.get(chave) );
        }

        String valor = map1.get("chave1");



    }

}
