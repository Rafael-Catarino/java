public class Ex13Metodos_Funcoes {
    public static void main(String[] args){
        double media = calculaMedia(9.9, 8, 9.5, 3.9);
        imprimir("Estou aprendendo Java");
        System.out.printf("%.2f",media);
    }

    public static void imprimir(String frase) {
        System.out.println(frase);
    }

    public static double calculaMedia(double... num) {
        double media=0;
        for(double n:num) {
            media += n / num.length;
        }
        return media;
    }
}
