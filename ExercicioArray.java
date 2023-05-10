import java.util.Scanner;

public class ExercicioArray {
    public static void main(String[] args) {
        final int tam = 5;
        char[] gabarito = {'a', 'a', 'd', 'b', 'c'};
        char[] respostas = new char[tam];
        int nota = 10;
        Scanner respAluno = new Scanner(System.in);
        for(int i = 0; i < tam; i ++){
            System.out.printf("Informe a %d resposta do aluno: ",i+1);
            respostas[i] = respAluno.nextLine().charAt(0); //Lendo um caractere do tipo char.
        }

        for(int i = 0; i < respostas.length; i++){
            if (gabarito[i] != respostas[i]) {
                nota -= 1;
            }
        }

        System.out.println(nota);
    }
}
