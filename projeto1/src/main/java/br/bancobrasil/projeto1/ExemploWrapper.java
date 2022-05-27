package br.bancobrasil.projeto1;

public class ExemploWrapper {

    public static void main(String[] args) {
        Integer i = Integer.valueOf("1");
        Double d = Double.parseDouble("1.0");
        Float f = Float.parseFloat("1.0");
        Character c = Character.valueOf('A');
        Boolean b = Boolean.FALSE;
        Byte by = Byte.valueOf("s", Character.MAX_RADIX);

        //Inicializar com string
        String texto1 = "Texto em string";
        // Inicializar com new
        String texto2 = new String("Texto em string");
        // Inicializar com array de character
        char[] textoArray = {'T','e','x','t','o',' ','e','m',' ','s','t','r','i','n','g'};
        String texto3 = new String(textoArray);

        System.out.println("Com String: " + texto1);
        System.out.println("Com New: " + texto2);
        System.out.println("Com array: " + texto3);
    }

}
