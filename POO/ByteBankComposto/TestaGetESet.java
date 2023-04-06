public class TestaGetESet {
  public static void main(String[] args) {
    Conta conta = new Conta(1337,24226);
    //conta.numero = 1337;

    conta.setNumero(1337);
    System.out.println(conta.getNumero());
  
    conta.setAgencia(7938429);
    System.out.println(conta.getAgencia());

    Cliente rafael = new Cliente();
    rafael.setNome("Rafael");
    rafael.setCpf("87426894653568");
    rafael.setProfissao("Programador");

    System.out.println(rafael.getNome());
    System.out.println(rafael.getCpf());
    System.out.println(rafael.getProfissao());

    conta.setTitular(rafael);
    System.out.println(conta.getTitular().getNome());
  }
}
