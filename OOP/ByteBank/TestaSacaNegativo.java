public class TestaSacaNegativo {
  public static void main(String[] args){
    Conta conta = new Conta(1337,24226);
    conta.deposita(100);
    conta.saca(200);
    System.out.println(conta.saca(101));
    //System.out.println(conta.saldo);

    //conta.saldo = conta.saldo - 101;
    System.out.println(conta.getSaldo());
    conta.setAgencia(-50);
    conta.setNumero(-340);

    System.out.println(conta.getAgencia());

    Conta conta1 = new Conta(1337,2156);

    Conta conta2 = new Conta(1223,9734);

    System.out.println(Conta.getTotal());
  }
}
