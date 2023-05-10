public class Jogador {
  private final int maxVidas = 3;
  private int num = 0;  // Sempre optar por criar atributos como private.
  private int vidas = 0;

  public Jogador(int num) {
    this.num = num;
    this.vidas = 0;
    System.out.printf("Jogador %d foi criado.\n",num);
  }

  public int getVidas() {
    return vidas;
  }

  /* public void setVidas(int vidas) {
    if(vidas > maxVidas) {
      this.vidas = maxVidas;
    } else if (vidas < 0) {
      this.vidas = 0;
    } else {
      this.vidas = vidas;
    }
    
  } */

  public void addVidas() {
    if(this.vidas < maxVidas){
      this.vidas++;
    }
  }
}
