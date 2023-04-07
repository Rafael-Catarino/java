public class TestaContaSencliente {
  public static void main(String[] args){
    Conta contaDaMarcela = new Conta(1337,24226);
    System.out.println(contaDaMarcela.getSaldo());

    contaDaMarcela.titular = new Cliente();
    System.out.println(contaDaMarcela.titular);
    contaDaMarcela.getTitular().setNome("Marcela");
    System.out.println(contaDaMarcela.getTitular().getNome());
  }
}
