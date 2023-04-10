public class Programa {
  public static void main(String[] args) {
    Bola bola1 = new Bola();
    bola1.setCor("black");
    bola1.setMaterial("plastico");
    bola1.setCircunferencia(3.14);

    System.out.println(bola1.getCor());
    System.out.println(bola1.getMaterial());
    System.out.println(bola1.getCircunferencia());
  }
}
