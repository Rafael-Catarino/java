import java.util.Arrays;

public class Ex10Array2 {
    public static void main(String[] args) {
        int tam = 10;
        int [] num = {6,1,4,2,7,9,8,3,5,0};
        int [] numeros = new int[tam];
        int n = 5;

        Arrays.sort(num); // Ordena um array.
        Arrays.fill(numeros, 10); // Preenche todo o array com o valor que eu passar de parametro.
        System.arraycopy(num,0, numeros,0, tam); // Copia um array para outro array.
        System.out.printf("Arrays são iguais: %s\n",Arrays.equals(num, numeros) ? "SIM" : "NÃO"); //Compara 2 arrays

        System.out.printf("O número %d está no array? %s\n",n,Arrays.binarySearch(num,n) > 0 ? "Sim" : "Não");
        // Retorna um valor positivo se o numero estiver no array e um negativo caso não esteja.

        for(int i : numeros){ /* For utilizado para emprimir os números de um Array*/
            System.out.println(i);
        }
    }
}
