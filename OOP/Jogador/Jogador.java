public class Jogador {
  private int num = 0;  // Sempre optar por criar atributos como private.
  private int vidas = 0;

  public Jogador(int num, int vidas ) {
    this.num = num;
    this.vidas = vidas;
    System.out.printf("Jogador %d criado tem %d vidas.\n",num, vidas);
  }
}
