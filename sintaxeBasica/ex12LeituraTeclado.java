import java.util.Scanner;

public class ex12LeituraTeclado {
    public static void main(String[] args) {
        Scanner filme = new Scanner(System.in);

        System.out.println("Informe o nome do filme: ");
        String nome= filme.nextLine();

        System.out.println("Informe o ano do filme: ");
        int ano = filme.nextInt();

        String result;
        System.out.println("Qual a sua avaliação para o filme? Digite [1]Ruim [2]Razoavel [3]Bom [4]Ótimo:");
        int avaliacao = filme.nextInt();
        if(avaliacao == 1) {
            result = "Ruim";
        } else if (avaliacao == 2) {
            result = "Razoavel";
        } else if (avaliacao == 3) {
            result = "Bom";
        } else {
            result = "Ótimo";
        }

        System.out.printf("""
                Filme: %s
                Ano: %d
                Avaliação: %s
                """,nome, ano, result);
    }
}
