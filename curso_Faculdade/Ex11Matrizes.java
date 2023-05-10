import java.security.SecureRandom;
import java.sql.SQLOutput;

public class Ex11Matrizes {
    public static void main(String[] args) {
        final int linhas = 3;
        final int colunas = 5;
        int [][] numeros = new int [linhas][colunas];
        /* int [][] num = {{10, 20, 30, 40, 50}, {1, 2, 3, 4, 5}, {100, 200, 300, 400, 500}}; Outra forma
        de declarar uma matriz. */

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                numeros[l][c] =new SecureRandom().nextInt(100);
            }
        }

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                System.out.printf("%2d - ", numeros[l][c]);
            }
            System.out.println("\n");
        }

        System.out.println("\n");

        for(int[] l:numeros){
            for(int c:l){
                System.out.printf("%2d | ", c);
            }
            System.out.println("\n");
        }
    }
}
