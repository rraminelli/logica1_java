package br.bancobrasil.projeto1;

public class AulaArrays2 {

    public static void main(String... args) {

        int[][] valores = new int[5][3];

        //Linha 1, coluna 1
        valores[0][0] = 0;
        //Linha 1, coluna 2
        valores[0][1] = 1;
        //Linha 1, coluna 3
        valores[0][2] = 2;

        //Linha 2, Coluna 1
        valores[1][0] = 0;
        //Linha 2, Coluna 2
        valores[1][1] = 1;
        //Linha 2, Coluna 3
        valores[1][2] = 2;

        for (int i=0; i< valores.length; i++) {
            for (int j=0; j<valores[i].length; j++) {
                System.out.printf("Linha: %d Coluna: %d Valor: %d \n",
                        i, j, valores[i][j]);
            }
        }

    }


}
