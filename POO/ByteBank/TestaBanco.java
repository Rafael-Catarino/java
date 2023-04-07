public class TestaBanco {
  public static void main(String[] args) {
    Cliente paulo = new Cliente();
    paulo.setNome("Paulo Silveira");
    paulo.setCpf("222.222.222-22");
    paulo.setProfissao("programador");

    System.out.println(paulo.getNome());
    System.out.println(paulo.getCpf());
    System.out.println(paulo.getProfissao());

    Conta contaDoPaulo = new Conta(1337,24226);
    contaDoPaulo.deposita(100);
    System.out.println(contaDoPaulo.getSaldo());

    contaDoPaulo.titular = paulo;  
    System.out.println(paulo);
    System.out.println(contaDoPaulo.getTitular().getNome());

  }
}
