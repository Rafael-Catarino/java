public class Metodos {
  public static void main(String[] args) {
    Conta conta = new Conta();
    conta.deposita(300);
    System.out.println(conta.saldo);

    String resp = conta.saca(700);
    System.out.println(resp);
    System.out.println("Saldo da conta: " + conta.saldo);
  }
}
