public class CriaConta {
  public static void main(String[] args) {
    
    Conta primeiraConta = new Conta();
    primeiraConta.saldo = 200;
    System.out.println(primeiraConta.saldo);

    primeiraConta.saldo += 100;
    System.out.println(primeiraConta.saldo);
  
    Conta segundaConta = new Conta();
    segundaConta.saldo = 50;
    System.out.println(segundaConta.saldo);

    System.out.println(primeiraConta.agencia);
    System.out.println(primeiraConta.numero);
    System.out.println(primeiraConta.titular);

    Conta contaDaMarcela = new Conta();
    contaDaMarcela.deposita(1000);

    if(contaDaMarcela.transfere(3000, primeiraConta)) {
      System.out.println("Transfrencia realisada com sucesso.");
    } else {
      System.out.println("Saldo insuficiente.");
    }
    System.out.println(primeiraConta.saldo);
    System.out.println(contaDaMarcela.saldo);
    contaDaMarcela.titular = "Macela";
    System.out.println(contaDaMarcela.titular);

  }  
}