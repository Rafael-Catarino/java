class Conta {
  private double saldo;
  private int agencia;
  private int numero;
  Cliente titular;
  private static int total;

  public Conta(int agencia, int numero) {
    Conta.total++;
    System.out.println("O total da contas é: " + Conta.total);
    this.agencia = agencia;
    this.numero = numero;
    System.out.println("Estou criando uma conta " + this.numero);
  }

  public void deposita(double valor) {
    this.saldo = this.saldo + valor;
  }

  public String saca(double valor) {
    if (this.saldo >= valor) {
      this.saldo = this.saldo - valor;
      return "Saque efetuado com sucesso.";
    } else {
      return "Sua conta não tem saldo suficiente.";
    }
  }

  public boolean transfere(double valor, Conta destino) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      destino.deposita(valor);
      return true;
    }
    return false;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    if(numero <=0 ){
      System.out.println("Nao pode valor <= 0");
      return;
    }
    this.numero = numero;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public void setAgencia(int agencia) {
    if(agencia > 0){
      this.agencia = agencia;
    } else {
      System.out.println("Nao pode valores menores que 0");
    }
    
  }

  public Cliente getTitular() {
    return this.titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public static int getTotal() {
    return Conta.total;
  }
}

