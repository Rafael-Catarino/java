public class ProgramaJogador {
  public static void main(String[] args) {
    int count = 0;
    Jogador j1 = new Jogador(++count);
    Jogador j2 = new Jogador(++count);
    Jogador j3 = new Jogador(++count);

    j1.addVidas();
    j1.addVidas();
    j1.addVidas();
    j1.addVidas();
    j2.addVidas();
    j3.addVidas();
    System.out.printf("O numero de vidas do jagador 1 é: %d\n", j1.getVidas());
    System.out.printf("O numero de vidas do jagador 2 é: %d\n", j2.getVidas());
    System.out.printf("O numero de vidas do jagador 3 é: %d\n", j3.getVidas());

    /* j1.num = 10;
    j2.num = 5;
    System.out.println(j1.num);
    System.out.println(j2.num); */
  }
}
